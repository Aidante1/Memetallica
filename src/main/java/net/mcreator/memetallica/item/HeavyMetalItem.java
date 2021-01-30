
package net.mcreator.memetallica.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.memetallica.itemgroup.MetalCraftItemGroup;
import net.mcreator.memetallica.MemetallicaModElements;

@MemetallicaModElements.ModElement.Tag
public class HeavyMetalItem extends MemetallicaModElements.ModElement {
	@ObjectHolder("memetallica:heavy_metal")
	public static final Item block = null;
	public HeavyMetalItem(MemetallicaModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MetalCraftItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("heavy_metal");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
