
package overpowered.block;

import overpowered.procedures.BlazePasteMobplayerCollidesBlockProcedure;

import overpowered.init.CreateOverpoweredModFluids;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class BlazepasteBlock extends LiquidBlock {
	public BlazepasteBlock() {
		super(() -> CreateOverpoweredModFluids.BLAZE_PASTE.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		BlazePasteMobplayerCollidesBlockProcedure.execute(world, entity);
	}
}
