
package net.mcreator.memetallica.item;

@MemetallicaModElements.ModElement.Tag
public class OreoItem extends MemetallicaModElements.ModElement {

	@ObjectHolder("memetallica:oreo")
	public static final Item block = null;

	public OreoItem(MemetallicaModElements instance) {
		super(instance, 68);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f)

							.build()));
			setRegistryName("oreo");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
