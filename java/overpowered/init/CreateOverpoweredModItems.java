
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package overpowered.init;

import overpowered.item.ThehyperenchantedcoutingnetheritearmorItem;
import overpowered.item.TheLastFightItem;
import overpowered.item.StickyHyperenchantedcoatingItem;
import overpowered.item.StaleRedstonePowderItem;
import overpowered.item.RoughDiamondItem;
import overpowered.item.NetheritescrapnuggetItem;
import overpowered.item.MoraisncrystalItem;
import overpowered.item.HyperenchantedgoldenappleItem;
import overpowered.item.HyperenchantcoatednethertieupgradesmithingtemplateItem;
import overpowered.item.HyperenchantcoatednetheriteswordItem;
import overpowered.item.HyperenchantcoatednetheritepickaxeItem;
import overpowered.item.HyperenchantcoatednetheritehoeItem;
import overpowered.item.HyperenchantcoatednetheriteaxeItem;
import overpowered.item.HyperenchantcoatednetherieshovelItem;
import overpowered.item.BlazepasteItem;

import overpowered.CreateOverpoweredMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class CreateOverpoweredModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateOverpoweredMod.MODID);
	public static final RegistryObject<Item> ROUGH_DIAMOND = REGISTRY.register("rough_diamond", () -> new RoughDiamondItem());
	public static final RegistryObject<Item> STALE_REDSTONE_POWDER = REGISTRY.register("stale_redstone_powder", () -> new StaleRedstonePowderItem());
	public static final RegistryObject<Item> NETHERITE_SCRAP_NUGGET = REGISTRY.register("netherite_scrap_nugget", () -> new NetheritescrapnuggetItem());
	public static final RegistryObject<Item> BLAZE_PASTE_BUCKET = REGISTRY.register("blaze_paste_bucket", () -> new BlazepasteItem());
	public static final RegistryObject<Item> THE_LAST_FIGHT = REGISTRY.register("the_last_fight", () -> new TheLastFightItem());
	public static final RegistryObject<Item> HYPER_ENCHANTED_GOLDEN_APPLE = REGISTRY.register("hyper_enchanted_golden_apple", () -> new HyperenchantedgoldenappleItem());
	public static final RegistryObject<Item> STICKY_MORAISN_COATING = REGISTRY.register("sticky_moraisn_coating", () -> new StickyHyperenchantedcoatingItem());
	public static final RegistryObject<Item> MORAISN_COUTED_NETHERITE_ARMOR_HELMET = REGISTRY.register("moraisn_couted_netherite_armor_helmet", () -> new ThehyperenchantedcoutingnetheritearmorItem.Helmet());
	public static final RegistryObject<Item> MORAISN_COUTED_NETHERITE_ARMOR_CHESTPLATE = REGISTRY.register("moraisn_couted_netherite_armor_chestplate", () -> new ThehyperenchantedcoutingnetheritearmorItem.Chestplate());
	public static final RegistryObject<Item> MORAISN_COUTED_NETHERITE_ARMOR_LEGGINGS = REGISTRY.register("moraisn_couted_netherite_armor_leggings", () -> new ThehyperenchantedcoutingnetheritearmorItem.Leggings());
	public static final RegistryObject<Item> MORAISN_COUTED_NETHERITE_ARMOR_BOOTS = REGISTRY.register("moraisn_couted_netherite_armor_boots", () -> new ThehyperenchantedcoutingnetheritearmorItem.Boots());
	public static final RegistryObject<Item> MORAISN_COATED_NETHERTIE_UPGRADE_SMITHING_TEMPLATE = REGISTRY.register("moraisn_coated_nethertie_upgrade_smithing_template", () -> new HyperenchantcoatednethertieupgradesmithingtemplateItem());
	public static final RegistryObject<Item> MORAISN_COATED_NETHERITE_AXE = REGISTRY.register("moraisn_coated_netherite_axe", () -> new HyperenchantcoatednetheriteaxeItem());
	public static final RegistryObject<Item> MORAISN_COATED_NETHERITE_SWORD = REGISTRY.register("moraisn_coated_netherite_sword", () -> new HyperenchantcoatednetheriteswordItem());
	public static final RegistryObject<Item> MORAISN_COATED_NETHERITE_SHOVEL = REGISTRY.register("moraisn_coated_netherite_shovel", () -> new HyperenchantcoatednetherieshovelItem());
	public static final RegistryObject<Item> MORAISN_COATED_NETHERITE_HOE = REGISTRY.register("moraisn_coated_netherite_hoe", () -> new HyperenchantcoatednetheritehoeItem());
	public static final RegistryObject<Item> MORAISN_COATED_NETHERITE_PICKAXE = REGISTRY.register("moraisn_coated_netherite_pickaxe", () -> new HyperenchantcoatednetheritepickaxeItem());
	public static final RegistryObject<Item> MORAISN_CRYSTAL = REGISTRY.register("moraisn_crystal", () -> new MoraisncrystalItem());
	public static final RegistryObject<Item> MORAISNORE = block(CreateOverpoweredModBlocks.MORAISNORE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
