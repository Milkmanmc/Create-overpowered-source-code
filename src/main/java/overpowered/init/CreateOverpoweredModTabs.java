
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package overpowered.init;

import overpowered.CreateOverpoweredMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class CreateOverpoweredModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateOverpoweredMod.MODID);
	public static final RegistryObject<CreativeModeTab> CREATE_OVERPOWERED = REGISTRY.register("create_overpowered",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.create_overpowered.create_overpowered")).icon(() -> new ItemStack(CreateOverpoweredModItems.ROUGH_DIAMOND.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreateOverpoweredModBlocks.MORAISNORE.get().asItem());
				tabData.accept(CreateOverpoweredModItems.MORAISN_CRYSTAL.get());
				tabData.accept(CreateOverpoweredModItems.STICKY_MORAISN_COATING.get());
				tabData.accept(CreateOverpoweredModItems.MORAISN_COATED_NETHERTIE_UPGRADE_SMITHING_TEMPLATE.get());
				tabData.accept(CreateOverpoweredModItems.MORAISN_COUTED_NETHERITE_ARMOR_HELMET.get());
				tabData.accept(CreateOverpoweredModItems.MORAISN_COUTED_NETHERITE_ARMOR_CHESTPLATE.get());
				tabData.accept(CreateOverpoweredModItems.MORAISN_COUTED_NETHERITE_ARMOR_LEGGINGS.get());
				tabData.accept(CreateOverpoweredModItems.MORAISN_COUTED_NETHERITE_ARMOR_BOOTS.get());
				tabData.accept(CreateOverpoweredModItems.MORAISN_COATED_NETHERITE_SWORD.get());
				tabData.accept(CreateOverpoweredModItems.MORAISN_COATED_NETHERITE_AXE.get());
				tabData.accept(CreateOverpoweredModItems.MORAISN_COATED_NETHERITE_PICKAXE.get());
				tabData.accept(CreateOverpoweredModItems.MORAISN_COATED_NETHERITE_SHOVEL.get());
				tabData.accept(CreateOverpoweredModItems.MORAISN_COATED_NETHERITE_HOE.get());
				tabData.accept(CreateOverpoweredModItems.ROUGH_DIAMOND.get());
				tabData.accept(CreateOverpoweredModItems.STALE_REDSTONE_POWDER.get());
				tabData.accept(CreateOverpoweredModItems.NETHERITE_SCRAP_NUGGET.get());
				tabData.accept(CreateOverpoweredModItems.BLAZE_PASTE_BUCKET.get());
				tabData.accept(CreateOverpoweredModItems.HYPER_ENCHANTED_GOLDEN_APPLE.get());
				tabData.accept(CreateOverpoweredModItems.THE_LAST_FIGHT.get());
			})

					.build());
}
