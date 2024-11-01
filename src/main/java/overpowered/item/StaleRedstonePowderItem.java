
package overpowered.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StaleRedstonePowderItem extends Item {
	public StaleRedstonePowderItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
