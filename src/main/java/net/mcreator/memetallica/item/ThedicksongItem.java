
package net.mcreator.memetallica.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import net.mcreator.memetallica.itemgroup.MetalCraftItemGroup;
import net.mcreator.memetallica.MemetallicaModElements;

@MemetallicaModElements.ModElement.Tag
public class ThedicksongItem extends MemetallicaModElements.ModElement {
	@ObjectHolder("memetallica:thedicksong")
	public static final Item block = null;
	public ThedicksongItem(MemetallicaModElements instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MemetallicaModElements.sounds.get(new ResourceLocation("memetallica:thedicksonga")),
					new Item.Properties().group(MetalCraftItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("thedicksong");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
