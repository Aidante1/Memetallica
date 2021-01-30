
package net.mcreator.memetallica.item;

@MemetallicaModElements.ModElement.Tag
public class DeathMetalItem extends MemetallicaModElements.ModElement {

	@ObjectHolder("memetallica:death_metal")
	public static final Item block = null;

	public DeathMetalItem(MemetallicaModElements instance) {
		super(instance, 2);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("death_metal");
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
