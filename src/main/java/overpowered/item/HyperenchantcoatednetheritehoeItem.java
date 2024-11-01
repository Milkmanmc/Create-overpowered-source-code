
package overpowered.item;

import overpowered.init.CreateOverpoweredModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class HyperenchantcoatednetheritehoeItem extends HoeItem {
	public HyperenchantcoatednetheritehoeItem() {
		super(new Tier() {
			public int getUses() {
				return 5201;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 52;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CreateOverpoweredModItems.STICKY_MORAISN_COATING.get()));
			}
		}, 0, -2.7f, new Item.Properties().fireResistant());
	}
}
