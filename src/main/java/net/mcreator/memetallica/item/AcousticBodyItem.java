
package net.mcreator.memetallica.item;

@MemetallicaModElements.ModElement.Tag
public class AcousticBodyItem extends MemetallicaModElements.ModElement {

	@ObjectHolder("memetallica:acoustic_body")
	public static final Item block = null;

	public AcousticBodyItem(MemetallicaModElements instance) {
		super(instance, 13);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("acoustic_body");
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
