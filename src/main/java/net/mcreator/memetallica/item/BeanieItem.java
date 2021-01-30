
package net.mcreator.memetallica.item;

@MemetallicaModElements.ModElement.Tag
public class BeanieItem extends MemetallicaModElements.ModElement {

	@ObjectHolder("memetallica:beanie_helmet")
	public static final Item helmet = null;

	@ObjectHolder("memetallica:beanie_chestplate")
	public static final Item body = null;

	@ObjectHolder("memetallica:beanie_leggings")
	public static final Item legs = null;

	@ObjectHolder("memetallica:beanie_boots")
	public static final Item boots = null;

	public BeanieItem(MemetallicaModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{1, 1, 1, 1}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 9;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "beanie";
			}

			public float getToughness() {
				return 0f;
			}
		};

		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "memetallica:textures/models/armor/beanie__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

		}.setRegistryName("beanie_helmet"));

	}

}
