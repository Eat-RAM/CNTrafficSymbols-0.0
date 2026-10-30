package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import java.util.function.Function;

import io.github.eat_ram.cntrafficsymbols.core.block.CircleStandingSymbolBlock;
import io.github.eat_ram.cntrafficsymbols.core.block
       .SquareQuarterDefaulted3Block;
import io.github.eat_ram.cntrafficsymbols.core.block.VanillaWaterloggable;
import io.github.eat_ram.cntrafficsymbols.core.block.WideBoardBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.helper.FluidloggingConfig;
import io.github.eat_ram.cntrafficsymbols.v0d0.helper.MapColorConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.state.property.Properties.WATERLOGGED;
import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static net.minecraft.util.shape.VoxelShapes.union;

public abstract class BlockFactories {
    @Contract(pure = true)
    private static <T extends Block> @NotNull Function<Block.Settings, T>
    wrap(@NotNull String name, @NotNull Function<Block.Settings, T> factory) {
        return settings -> factory.apply(MapColorConfig.apply(settings, name));
    }

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
            return wrap(name, WaterloggedCircleStandingSymbolBlock::new);
        }
        return wrap(name, CircleStandingSymbolBlock::new);
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
            return wrap(name, WaterloggedWideBoardBlock::new);
        }
        return wrap(name, WideBoardBlock::new);
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
            return wrap(name, WaterloggedWideBoardBlock::new);
        }
        return wrap(name, settings -> new WideBoardBlock(cb, settings));
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
            return wrap(name, WaterloggedFull1CylindricalRodBlock::new);
        }
        return wrap(name, Full1CylindricalRodBlock::new);
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
            return wrap(name, WaterloggedHalf1CylindricalRodBlock::new);
        }
        return wrap(name, Half1CylindricalRodBlock::new);
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
            return wrap(name, WaterloggedDottedTPBlock::new);
        }
        return wrap(name, settings -> new DottedTPBlock(dots, settings));
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
            return wrap(name, WaterloggedLinedTPBlock::new);
        }
        return wrap(name, settings -> new LinedTPBlock(lines, settings));
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
            return wrap(name, WaterloggedRodWithLampBlock::new);
        }
        return wrap(name, RodWithLampBlock::new);
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
            return wrap(name, WaterloggedHighwayHmSignBlock::new);
        }
        return wrap(name, HighwayHmSignBlock::new);
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
            return wrap(name, WaterloggedHighwayKmSignBlock::new);
        }
        return wrap(name, HighwayKmSignBlock::new);
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
            return wrap(
                name, WaterloggedHighwayExitDistanceInfoLeftBlock::new
            );
        }
        return wrap(name, HighwayExitDistanceInfoLeftBlock::new);
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
            return wrap(
                name, WaterloggedHighwayExitDistanceInfoMiddleBlock::new
            );
        }
        return wrap(name, settings -> new HighwayExitDistanceInfoMiddleBlock(
            cb, settings
        ));
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
            return wrap(
                name, WaterloggedHighwayExitDistanceInfoRightBlock::new
            );
        }
        return wrap(name, settings -> new HighwayExitDistanceInfoRightBlock(
            cb, settings
        ));
    }

    public static @NotNull Function<
        Block.Settings, @NotNull SquareQuarterDefaulted3Block
    > barricades1(String name) {
        class Barricades1Block extends SquareQuarterDefaulted3Block {
            public static final VoxelShape NW1 = union(
                cuboid(0, 0, 0, .5, .0625, .5),
                cuboid(.0625, .0625, .0625, .4375, .75, .4375)
            );
            public static final VoxelShape NW2 = union(
                cuboid(0, 0, 0, .5, .0625, .5),
                cuboid(.0625, .0625, .0625, .4375, 1, .4375)
            );
            public static final VoxelShape NE1 = union(
                cuboid(.5, 0, 0, 1, .0625, .5),
                cuboid(.5625, .0625, .0625, .9375, .75, .4375)
            );
            public static final VoxelShape NE2 = union(
                cuboid(.5, 0, 0, 1, .0625, .5),
                cuboid(.5625, .0625, .0625, .9375, 1, .4375)
            );
            public static final VoxelShape SW1 = union(
                cuboid(0, 0, .5, .5, .0625, 1),
                cuboid(.0625, .0625, .5625, .4375, .75, .9375)
            );
            public static final VoxelShape SW2 = union(
                cuboid(0, 0, .5, .5, .0625, 1),
                cuboid(.0625, .0625, .5625, .4375, 1, .9375)
            );
            public static final VoxelShape SE1 = union(
                cuboid(.5, 0, .5, 1, .0625, 1),
                cuboid(.5625, .0625, .5625, .9375, .75, .9375)
            );
            public static final VoxelShape SE2 = union(
                cuboid(.5, 0, .5, 1, .0625, 1),
                cuboid(.5625, .0625, .5625, .9375, 1, .9375)
            );
            public static final VoxelShape W = union(
                cuboid(0, 0, 0, 1, .125, 1),
                cuboid(.125, .125, .125, .875, 1, .875)
            );

            Barricades1Block(Settings settings) {
                super(settings);
            }

            @Override
            public VoxelShape getOutlineShape(
                BlockState st, BlockView v, BlockPos p, ShapeContext c
            ) {
                boolean w = false;
                VoxelShape r = net.minecraft.util.shape.VoxelShapes.empty();
                switch (st.get(NORTHWEST).intValue()) {
                    case 1: w = true; r = union(r, NW1); break;
                    case 2: w = true; r = union(r, NW2); break;
                }
                switch (st.get(NORTHEAST).intValue()) {
                    case 1: w = true; r = union(r, NE1); break;
                    case 2: w = true; r = union(r, NE2); break;
                }
                switch (st.get(SOUTHWEST).intValue()) {
                    case 1: w = true; r = union(r, SW1); break;
                    case 2: w = true; r = union(r, SW2); break;
                }
                switch (st.get(SOUTHEAST).intValue()) {
                    case 1: w = true; r = union(r, SE1); break;
                    case 2: w = true; r = union(r, SE2); break;
                }
                return w ? r : W;
            }
        }
        if (FluidloggingConfig.resolve(name) == FluidloggableType.VANILLA) {
            class WaterloggedBarricades1Block extends Barricades1Block
            implements VanillaWaterloggable {
                WaterloggedBarricades1Block(Settings settings) {
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
            return wrap(name, WaterloggedBarricades1Block::new);
        }
        return wrap(name, Barricades1Block::new);
    }
}
