
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package overpowered.init;

import overpowered.block.MoraisnoreBlock;
import overpowered.block.BlazepasteBlock;

import overpowered.CreateOverpoweredMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class CreateOverpoweredModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateOverpoweredMod.MODID);
	public static final RegistryObject<Block> BLAZE_PASTE = REGISTRY.register("blaze_paste", () -> new BlazepasteBlock());
	public static final RegistryObject<Block> MORAISNORE = REGISTRY.register("moraisnore", () -> new MoraisnoreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
