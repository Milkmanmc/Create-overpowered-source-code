
package overpowered.item;

import overpowered.init.CreateOverpoweredModItems;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public abstract class ThehyperenchantedcoutingnetheritearmorItem extends ArmorItem {
	public ThehyperenchantedcoutingnetheritearmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 230;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{10, 15, 30, 22}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 71;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CreateOverpoweredModItems.STICKY_MORAISN_COATING.get()));
			}

			@Override
			public String getName() {
				return "moraisn_couted_netherite_armor";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, type, properties);
	}

	public static class Helmet extends ThehyperenchantedcoutingnetheritearmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "create_overpowered:textures/models/armor/netherite__layer_1.png";
		}
	}

	public static class Chestplate extends ThehyperenchantedcoutingnetheritearmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "create_overpowered:textures/models/armor/netherite__layer_1.png";
		}
	}

	public static class Leggings extends ThehyperenchantedcoutingnetheritearmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "create_overpowered:textures/models/armor/netherite__layer_2.png";
		}
	}

	public static class Boots extends ThehyperenchantedcoutingnetheritearmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "create_overpowered:textures/models/armor/netherite__layer_1.png";
		}
	}
}
