
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package overpowered.init;

import overpowered.fluid.types.BlazepasteFluidType;

import overpowered.CreateOverpoweredMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

public class CreateOverpoweredModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateOverpoweredMod.MODID);
	public static final RegistryObject<FluidType> BLAZE_PASTE_TYPE = REGISTRY.register("blaze_paste", () -> new BlazepasteFluidType());
}
