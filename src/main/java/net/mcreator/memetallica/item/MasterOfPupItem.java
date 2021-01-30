
package net.mcreator.memetallica.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.memetallica.itemgroup.MetalCraftItemGroup;
import net.mcreator.memetallica.MemetallicaModElements;

@MemetallicaModElements.ModElement.Tag
public class MasterOfPupItem extends MemetallicaModElements.ModElement {
	@ObjectHolder("memetallica:master_of_pup")
	public static final Item block = null;
	public MasterOfPupItem(MemetallicaModElements instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MemetallicaModElements.sounds.get(new ResourceLocation("memetallica:masterofpuppies")),
					new Item.Properties().group(MetalCraftItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("master_of_pup");
		}
	}
}
