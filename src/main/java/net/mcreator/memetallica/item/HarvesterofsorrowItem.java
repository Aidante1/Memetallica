
package net.mcreator.memetallica.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;
import net.minecraft.entity.LivingEntity;

import net.mcreator.memetallica.procedures.StangerfistLivingEntityIsHitWithItemProcedure;
import net.mcreator.memetallica.itemgroup.MetalCraftItemGroup;
import net.mcreator.memetallica.MemetallicaModElements;

import java.util.Map;
import java.util.HashMap;

@MemetallicaModElements.ModElement.Tag
public class HarvesterofsorrowItem extends MemetallicaModElements.ModElement {
	@ObjectHolder("memetallica:harvesterofsorrow")
	public static final Item block = null;
	public HarvesterofsorrowItem(MemetallicaModElements instance) {
		super(instance, 64);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 432;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(MetalCraftItemGroup.tab)) {
			@Override
			public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
				boolean retval = super.onEntitySwing(itemstack, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					StangerfistLivingEntityIsHitWithItemProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("harvesterofsorrow"));
	}
}
