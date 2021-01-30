
package net.mcreator.memetallica.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.memetallica.MemetallicaModElements;

@MemetallicaModElements.ModElement.Tag
public class VulgardisplayPainting extends MemetallicaModElements.ModElement {
	public VulgardisplayPainting(MemetallicaModElements instance) {
		super(instance, 56);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(32, 32).setRegistryName("vulgardisplay"));
	}
}
