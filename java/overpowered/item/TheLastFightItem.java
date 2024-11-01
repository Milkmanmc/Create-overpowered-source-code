
package overpowered.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class TheLastFightItem extends RecordItem {
	public TheLastFightItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_overpowered:the_last_one")), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 6000);
	}
}
