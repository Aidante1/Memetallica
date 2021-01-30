
package net.mcreator.memetallica.item;

@MemetallicaModElements.ModElement.Tag
public class AcousticstalkItem extends MemetallicaModElements.ModElement {

	@ObjectHolder("memetallica:acousticstalk")
	public static final Item block = null;

	public AcousticstalkItem(MemetallicaModElements instance) {
		super(instance, 12);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("acousticstalk");
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
