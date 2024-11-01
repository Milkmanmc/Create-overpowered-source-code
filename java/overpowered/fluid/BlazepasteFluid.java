
package overpowered.fluid;

import overpowered.init.CreateOverpoweredModItems;
import overpowered.init.CreateOverpoweredModFluids;
import overpowered.init.CreateOverpoweredModFluidTypes;
import overpowered.init.CreateOverpoweredModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

public abstract class BlazepasteFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CreateOverpoweredModFluidTypes.BLAZE_PASTE_TYPE.get(), () -> CreateOverpoweredModFluids.BLAZE_PASTE.get(),
			() -> CreateOverpoweredModFluids.FLOWING_BLAZE_PASTE.get()).explosionResistance(100f).tickRate(25).levelDecreasePerBlock(2).slopeFindDistance(2).bucket(() -> CreateOverpoweredModItems.BLAZE_PASTE_BUCKET.get())
			.block(() -> (LiquidBlock) CreateOverpoweredModBlocks.BLAZE_PASTE.get());

	private BlazepasteFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FLAME;
	}

	public static class Source extends BlazepasteFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BlazepasteFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
