
package net.mcreator.memetallica.item;

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
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).rarity(Rarity.COMMON));
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
