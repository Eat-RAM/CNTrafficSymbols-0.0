package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import java.util.function.Function;

import io.github.eat_ram.cntrafficsymbols.core.block.CircleStandingSymbolBlock;
import io.github.eat_ram.cntrafficsymbols.core.block.VanillaWaterloggable;
import io.github.eat_ram.cntrafficsymbols.core.block.WideBoardBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.helper.FluidloggingConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.StateManager;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.state.property.Properties.WATERLOGGED;

public abstract class BlockFactories {
    public static @NotNull Function<
        Block.Settings, @NotNull CircleStandingSymbolBlock
    > circleStandingSymbol(@NotNull String name) {
        if (FluidloggingConfig.resolve(name) == FluidloggableType.VANILLA) {
            class WaterloggedCircleStandingSymbolBlock
            extends CircleStandingSymbolBlock implements VanillaWaterloggable {
                WaterloggedCircleStandingSymbolBlock(Settings settings) {
                    super(settings);
                    this.setDefaultState(
                        this.getDefaultState().with(WATERLOGGED, false)
                    );
                }

                @Override
                protected void
                appendProperties(
                    StateManager.Builder<Block, BlockState> builder
                ) {
                    super.appendProperties(builder);
                    builder.add(WATERLOGGED);
                }

                @Override
                public FluidState getFluidState(BlockState state) {
                    return state.get(WATERLOGGED) ?
                           Fluids.WATER.getStill(false) :
                           super.getFluidState(state);
                }
            }
            return WaterloggedCircleStandingSymbolBlock::new;
        }
        return CircleStandingSymbolBlock::new;
    }

    public static @NotNull Function<Block.Settings, @NotNull WideBoardBlock>
    wideBoard(@NotNull String name) {
        if (FluidloggingConfig.resolve(name) == FluidloggableType.VANILLA) {
            class WaterloggedWideBoardBlock
            extends WideBoardBlock implements VanillaWaterloggable {
                WaterloggedWideBoardBlock(Settings settings) {
                    super(settings);
                    this.setDefaultState(
                        this.getDefaultState().with(WATERLOGGED, false)
                    );
                }

                @Override
                protected void
                appendProperties(
                    StateManager.Builder<Block, BlockState> builder
                ) {
                    super.appendProperties(builder);
                    builder.add(WATERLOGGED);
                }

                @Override
                public FluidState getFluidState(BlockState state) {
                    return state.get(WATERLOGGED) ?
                           Fluids.WATER.getStill(false) :
                           super.getFluidState(state);
                }
            }
            return WaterloggedWideBoardBlock::new;
        }
        return WideBoardBlock::new;
    }

    public static @NotNull Function<Block.Settings, @NotNull WideBoardBlock>
    wideBoardBunched(WideBoardBlock cb, String name) {
        if (FluidloggingConfig.resolve(name) == FluidloggableType.VANILLA) {
            class WaterloggedWideBoardBlock
            extends WideBoardBlock implements VanillaWaterloggable {
                WaterloggedWideBoardBlock(Settings settings) {
                    super(cb, settings);
                    this.setDefaultState(
                        this.getDefaultState().with(WATERLOGGED, false)
                    );
                }

                @Override
                protected void
                appendProperties(
                    StateManager.Builder<Block, BlockState> builder
                ) {
                    super.appendProperties(builder);
                    builder.add(WATERLOGGED);
                }

                @Override
                public FluidState getFluidState(BlockState state) {
                    return state.get(WATERLOGGED) ?
                           Fluids.WATER.getStill(false) :
                           super.getFluidState(state);
                }
            }
            return WaterloggedWideBoardBlock::new;
        }
        return settings -> new WideBoardBlock(cb, settings);
    }

    public static @NotNull Function<
        Block.Settings, @NotNull Full1CylindricalRodBlock
    > full1CylindricalRod(String name) {
        if (FluidloggingConfig.resolve(name) == FluidloggableType.VANILLA) {
            class WaterloggedFull1CylindricalRodBlock
            extends Full1CylindricalRodBlock implements VanillaWaterloggable {
                WaterloggedFull1CylindricalRodBlock(Settings settings) {
                    super(settings);
                    this.setDefaultState(
                        this.getDefaultState().with(WATERLOGGED, false)
                    );
                }

                @Override
                protected void
                appendProperties(
                    StateManager.Builder<Block, BlockState> builder
                ) {
                    super.appendProperties(builder);
                    builder.add(WATERLOGGED);
                }

                @Override
                public FluidState getFluidState(BlockState state) {
                    return state.get(WATERLOGGED) ?
                           Fluids.WATER.getStill(false) :
                           super.getFluidState(state);
                }
            }
            return WaterloggedFull1CylindricalRodBlock::new;
        }
        return Full1CylindricalRodBlock::new;
    }

    public static @NotNull Function<
        Block.Settings, @NotNull Half1CylindricalRodBlock
    > half1CylindricalRod(String name) {
        if (FluidloggingConfig.resolve(name) == FluidloggableType.VANILLA) {
            class WaterloggedHalf1CylindricalRodBlock
            extends Half1CylindricalRodBlock implements VanillaWaterloggable {
                WaterloggedHalf1CylindricalRodBlock(Settings settings) {
                    super(settings);
                    this.setDefaultState(
                        this.getDefaultState().with(WATERLOGGED, false)
                    );
                }

                @Override
                protected void
                appendProperties(
                    StateManager.Builder<Block, BlockState> builder
                ) {
                    super.appendProperties(builder);
                    builder.add(WATERLOGGED);
                }

                @Override
                public FluidState getFluidState(BlockState state) {
                    return state.get(WATERLOGGED) ?
                           Fluids.WATER.getStill(false) :
                           super.getFluidState(state);
                }
            }
            return WaterloggedHalf1CylindricalRodBlock::new;
        }
        return Half1CylindricalRodBlock::new;
    }

    public static @NotNull Function<Block.Settings, @NotNull DottedTPBlock>
    dottedTP(String name, byte dots) {
        if (FluidloggingConfig.resolve(name) == FluidloggableType.VANILLA) {
            class WaterloggedDottedTPBlock extends DottedTPBlock
            implements VanillaWaterloggable {
                WaterloggedDottedTPBlock(Settings settings) {
                    super(dots, settings);
                    this.setDefaultState(
                        this.getDefaultState().with(WATERLOGGED, false)
                    );
                }

                @Override
                protected void
                appendProperties(
                    StateManager.Builder<Block, BlockState> builder
                ) {
                    super.appendProperties(builder);
                    builder.add(WATERLOGGED);
                }

                @Override
                public FluidState getFluidState(BlockState state) {
                    return state.get(WATERLOGGED) ?
                           Fluids.WATER.getStill(false) :
                           super.getFluidState(state);
                }
            }
            return WaterloggedDottedTPBlock::new;
        }
        return settings -> new DottedTPBlock(dots, settings);
    }

    public static @NotNull Function<Block.Settings, @NotNull  LinedTPBlock>
    linedTP(String name, byte lines) {
        if (FluidloggingConfig.resolve(name) == FluidloggableType.VANILLA) {
            class WaterloggedLinedTPBlock extends LinedTPBlock
            implements VanillaWaterloggable {
                WaterloggedLinedTPBlock(Settings settings) {
                    super(lines, settings);
                    this.setDefaultState(
                        this.getDefaultState().with(WATERLOGGED, false)
                    );
                }

                @Override
                protected void
                appendProperties(
                    StateManager.Builder<Block, BlockState> builder
                ) {
                    super.appendProperties(builder);
                    builder.add(WATERLOGGED);
                }

                @Override
                public FluidState getFluidState(BlockState state) {
                    return state.get(WATERLOGGED) ?
                           Fluids.WATER.getStill(false) :
                           super.getFluidState(state);
                }
            }
            return WaterloggedLinedTPBlock::new;
        }
        return settings -> new LinedTPBlock(lines, settings);
    }

    public static @NotNull Function<Block.Settings, @NotNull RodWithLampBlock>
    rodWithLamp(String name) {
        if (FluidloggingConfig.resolve(name) == FluidloggableType.VANILLA) {
            class WaterloggedRodWithLampBlock extends RodWithLampBlock
            implements VanillaWaterloggable {
                WaterloggedRodWithLampBlock(Settings settings) {
                    super(settings);
                    this.setDefaultState(
                        this.getDefaultState().with(WATERLOGGED, false)
                    );
                }

                @Override
                protected void
                appendProperties(
                    StateManager.Builder<Block, BlockState> builder
                ) {
                    super.appendProperties(builder);
                    builder.add(WATERLOGGED);
                }

                @Override
                public FluidState getFluidState(BlockState state) {
                    return state.get(WATERLOGGED) ?
                           Fluids.WATER.getStill(false) :
                           super.getFluidState(state);
                }
            }
            return WaterloggedRodWithLampBlock::new;
        }
        return RodWithLampBlock::new;
    }

    public static @NotNull Function<
        Block.Settings, @NotNull HighwayHmSignBlock
    > highwayHmSign(String name) {
        if (FluidloggingConfig.resolve(name) == FluidloggableType.VANILLA) {
            class WaterloggedHighwayHmSignBlock extends HighwayHmSignBlock
            implements VanillaWaterloggable {
                WaterloggedHighwayHmSignBlock(Settings settings) {
                    super(settings);
                    this.setDefaultState(
                        this.getDefaultState().with(WATERLOGGED, false)
                    );
                }

                @Override
                protected void
                appendProperties(
                    StateManager.Builder<Block, BlockState> builder
                ) {
                    super.appendProperties(builder);
                    builder.add(WATERLOGGED);
                }

                @Override
                public FluidState getFluidState(BlockState state) {
                    return state.get(WATERLOGGED) ?
                           Fluids.WATER.getStill(false) :
                           super.getFluidState(state);
                }
            }
            return WaterloggedHighwayHmSignBlock::new;
        }
        return HighwayHmSignBlock::new;
    }

    public static @NotNull Function<
        Block.Settings, @NotNull HighwayKmSignBlock
    > highwayKmSign(String name) {
        if (FluidloggingConfig.resolve(name) == FluidloggableType.VANILLA) {
            class WaterloggedHighwayKmSignBlock extends HighwayKmSignBlock
            implements VanillaWaterloggable {
                WaterloggedHighwayKmSignBlock(Settings settings) {
                    super(settings);
                    this.setDefaultState(
                        this.getDefaultState().with(WATERLOGGED, false)
                    );
                }

                @Override
                protected void
                appendProperties(
                    StateManager.Builder<Block, BlockState> builder
                ) {
                    super.appendProperties(builder);
                    builder.add(WATERLOGGED);
                }

                @Override
                public FluidState getFluidState(BlockState state) {
                    return state.get(WATERLOGGED) ?
                           Fluids.WATER.getStill(false) :
                           super.getFluidState(state);
                }
            }
            return WaterloggedHighwayKmSignBlock::new;
        }
        return HighwayKmSignBlock::new;
    }

    public static @NotNull Function<
        Block.Settings, @NotNull HighwayExitDistanceInfoLeftBlock
    > highwayExitDistanceInfoLeft(String name) {
        if (FluidloggingConfig.resolve(name) == FluidloggableType.VANILLA) {
            class WaterloggedHighwayExitDistanceInfoLeftBlock
            extends HighwayExitDistanceInfoLeftBlock
            implements VanillaWaterloggable {
                WaterloggedHighwayExitDistanceInfoLeftBlock(
                    Settings settings
                ) {
                    super(settings);
                    this.setDefaultState(
                        this.getDefaultState().with(WATERLOGGED, false)
                    );
                }

                @Override
                protected void
                appendProperties(
                    StateManager.Builder<Block, BlockState> builder
                ) {
                    super.appendProperties(builder);
                    builder.add(WATERLOGGED);
                }

                @Override
                public FluidState getFluidState(BlockState state) {
                    return state.get(WATERLOGGED) ?
                           Fluids.WATER.getStill(false) :
                           super.getFluidState(state);
                }
            }
            return WaterloggedHighwayExitDistanceInfoLeftBlock::new;
        }
        return HighwayExitDistanceInfoLeftBlock::new;
    }

    public static @NotNull Function<
        Block.Settings, @NotNull HighwayExitDistanceInfoMiddleBlock
    > highwayExitDistanceInfoMiddle(WideBoardBlock cb, String name) {
        if (FluidloggingConfig.resolve(name) == FluidloggableType.VANILLA) {
            class WaterloggedHighwayExitDistanceInfoMiddleBlock
            extends HighwayExitDistanceInfoMiddleBlock
            implements VanillaWaterloggable {
                WaterloggedHighwayExitDistanceInfoMiddleBlock(
                    Settings settings
                ) {
                    super(cb, settings);
                    this.setDefaultState(
                        this.getDefaultState().with(WATERLOGGED, false)
                    );
                }

                @Override
                protected void
                appendProperties(
                    StateManager.Builder<Block, BlockState> builder
                ) {
                    super.appendProperties(builder);
                    builder.add(WATERLOGGED);
                }

                @Override
                public FluidState getFluidState(BlockState state) {
                    return state.get(WATERLOGGED) ?
                           Fluids.WATER.getStill(false) :
                           super.getFluidState(state);
                }
            }
            return WaterloggedHighwayExitDistanceInfoMiddleBlock::new;
        }
        return settings -> new HighwayExitDistanceInfoMiddleBlock(
            cb, settings
        );
    }

    public static @NotNull Function<
        Block.Settings, @NotNull HighwayExitDistanceInfoRightBlock
    > highwayExitDistanceInfoRight(WideBoardBlock cb, String name) {
        if (FluidloggingConfig.resolve(name) == FluidloggableType.VANILLA) {
            class WaterloggedHighwayExitDistanceInfoRightBlock
            extends HighwayExitDistanceInfoRightBlock
            implements VanillaWaterloggable {
                WaterloggedHighwayExitDistanceInfoRightBlock(
                    Settings settings
                ) {
                    super(cb, settings);
                    this.setDefaultState(
                        this.getDefaultState().with(WATERLOGGED, false)
                    );
                }

                @Override
                protected void
                appendProperties(
                    StateManager.Builder<Block, BlockState> builder
                ) {
                    super.appendProperties(builder);
                    builder.add(WATERLOGGED);
                }

                @Override
                public FluidState getFluidState(BlockState state) {
                    return state.get(WATERLOGGED) ?
                           Fluids.WATER.getStill(false) :
                           super.getFluidState(state);
                }
            }
            return WaterloggedHighwayExitDistanceInfoRightBlock::new;
        }
        return settings -> new HighwayExitDistanceInfoRightBlock(cb, settings);
    }
}
