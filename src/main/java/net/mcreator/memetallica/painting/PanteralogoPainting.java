
package net.mcreator.memetallica.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.memetallica.MemetallicaModElements;

@MemetallicaModElements.ModElement.Tag
public class PanteralogoPainting extends MemetallicaModElements.ModElement {
	public PanteralogoPainting(MemetallicaModElements instance) {
		super(instance, 57);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(32, 16).setRegistryName("panteralogo"));
	}
}
