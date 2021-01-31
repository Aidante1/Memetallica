
package net.mcreator.memetallica.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.memetallica.itemgroup.MetalCraftItemGroup;
import net.mcreator.memetallica.MemetallicaModElements;

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
				return 2f;
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
		}.setRegistryName("harvesterofsorrow"));
	}
}
