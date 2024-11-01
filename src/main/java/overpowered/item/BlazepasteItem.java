
package overpowered.item;

import overpowered.init.CreateOverpoweredModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class BlazepasteItem extends BucketItem {
	public BlazepasteItem() {
		super(CreateOverpoweredModFluids.BLAZE_PASTE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.RARE));
	}
}
