
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package overpowered.init;

import overpowered.CreateOverpoweredMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class CreateOverpoweredModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CreateOverpoweredMod.MODID);
	public static final RegistryObject<SoundEvent> THE_LAST_ONE = REGISTRY.register("the_last_one", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("create_overpowered", "the_last_one")));
}
