
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package overpowered.init;

import overpowered.fluid.BlazepasteFluid;

import overpowered.CreateOverpoweredMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class CreateOverpoweredModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CreateOverpoweredMod.MODID);
	public static final RegistryObject<FlowingFluid> BLAZE_PASTE = REGISTRY.register("blaze_paste", () -> new BlazepasteFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_BLAZE_PASTE = REGISTRY.register("flowing_blaze_paste", () -> new BlazepasteFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(BLAZE_PASTE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BLAZE_PASTE.get(), RenderType.translucent());
		}
	}
}
