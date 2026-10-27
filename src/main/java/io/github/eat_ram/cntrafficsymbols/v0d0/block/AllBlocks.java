package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import io.github.eat_ram.cntrafficsymbols.core.block.CircleStandingSymbolBlock;
import io.github.eat_ram.cntrafficsymbols.core.block.DoubleFaceFacingBlock;
import io.github.eat_ram.cntrafficsymbols.core.block
       .SquareQuarterDefaulted3Block;
import io.github.eat_ram.cntrafficsymbols.core.block.WideBoardBlock;
import io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.ShapeContext;
import net.minecraft.fluid.Fluids;
import net.minecraft.registry.Registries;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Contract;

import static io.github.eat_ram.cntrafficsymbols.v0d0.bakcompa.DualIds
              .commitAndGet;
import static io.github.eat_ram.cntrafficsymbols.v0d0.block.BlockFactories.*;
import static io.github.eat_ram.cntrafficsymbols.v0d0.helper.RegisterHelper
              .commitDouble;
import static io.github.eat_ram.cntrafficsymbols.v0d0.helper.RegisterHelper
              .registerBlock;
import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static net.minecraft.util.shape.VoxelShapes.union;

public class AllBlocks {
    public static final Block SPEEDLIMIT_HIGH_3 = registerBlock(
        commitDouble("speedlimit_high_3"),
        circleStandingSymbol("speedlimit_high_3"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_3 = registerBlock(
        commitDouble("speedlimit_low_3"),
        circleStandingSymbol("speedlimit_low_3"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_5 = registerBlock(
        commitDouble("speedlimit_high_5"),
        circleStandingSymbol("speedlimit_high_5"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_5 = registerBlock(
        commitDouble("speedlimit_low_5"),
        circleStandingSymbol("speedlimit_low_5"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_10 = registerBlock(
        commitDouble("speedlimit_high_10"),
        circleStandingSymbol("speedlimit_high_10"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_10 = registerBlock(
        commitDouble("speedlimit_low_10"),
        circleStandingSymbol("speedlimit_low_10"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_15 = registerBlock(
        commitDouble("speedlimit_high_15"),
        circleStandingSymbol("speedlimit_high_15"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_15 = registerBlock(
        commitDouble("speedlimit_low_15"),
        circleStandingSymbol("speedlimit_low_15"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_20 = registerBlock(
        commitDouble("speedlimit_high_20"),
        circleStandingSymbol("speedlimit_high_20"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_20 = registerBlock(
        commitDouble("speedlimit_low_20"),
        circleStandingSymbol("speedlimit_low_20"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_25 = registerBlock(
        commitDouble("speedlimit_high_25"),
        circleStandingSymbol("speedlimit_high_25"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_25 = registerBlock(
        commitDouble("speedlimit_low_25"),
        circleStandingSymbol("speedlimit_low_25"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_30 = registerBlock(
        commitDouble("speedlimit_high_30"),
        circleStandingSymbol("speedlimit_high_30"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_30 = registerBlock(
        commitDouble("speedlimit_low_30"),
        circleStandingSymbol("speedlimit_low_30"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_35 = registerBlock(
        commitDouble("speedlimit_high_35"),
        circleStandingSymbol("speedlimit_high_35"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_35 = registerBlock(
        commitDouble("speedlimit_low_35"),
        circleStandingSymbol("speedlimit_low_35"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_40 = registerBlock(
        commitDouble("speedlimit_high_40"),
        circleStandingSymbol("speedlimit_high_40"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_40 = registerBlock(
        commitDouble("speedlimit_low_40"),
        circleStandingSymbol("speedlimit_low_40"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_45 = registerBlock(
        commitDouble("speedlimit_high_45"),
        circleStandingSymbol("speedlimit_high_45"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_45 = registerBlock(
        commitDouble("speedlimit_low_45"),
        circleStandingSymbol("speedlimit_low_45"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_50 = registerBlock(
        commitDouble("speedlimit_high_50"),
        circleStandingSymbol("speedlimit_high_50"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_50 = registerBlock(
        commitDouble("speedlimit_low_50"),
        circleStandingSymbol("speedlimit_low_50"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_55 = registerBlock(
        commitDouble("speedlimit_high_55"),
        circleStandingSymbol("speedlimit_high_55"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_55 = registerBlock(
        commitDouble("speedlimit_low_55"),
        circleStandingSymbol("speedlimit_low_55"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_60 = registerBlock(
        commitDouble("speedlimit_high_60"),
        circleStandingSymbol("speedlimit_high_60"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_60 = registerBlock(
        commitDouble("speedlimit_low_60"),
        circleStandingSymbol("speedlimit_low_60"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_65 = registerBlock(
        commitDouble("speedlimit_high_65"),
        circleStandingSymbol("speedlimit_high_65"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_65 = registerBlock(
        commitDouble("speedlimit_low_65"),
        circleStandingSymbol("speedlimit_low_65"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_70 = registerBlock(
        commitDouble("speedlimit_high_70"),
        circleStandingSymbol("speedlimit_high_70"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_70 = registerBlock(
        commitDouble("speedlimit_low_70"),
        circleStandingSymbol("speedlimit_low_70"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_75 = registerBlock(
        commitDouble("speedlimit_high_75"),
        circleStandingSymbol("speedlimit_high_75"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_75 = registerBlock(
        commitDouble("speedlimit_low_75"),
        circleStandingSymbol("speedlimit_low_75"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_80 = registerBlock(
        commitDouble("speedlimit_high_80"),
        circleStandingSymbol("speedlimit_high_80"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_80 = registerBlock(
        commitDouble("speedlimit_low_80"),
        circleStandingSymbol("speedlimit_low_80"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_85 = registerBlock(
        commitDouble("speedlimit_high_85"),
        circleStandingSymbol("speedlimit_high_85"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_85 = registerBlock(
        commitDouble("speedlimit_low_85"),
        circleStandingSymbol("speedlimit_low_85"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_90 = registerBlock(
        commitDouble("speedlimit_high_90"),
        circleStandingSymbol("speedlimit_high_90"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_90 = registerBlock(
        commitDouble("speedlimit_low_90"),
        circleStandingSymbol("speedlimit_low_90"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_95 = registerBlock(
        commitDouble("speedlimit_high_95"),
        circleStandingSymbol("speedlimit_high_95"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_95 = registerBlock(
        commitDouble("speedlimit_low_95"),
        circleStandingSymbol("speedlimit_low_95"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_100 = registerBlock(
        commitDouble("speedlimit_high_100"),
        circleStandingSymbol("speedlimit_high_100"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_100 = registerBlock(
        commitDouble("speedlimit_low_100"),
        circleStandingSymbol("speedlimit_low_100"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_105 = registerBlock(
        commitDouble("speedlimit_high_105"),
        circleStandingSymbol("speedlimit_high_105"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_105 = registerBlock(
        commitDouble("speedlimit_low_105"),
        circleStandingSymbol("speedlimit_low_105"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_110 = registerBlock(
        commitDouble("speedlimit_high_110"),
        circleStandingSymbol("speedlimit_high_110"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_110 = registerBlock(
        commitDouble("speedlimit_low_110"),
        circleStandingSymbol("speedlimit_low_110"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_115 = registerBlock(
        commitDouble("speedlimit_high_115"),
        circleStandingSymbol("speedlimit_high_115"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_115 = registerBlock(
        commitDouble("speedlimit_low_115"),
        circleStandingSymbol("speedlimit_low_115"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_120 = registerBlock(
        commitDouble("speedlimit_high_120"),
        circleStandingSymbol("speedlimit_high_120"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_120 = registerBlock(
        commitDouble("speedlimit_low_120"),
        circleStandingSymbol("speedlimit_low_120"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_125 = registerBlock(
        commitDouble("speedlimit_high_125"),
        circleStandingSymbol("speedlimit_high_125"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_125 = registerBlock(
        commitDouble("speedlimit_low_125"),
        circleStandingSymbol("speedlimit_low_125"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_130 = registerBlock(
        commitDouble("speedlimit_high_130"),
        circleStandingSymbol("speedlimit_high_130"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_130 = registerBlock(
        commitDouble("speedlimit_low_130"),
        circleStandingSymbol("speedlimit_low_130"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_135 = registerBlock(
        commitDouble("speedlimit_high_135"),
        circleStandingSymbol("speedlimit_high_135"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_135 = registerBlock(
        commitDouble("speedlimit_low_135"),
        circleStandingSymbol("speedlimit_low_135"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_140 = registerBlock(
        commitDouble("speedlimit_high_140"),
        circleStandingSymbol("speedlimit_high_140"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_140 = registerBlock(
        commitDouble("speedlimit_low_140"),
        circleStandingSymbol("speedlimit_low_140"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_145 = registerBlock(
        commitDouble("speedlimit_high_145"),
        circleStandingSymbol("speedlimit_high_145"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_145 = registerBlock(
        commitDouble("speedlimit_low_145"),
        circleStandingSymbol("speedlimit_low_145"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_150 = registerBlock(
        commitDouble("speedlimit_high_150"),
        circleStandingSymbol("speedlimit_high_150"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_150 = registerBlock(
        commitDouble("speedlimit_low_150"),
        circleStandingSymbol("speedlimit_low_150"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_HIGH_SPECIAL = registerBlock(
        commitDouble("speedlimit_high_special"),
        circleStandingSymbol("speedlimit_high_special"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block SPEEDLIMIT_LOW_SPECIAL = registerBlock(
        commitDouble("speedlimit_low_special"),
        circleStandingSymbol("speedlimit_low_special"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_3 = registerBlock(
        commitDouble("lift_speedlimit_high_3"),
        circleStandingSymbol("lift_speedlimit_high_3"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_5 = registerBlock(
        commitDouble("lift_speedlimit_high_5"),
        circleStandingSymbol("lift_speedlimit_high_5"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_10 = registerBlock(
        commitDouble("lift_speedlimit_high_10"),
        circleStandingSymbol("lift_speedlimit_high_10"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_15 = registerBlock(
        commitDouble("lift_speedlimit_high_15"),
        circleStandingSymbol("lift_speedlimit_high_15"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_20 = registerBlock(
        commitDouble("lift_speedlimit_high_20"),
        circleStandingSymbol("lift_speedlimit_high_20"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_25 = registerBlock(
        commitDouble("lift_speedlimit_high_25"),
        circleStandingSymbol("lift_speedlimit_high_25"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_30 = registerBlock(
        commitDouble("lift_speedlimit_high_30"),
        circleStandingSymbol("lift_speedlimit_high_30"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_35 = registerBlock(
        commitDouble("lift_speedlimit_high_35"),
        circleStandingSymbol("lift_speedlimit_high_35"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_40 = registerBlock(
        commitDouble("lift_speedlimit_high_40"),
        circleStandingSymbol("lift_speedlimit_high_40"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_45 = registerBlock(
        commitDouble("lift_speedlimit_high_45"),
        circleStandingSymbol("lift_speedlimit_high_45"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_50 = registerBlock(
        commitDouble("lift_speedlimit_high_50"),
        circleStandingSymbol("lift_speedlimit_high_50"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_55 = registerBlock(
        commitDouble("lift_speedlimit_high_55"),
        circleStandingSymbol("lift_speedlimit_high_55"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_60 = registerBlock(
        commitDouble("lift_speedlimit_high_60"),
        circleStandingSymbol("lift_speedlimit_high_60"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_65 = registerBlock(
        commitDouble("lift_speedlimit_high_65"),
        circleStandingSymbol("lift_speedlimit_high_65"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_70 = registerBlock(
        commitDouble("lift_speedlimit_high_70"),
        circleStandingSymbol("lift_speedlimit_high_70"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_75 = registerBlock(
        commitDouble("lift_speedlimit_high_75"),
        circleStandingSymbol("lift_speedlimit_high_75"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_80 = registerBlock(
        commitDouble("lift_speedlimit_high_80"),
        circleStandingSymbol("lift_speedlimit_high_80"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_85 = registerBlock(
        commitDouble("lift_speedlimit_high_85"),
        circleStandingSymbol("lift_speedlimit_high_85"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_90 = registerBlock(
        commitDouble("lift_speedlimit_high_90"),
        circleStandingSymbol("lift_speedlimit_high_90"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_95 = registerBlock(
        commitDouble("lift_speedlimit_high_95"),
        circleStandingSymbol("lift_speedlimit_high_95"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_100 = registerBlock(
        commitDouble("lift_speedlimit_high_100"),
        circleStandingSymbol("lift_speedlimit_high_100"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_105 = registerBlock(
        commitDouble("lift_speedlimit_high_105"),
        circleStandingSymbol("lift_speedlimit_high_105"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_110 = registerBlock(
        commitDouble("lift_speedlimit_high_110"),
        circleStandingSymbol("lift_speedlimit_high_110"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_115 = registerBlock(
        commitDouble("lift_speedlimit_high_115"),
        circleStandingSymbol("lift_speedlimit_high_115"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_120 = registerBlock(
        commitDouble("lift_speedlimit_high_120"),
        circleStandingSymbol("lift_speedlimit_high_120"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_125 = registerBlock(
        commitDouble("lift_speedlimit_high_125"),
        circleStandingSymbol("lift_speedlimit_high_125"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_130 = registerBlock(
        commitDouble("lift_speedlimit_high_130"),
        circleStandingSymbol("lift_speedlimit_high_130"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_135 = registerBlock(
        commitDouble("lift_speedlimit_high_135"),
        circleStandingSymbol("lift_speedlimit_high_135"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_140 = registerBlock(
        commitDouble("lift_speedlimit_high_140"),
        circleStandingSymbol("lift_speedlimit_high_140"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_145 = registerBlock(
        commitDouble("lift_speedlimit_high_145"),
        circleStandingSymbol("lift_speedlimit_high_145"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_150 = registerBlock(
        commitDouble("lift_speedlimit_high_150"),
        circleStandingSymbol("lift_speedlimit_high_150"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block LIFT_SPEEDLIMIT_HIGH_SPECIAL = registerBlock(
        commitDouble("lift_speedlimit_high_special"),
        circleStandingSymbol("lift_speedlimit_high_special"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block CIRCLE_BACKBOARD = registerBlock(
        commitDouble("circle_backboard"),
        circleStandingSymbol("circle_backboard"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_SPECIAL = registerBlock(
        commitDouble("heightlimit_special"),
        circleStandingSymbol("heightlimit_special"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_0D1 = registerBlock(
        commitDouble("heightlimit_0d1"),
        circleStandingSymbol("heightlimit_0d1"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_0D2 = registerBlock(
        commitDouble("heightlimit_0d2"),
        circleStandingSymbol("heightlimit_0d2"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_0D3 = registerBlock(
        commitDouble("heightlimit_0d3"),
        circleStandingSymbol("heightlimit_0d3"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_0D4 = registerBlock(
        commitDouble("heightlimit_0d4"),
        circleStandingSymbol("heightlimit_0d4"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_0D5 = registerBlock(
        commitDouble("heightlimit_0d5"),
        circleStandingSymbol("heightlimit_0d5"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_0D6 = registerBlock(
        commitDouble("heightlimit_0d6"),
        circleStandingSymbol("heightlimit_0d6"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_0D7 = registerBlock(
        commitDouble("heightlimit_0d7"),
        circleStandingSymbol("heightlimit_0d7"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_0D8 = registerBlock(
        commitDouble("heightlimit_0d8"),
        circleStandingSymbol("heightlimit_0d8"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_0D9 = registerBlock(
        commitDouble("heightlimit_0d9"),
        circleStandingSymbol("heightlimit_0d9"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_1 = registerBlock(
        commitDouble("heightlimit_1"),
        circleStandingSymbol("heightlimit_1"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_1D1 = registerBlock(
        commitDouble("heightlimit_1d1"),
        circleStandingSymbol("heightlimit_1d1"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_1D2 = registerBlock(
        commitDouble("heightlimit_1d2"),
        circleStandingSymbol("heightlimit_1d2"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_1D3 = registerBlock(
        commitDouble("heightlimit_1d3"),
        circleStandingSymbol("heightlimit_1d3"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_1D4 = registerBlock(
        commitDouble("heightlimit_1d4"),
        circleStandingSymbol("heightlimit_1d4"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_1D5 = registerBlock(
        commitDouble("heightlimit_1d5"),
        circleStandingSymbol("heightlimit_1d5"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_1D6 = registerBlock(
        commitDouble("heightlimit_1d6"),
        circleStandingSymbol("heightlimit_1d6"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_1D7 = registerBlock(
        commitDouble("heightlimit_1d7"),
        circleStandingSymbol("heightlimit_1d7"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_1D8 = registerBlock(
        commitDouble("heightlimit_1d8"),
        circleStandingSymbol("heightlimit_1d8"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_1D9 = registerBlock(
        commitDouble("heightlimit_1d9"),
        circleStandingSymbol("heightlimit_1d9"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_2 = registerBlock(
        commitDouble("heightlimit_2"),
        circleStandingSymbol("heightlimit_2"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_2D1 = registerBlock(
        commitDouble("heightlimit_2d1"),
        circleStandingSymbol("heightlimit_2d1"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_2D2 = registerBlock(
        commitDouble("heightlimit_2d2"),
        circleStandingSymbol("heightlimit_2d2"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_2D3 = registerBlock(
        commitDouble("heightlimit_2d3"),
        circleStandingSymbol("heightlimit_2d3"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_2D4 = registerBlock(
        commitDouble("heightlimit_2d4"),
        circleStandingSymbol("heightlimit_2d4"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_2D5 = registerBlock(
        commitDouble("heightlimit_2d5"),
        circleStandingSymbol("heightlimit_2d5"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_2D6 = registerBlock(
        commitDouble("heightlimit_2d6"),
        circleStandingSymbol("heightlimit_2d6"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_2D7 = registerBlock(
        commitDouble("heightlimit_2d7"),
        circleStandingSymbol("heightlimit_2d7"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_2D8 = registerBlock(
        commitDouble("heightlimit_2d8"),
        circleStandingSymbol("heightlimit_2d8"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_2D9 = registerBlock(
        commitDouble("heightlimit_2d9"),
        circleStandingSymbol("heightlimit_2d9"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_3 = registerBlock(
        commitDouble("heightlimit_3"),
        circleStandingSymbol("heightlimit_3"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_3D1 = registerBlock(
        commitDouble("heightlimit_3d1"),
        circleStandingSymbol("heightlimit_3d1"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_3D2 = registerBlock(
        commitDouble("heightlimit_3d2"),
        circleStandingSymbol("heightlimit_3d2"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_3D3 = registerBlock(
        commitDouble("heightlimit_3d3"),
        circleStandingSymbol("heightlimit_3d3"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_3D4 = registerBlock(
        commitDouble("heightlimit_3d4"),
        circleStandingSymbol("heightlimit_3d4"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_3D5 = registerBlock(
        commitDouble("heightlimit_3d5"),
        circleStandingSymbol("heightlimit_3d5"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_3D6 = registerBlock(
        commitDouble("heightlimit_3d6"),
        circleStandingSymbol("heightlimit_3d6"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_3D7 = registerBlock(
        commitDouble("heightlimit_3d7"),
        circleStandingSymbol("heightlimit_3d7"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_3D8 = registerBlock(
        commitDouble("heightlimit_3d8"),
        circleStandingSymbol("heightlimit_3d8"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_3D9 = registerBlock(
        commitDouble("heightlimit_3d9"),
        circleStandingSymbol("heightlimit_3d9"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_4 = registerBlock(
        commitDouble("heightlimit_4"),
        circleStandingSymbol("heightlimit_4"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_4D1 = registerBlock(
        commitDouble("heightlimit_4d1"),
        circleStandingSymbol("heightlimit_4d1"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_4D2 = registerBlock(
        commitDouble("heightlimit_4d2"),
        circleStandingSymbol("heightlimit_4d2"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_4D3 = registerBlock(
        commitDouble("heightlimit_4d3"),
        circleStandingSymbol("heightlimit_4d3"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_4D4 = registerBlock(
        commitDouble("heightlimit_4d4"),
        circleStandingSymbol("heightlimit_4d4"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_4D5 = registerBlock(
        commitDouble("heightlimit_4d5"),
        circleStandingSymbol("heightlimit_4d5"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_4D6 = registerBlock(
        commitDouble("heightlimit_4d6"),
        circleStandingSymbol("heightlimit_4d6"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_4D7 = registerBlock(
        commitDouble("heightlimit_4d7"),
        circleStandingSymbol("heightlimit_4d7"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_4D8 = registerBlock(
        commitDouble("heightlimit_4d8"),
        circleStandingSymbol("heightlimit_4d8"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_4D9 = registerBlock(
        commitDouble("heightlimit_4d9"),
        circleStandingSymbol("heightlimit_4d9"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_5 = registerBlock(
        commitDouble("heightlimit_5"),
        circleStandingSymbol("heightlimit_5"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_5D1 = registerBlock(
        commitDouble("heightlimit_5d1"),
        circleStandingSymbol("heightlimit_5d1"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_5D2 = registerBlock(
        commitDouble("heightlimit_5d2"),
        circleStandingSymbol("heightlimit_5d2"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_5D3 = registerBlock(
        commitDouble("heightlimit_5d3"),
        circleStandingSymbol("heightlimit_5d3"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_5D4 = registerBlock(
        commitDouble("heightlimit_5d4"),
        circleStandingSymbol("heightlimit_5d4"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_5D5 = registerBlock(
        commitDouble("heightlimit_5d5"),
        circleStandingSymbol("heightlimit_5d5"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_5D6 = registerBlock(
        commitDouble("heightlimit_5d6"),
        circleStandingSymbol("heightlimit_5d6"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_5D7 = registerBlock(
        commitDouble("heightlimit_5d7"),
        circleStandingSymbol("heightlimit_5d7"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_5D8 = registerBlock(
        commitDouble("heightlimit_5d8"),
        circleStandingSymbol("heightlimit_5d8"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_5D9 = registerBlock(
        commitDouble("heightlimit_5d9"),
        circleStandingSymbol("heightlimit_5d9"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_6 = registerBlock(
        commitDouble("heightlimit_6"),
        circleStandingSymbol("heightlimit_6"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_6D1 = registerBlock(
        commitDouble("heightlimit_6d1"),
        circleStandingSymbol("heightlimit_6d1"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_6D2 = registerBlock(
        commitDouble("heightlimit_6d2"),
        circleStandingSymbol("heightlimit_6d2"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_6D3 = registerBlock(
        commitDouble("heightlimit_6d3"),
        circleStandingSymbol("heightlimit_6d3"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_6D4 = registerBlock(
        commitDouble("heightlimit_6d4"),
        circleStandingSymbol("heightlimit_6d4"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_6D5 = registerBlock(
        commitDouble("heightlimit_6d5"),
        circleStandingSymbol("heightlimit_6d5"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_6D6 = registerBlock(
        commitDouble("heightlimit_6d6"),
        circleStandingSymbol("heightlimit_6d6"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_6D7 = registerBlock(
        commitDouble("heightlimit_6d7"),
        circleStandingSymbol("heightlimit_6d7"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_6D8 = registerBlock(
        commitDouble("heightlimit_6d8"),
        circleStandingSymbol("heightlimit_6d8"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_6D9 = registerBlock(
        commitDouble("heightlimit_6d9"),
        circleStandingSymbol("heightlimit_6d9"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_7 = registerBlock(
        commitDouble("heightlimit_7"),
        circleStandingSymbol("heightlimit_7"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_7D1 = registerBlock(
        commitDouble("heightlimit_7d1"),
        circleStandingSymbol("heightlimit_7d1"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_7D2 = registerBlock(
        commitDouble("heightlimit_7d2"),
        circleStandingSymbol("heightlimit_7d2"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_7D3 = registerBlock(
        commitDouble("heightlimit_7d3"),
        circleStandingSymbol("heightlimit_7d3"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_7D4 = registerBlock(
        commitDouble("heightlimit_7d4"),
        circleStandingSymbol("heightlimit_7d4"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_7D5 = registerBlock(
        commitDouble("heightlimit_7d5"),
        circleStandingSymbol("heightlimit_7d5"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_7D6 = registerBlock(
        commitDouble("heightlimit_7d6"),
        circleStandingSymbol("heightlimit_7d6"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_7D7 = registerBlock(
        commitDouble("heightlimit_7d7"),
        circleStandingSymbol("heightlimit_7d7"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_7D8 = registerBlock(
        commitDouble("heightlimit_7d8"),
        circleStandingSymbol("heightlimit_7d8"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_7D9 = registerBlock(
        commitDouble("heightlimit_7d9"),
        circleStandingSymbol("heightlimit_7d9"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_8 = registerBlock(
        commitDouble("heightlimit_8"),
        circleStandingSymbol("heightlimit_8"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_8D1 = registerBlock(
        commitDouble("heightlimit_8d1"),
        circleStandingSymbol("heightlimit_8d1"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_8D2 = registerBlock(
        commitDouble("heightlimit_8d2"),
        circleStandingSymbol("heightlimit_8d2"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_8D3 = registerBlock(
        commitDouble("heightlimit_8d3"),
        circleStandingSymbol("heightlimit_8d3"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_8D4 = registerBlock(
        commitDouble("heightlimit_8d4"),
        circleStandingSymbol("heightlimit_8d4"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_8D5 = registerBlock(
        commitDouble("heightlimit_8d5"),
        circleStandingSymbol("heightlimit_8d5"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_8D6 = registerBlock(
        commitDouble("heightlimit_8d6"),
        circleStandingSymbol("heightlimit_8d6"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_8D7 = registerBlock(
        commitDouble("heightlimit_8d7"),
        circleStandingSymbol("heightlimit_8d7"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_8D8 = registerBlock(
        commitDouble("heightlimit_8d8"),
        circleStandingSymbol("heightlimit_8d8"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_8D9 = registerBlock(
        commitDouble("heightlimit_8d9"),
        circleStandingSymbol("heightlimit_8d9"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_9 = registerBlock(
        commitDouble("heightlimit_9"),
        circleStandingSymbol("heightlimit_9"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_9D1 = registerBlock(
        commitDouble("heightlimit_9d1"),
        circleStandingSymbol("heightlimit_9d1"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_9D2 = registerBlock(
        commitDouble("heightlimit_9d2"),
        circleStandingSymbol("heightlimit_9d2"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_9D3 = registerBlock(
        commitDouble("heightlimit_9d3"),
        circleStandingSymbol("heightlimit_9d3"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_9D4 = registerBlock(
        commitDouble("heightlimit_9d4"),
        circleStandingSymbol("heightlimit_9d4"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_9D5 = registerBlock(
        commitDouble("heightlimit_9d5"),
        circleStandingSymbol("heightlimit_9d5"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_9D6 = registerBlock(
        commitDouble("heightlimit_9d6"),
        circleStandingSymbol("heightlimit_9d6"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_9D7 = registerBlock(
        commitDouble("heightlimit_9d7"),
        circleStandingSymbol("heightlimit_9d7"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_9D8 = registerBlock(
        commitDouble("heightlimit_9d8"),
        circleStandingSymbol("heightlimit_9d8"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_9D9 = registerBlock(
        commitDouble("heightlimit_9d9"),
        circleStandingSymbol("heightlimit_9d9"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HEIGHTLIMIT_10 = registerBlock(
        commitDouble("heightlimit_10"),
        circleStandingSymbol("heightlimit_10"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block PROHIBITION = registerBlock(
        commitDouble("prohibition"), circleStandingSymbol("prohibition"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block NO_U_TURN = registerBlock(
        commitDouble("no_u_turn"), circleStandingSymbol("no_u_turn"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block NO_LEFT_TURN = registerBlock(
        commitDouble("no_left_turn"), circleStandingSymbol("no_left_turn"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block NO_RIGHT_TURN = registerBlock(
        commitDouble("no_right_turn"), circleStandingSymbol("no_right_turn"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block NO_PARKING = registerBlock(
        commitDouble("no_parking"), circleStandingSymbol("no_parking"),
        Block.Settings.create().nonOpaque().strength(9f, 36f)
    );
    public static final Block HIGHWAY_1HM = registerBlock(
        commitDouble("highway_1hm"), highwayHmSign("highway_1hm"),
        Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
            st -> st.getFluidState().getFluid() == Fluids.WATER ?
                  MapColor.CYAN : MapColor.GREEN
        )
    );
    public static final Block HIGHWAY_2HM = registerBlock(
        commitDouble("highway_2hm"), highwayHmSign("highway_2hm"),
        Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
            st -> st.getFluidState().getFluid() == Fluids.WATER ?
                  MapColor.CYAN : MapColor.GREEN
        )
    );
    public static final Block HIGHWAY_3HM = registerBlock(
        commitDouble("highway_3hm"), highwayHmSign("highway_3hm"),
        Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
            st -> st.getFluidState().getFluid() == Fluids.WATER ?
                  MapColor.CYAN : MapColor.GREEN
        )
    );
    public static final Block HIGHWAY_4HM = registerBlock(
        commitDouble("highway_4hm"), highwayHmSign("highway_4hm"),
        Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
            st -> st.getFluidState().getFluid() == Fluids.WATER ?
                  MapColor.CYAN : MapColor.GREEN
        )
    );
    public static final Block HIGHWAY_5HM = registerBlock(
        commitDouble("highway_5hm"), highwayHmSign("highway_5hm"),
        Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
            st -> st.getFluidState().getFluid() == Fluids.WATER ?
                  MapColor.CYAN : MapColor.GREEN
        )
    );
    public static final Block HIGHWAY_6HM = registerBlock(
        commitDouble("highway_6hm"), highwayHmSign("highway_6hm"),
        Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
            st -> st.getFluidState().getFluid() == Fluids.WATER ?
                  MapColor.CYAN : MapColor.GREEN
        )
    );
    public static final Block HIGHWAY_7HM = registerBlock(
        commitDouble("highway_7hm"), highwayHmSign("highway_7hm"),
        Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
            st -> st.getFluidState().getFluid() == Fluids.WATER ?
                  MapColor.CYAN : MapColor.GREEN
        )
    );
    public static final Block HIGHWAY_8HM = registerBlock(
        commitDouble("highway_8hm"), highwayHmSign("highway_8hm"),
        Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
            st -> st.getFluidState().getFluid() == Fluids.WATER ?
                  MapColor.CYAN : MapColor.GREEN
        )
    );
    public static final Block HIGHWAY_9HM = registerBlock(
        commitDouble("highway_9hm"), highwayHmSign("highway_9hm"),
        Block.Settings.create().nonOpaque().strength(1f, 4f).mapColor(
            st -> st.getFluidState().getFluid() == Fluids.WATER ?
                  MapColor.CYAN : MapColor.GREEN
        )
    );
    public static final FloorLineEighthBlock
    FLOOR_LINE_EIGHTHS = registerBlock(
        commitAndGet(Registries.BLOCK, "floor_line_eighths"),
        FloorLineEighthBlock::new, Block.Settings.create().strength(4f, 4f)
    );
    public static final Block HIGHWAY_KM = registerBlock(
        commitDouble("highway_km"), highwayKmSign("highway_km"),
        Block.Settings.create().nonOpaque().strength(7f, 28f).mapColor(
            st -> st.getFluidState().getFluid() == Fluids.WATER ?
                  MapColor.CYAN : MapColor.GREEN
        )
    );
    public static final WideBoardBlock
    DISTANCE_DETECTION_0M_LEFT = registerBlock(
        commitDouble("distance_detection_0m_left"),
        wideBoard("distance_detection_0m_left"),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    DISTANCE_DETECTION_0M_RIGHT = registerBlock(
        commitDouble("distance_detection_0m_right"), wideBoardBunched(
            DISTANCE_DETECTION_0M_LEFT, "distance_detection_0m_right"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    DISTANCE_DETECTION_50M_LEFT = registerBlock(
        commitDouble("distance_detection_50m_left"),
        wideBoard("distance_detection_50m_left"),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    DISTANCE_DETECTION_50M_RIGHT = registerBlock(
        commitDouble("distance_detection_50m_right"), wideBoardBunched(
            DISTANCE_DETECTION_50M_LEFT, "distance_detection_50m_right"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    DISTANCE_DETECTION_100M_LEFT = registerBlock(
        commitDouble("distance_detection_100m_left"),
        wideBoard("distance_detection_100m_left"),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    DISTANCE_DETECTION_100M_RIGHT = registerBlock(
        commitDouble("distance_detection_100m_right"), wideBoardBunched(
            DISTANCE_DETECTION_100M_LEFT, "distance_detection_100m_right"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    DISTANCE_DETECTION_200M_LEFT = registerBlock(
        commitDouble("distance_detection_200m_left"),
        wideBoard("distance_detection_200m_left"),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    DISTANCE_DETECTION_200M_RIGHT = registerBlock(
        commitDouble("distance_detection_200m_right"), wideBoardBunched(
            DISTANCE_DETECTION_200M_LEFT, "distance_detection_200m_right"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE = registerBlock(
        commitDouble("highway_exit_distance_info_left_single"),
        highwayExitDistanceInfoLeft("highway_exit_distance_info_left_single"),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE = registerBlock(
        commitDouble("highway_exit_distance_info_middle_single"),
        highwayExitDistanceInfoMiddle(
            HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE,
            "highway_exit_distance_info_middle_single"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE = registerBlock(
        commitDouble("highway_exit_distance_info_right_single"),
        highwayExitDistanceInfoRight(
            HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE,
            "highway_exit_distance_info_right_single"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP = registerBlock(
        commitDouble("highway_exit_distance_info_left_top"),
        highwayExitDistanceInfoLeft("highway_exit_distance_info_left_top"),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP = registerBlock(
        commitDouble("highway_exit_distance_info_middle_top"),
        highwayExitDistanceInfoMiddle(
            HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP,
            "highway_exit_distance_info_middle_top"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP = registerBlock(
        commitDouble("highway_exit_distance_info_right_top"),
        highwayExitDistanceInfoRight(
            HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP,
            "highway_exit_distance_info_right_top"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE = registerBlock(
        commitDouble("highway_exit_distance_info_left_middle"),
        highwayExitDistanceInfoLeft("highway_exit_distance_info_left_middle"),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE = registerBlock(
        commitDouble("highway_exit_distance_info_middle_middle"),
        highwayExitDistanceInfoMiddle(
            HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE,
            "highway_exit_distance_info_middle_middle"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE = registerBlock(
        commitDouble("highway_exit_distance_info_right_middle"),
        highwayExitDistanceInfoRight(
            HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE,
            "highway_exit_distance_info_right_middle"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM = registerBlock(
        commitDouble("highway_exit_distance_info_left_bottom"),
        highwayExitDistanceInfoLeft("highway_exit_distance_info_left_bottom"),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM = registerBlock(
        commitDouble("highway_exit_distance_info_middle_bottom"),
        highwayExitDistanceInfoMiddle(
            HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM,
            "highway_exit_distance_info_middle_bottom"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM = registerBlock(
        commitDouble("highway_exit_distance_info_right_bottom"),
        highwayExitDistanceInfoRight(
            HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM,
            "highway_exit_distance_info_right_bottom"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final SquareQuarterDefaulted3Block BARRICADES_1 =
    registerBlock(commitAndGet(
        Registries.BLOCK, "barricades_1"
    ), settings -> new SquareQuarterDefaulted3Block(settings) {
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

        @Override
        public VoxelShape getOutlineShape(
            BlockState st, BlockView v, BlockPos p, ShapeContext c
        ) {
            boolean w = false;
            VoxelShape r = net.minecraft.util.shape.VoxelShapes.empty();
            switch (st.get(NORTHWEST).intValue()) {
                case 1:
                    w = true;
                    r = union(r, NW1);
                    break;
                case 2:
                    w = true;
                    r = union(r, NW2);
                    break;
            }
            switch (st.get(NORTHEAST).intValue()) {
                case 1:
                    w = true;
                    r = union(r, NE1);
                    break;
                case 2:
                    w = true;
                    r = union(r, NE2);
                    break;
            }
            switch (st.get(SOUTHWEST).intValue()) {
                case 1:
                    w = true;
                    r = union(r, SW1);
                    break;
                case 2:
                    w = true;
                    r = union(r, SW2);
                    break;
            }
            switch (st.get(SOUTHEAST).intValue()) {
                case 1:
                    w = true;
                    r = union(r, SE1);
                    break;
                case 2:
                    w = true;
                    r = union(r, SE2);
                    break;
            }
            return w ? r : W;
        }
    }, Block.Settings.create().strength(9f, 10.5f).mapColor(
        st -> st.getFluidState().getFluid() == Fluids.WATER ?
              MapColor.PURPLE : MapColor.ORANGE
    ));
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT1_UPPERLEFT = registerBlock(
        commitDouble("keep_space_variant1_upperleft"),
        wideBoard("keep_space_variant1_upperleft"),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT1_UPPER = registerBlock(
        commitDouble("keep_space_variant1_upper"),
        wideBoardBunched(
            KEEP_SPACE_VARIANT1_UPPERLEFT, "keep_space_variant1_upper"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT1_UPPERRIGHT = registerBlock(
        commitDouble("keep_space_variant1_upperright"),
        wideBoardBunched(
            KEEP_SPACE_VARIANT1_UPPERLEFT, "keep_space_variant1_upperright"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT1_LEFT = registerBlock(
        commitDouble("keep_space_variant1_left"),
        wideBoard("keep_space_variant1_left"),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT1_CENTER = registerBlock(
        commitDouble("keep_space_variant1_center"), wideBoardBunched(
            KEEP_SPACE_VARIANT1_LEFT, "keep_space_variant1_center"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT1_RIGHT = registerBlock(
        commitDouble("keep_space_variant1_right"), wideBoardBunched(
            KEEP_SPACE_VARIANT1_LEFT, "keep_space_variant1_right"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT1_LOWERLEFT = registerBlock(
        commitDouble("keep_space_variant1_lowerleft"),
        wideBoard("keep_space_variant1_lowerleft"),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT1_LOWER = registerBlock(
        commitDouble("keep_space_variant1_lower"), wideBoardBunched(
            KEEP_SPACE_VARIANT1_LOWERLEFT, "keep_space_variant1_lower"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT1_LOWERRIGHT = registerBlock(
        commitDouble("keep_space_variant1_lowerright"), wideBoardBunched(
            KEEP_SPACE_VARIANT1_LOWERLEFT, "keep_space_variant1_lowerright"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT2_UPPERLEFT = registerBlock(
        commitDouble("keep_space_variant2_upperleft"),
        wideBoard("keep_space_variant2_upperleft"),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT2_UPPER = registerBlock(
        commitDouble("keep_space_variant2_upper"), wideBoardBunched(
            KEEP_SPACE_VARIANT2_UPPERLEFT, "keep_space_variant2_upper"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT2_UPPERRIGHT = registerBlock(
        commitDouble("keep_space_variant2_upperright"), wideBoardBunched(
            KEEP_SPACE_VARIANT2_UPPERLEFT, "keep_space_variant2_upperright"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT2_LEFT = registerBlock(
        commitDouble("keep_space_variant2_left"),
        wideBoard("keep_space_variant2_left"),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT2_CENTER = registerBlock(
        commitDouble("keep_space_variant2_center"), wideBoardBunched(
            KEEP_SPACE_VARIANT2_LEFT, "keep_space_variant2_center"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT2_RIGHT = registerBlock(
        commitDouble("keep_space_variant2_right"), wideBoardBunched(
            KEEP_SPACE_VARIANT2_LEFT, "keep_space_variant2_right"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT2_LOWERLEFT = registerBlock(
        commitDouble("keep_space_variant2_lowerleft"),
        wideBoard("keep_space_variant2_lowerleft"),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT2_LOWER = registerBlock(
        commitDouble("keep_space_variant2_lower"), wideBoardBunched(
            KEEP_SPACE_VARIANT2_LOWERLEFT, "keep_space_variant2_lower"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final WideBoardBlock
    KEEP_SPACE_VARIANT2_LOWERRIGHT = registerBlock(
        commitDouble("keep_space_variant2_lowerright"), wideBoardBunched(
            KEEP_SPACE_VARIANT2_LOWERLEFT, "keep_space_variant2_lowerright"
        ),
        Block.Settings.create().strength(21f, 84f)
    );
    public static final Block WHITE_HALF1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("white_half1_cylindrical_rod"),
        half1CylindricalRod("white_half1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block ORANGE_HALF1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("orange_half1_cylindrical_rod"),
        half1CylindricalRod("orange_half1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block MAGENTA_HALF1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("magenta_half1_cylindrical_rod"),
        half1CylindricalRod("magenta_half1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block LIGHT_BLUE_HALF1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("light_blue_half1_cylindrical_rod"),
        half1CylindricalRod("light_blue_half1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block YELLOW_HALF1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("yellow_half1_cylindrical_rod"),
        half1CylindricalRod("yellow_half1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block LIME_HALF1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("lime_half1_cylindrical_rod"),
        half1CylindricalRod("lime_half1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block PINK_HALF1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("pink_half1_cylindrical_rod"),
        half1CylindricalRod("pink_half1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block GRAY_HALF1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("gray_half1_cylindrical_rod"),
        half1CylindricalRod("gray_half1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block LIGHT_GRAY_HALF1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("light_gray_half1_cylindrical_rod"),
        half1CylindricalRod("light_gray_half1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block CYAN_HALF1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("cyan_half1_cylindrical_rod"),
        half1CylindricalRod("cyan_half1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block PURPLE_HALF1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("purple_half1_cylindrical_rod"),
        half1CylindricalRod("purple_half1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block BLUE_HALF1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("blue_half1_cylindrical_rod"),
        half1CylindricalRod("blue_half1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block BROWN_HALF1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("brown_half1_cylindrical_rod"),
        half1CylindricalRod("brown_half1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block GREEN_HALF1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("green_half1_cylindrical_rod"),
        half1CylindricalRod("green_half1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block RED_HALF1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("red_half1_cylindrical_rod"),
        half1CylindricalRod("red_half1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block BLACK_HALF1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("black_half1_cylindrical_rod"),
        half1CylindricalRod("black_half1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block WHITE_FULL1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("white_full1_cylindrical_rod"),
        full1CylindricalRod("white_full1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block ORANGE_FULL1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("orange_full1_cylindrical_rod"),
        full1CylindricalRod("orange_full1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block MAGENTA_FULL1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("magenta_full1_cylindrical_rod"),
        full1CylindricalRod("magenta_full1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block LIGHT_BLUE_FULL1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("light_blue_full1_cylindrical_rod"),
        full1CylindricalRod("light_blue_full1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block YELLOW_FULL1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("yellow_full1_cylindrical_rod"),
        full1CylindricalRod("yellow_full1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block LIME_FULL1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("lime_full1_cylindrical_rod"),
        full1CylindricalRod("lime_full1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block PINK_FULL1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("pink_full1_cylindrical_rod"),
        full1CylindricalRod("pink_full1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block GRAY_FULL1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("gray_full1_cylindrical_rod"),
        full1CylindricalRod("gray_full1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block LIGHT_GRAY_FULL1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("light_gray_full1_cylindrical_rod"),
        full1CylindricalRod("light_gray_full1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block CYAN_FULL1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("cyan_full1_cylindrical_rod"),
        full1CylindricalRod("cyan_full1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block PURPLE_FULL1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("purple_full1_cylindrical_rod"),
        full1CylindricalRod("purple_full1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block BLUE_FULL1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("blue_full1_cylindrical_rod"),
        full1CylindricalRod("blue_full1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block BROWN_FULL1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("brown_full1_cylindrical_rod"),
        full1CylindricalRod("brown_full1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block GREEN_FULL1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("green_full1_cylindrical_rod"),
        full1CylindricalRod("green_full1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block RED_FULL1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("red_full1_cylindrical_rod"),
        full1CylindricalRod("red_full1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block BLACK_FULL1_CYLINDRICAL_ROD = registerBlock(
        commitDouble("black_full1_cylindrical_rod"),
        full1CylindricalRod("black_full1_cylindrical_rod"),
        Block.Settings.create().strength(5f, 20f)
    );
    public static final Block WHITE_ROD_WITH_LAMP = registerBlock(
        commitDouble("white_rod_with_lamp"),
        rodWithLamp("white_rod_with_lamp"),
        Block.Settings.create().strength(5f, 20f)
                      .luminance(RodWithLampBlock.LUMINANCE)
    );
    public static final Block ORANGE_ROD_WITH_LAMP = registerBlock(
        commitDouble("orange_rod_with_lamp"),
        rodWithLamp("orange_rod_with_lamp"),
        Block.Settings.create().strength(5f, 20f)
                      .luminance(RodWithLampBlock.LUMINANCE)
    );
    public static final Block MAGENTA_ROD_WITH_LAMP = registerBlock(
        commitDouble("magenta_rod_with_lamp"),
        rodWithLamp("magenta_rod_with_lamp"),
        Block.Settings.create().strength(5f, 20f)
                      .luminance(RodWithLampBlock.LUMINANCE)
    );
    public static final Block LIGHT_BLUE_ROD_WITH_LAMP = registerBlock(
        commitDouble("light_blue_rod_with_lamp"),
        rodWithLamp("light_blue_rod_with_lamp"),
        Block.Settings.create().strength(5f, 20f)
                      .luminance(RodWithLampBlock.LUMINANCE)
    );
    public static final Block YELLOW_ROD_WITH_LAMP = registerBlock(
        commitDouble("yellow_rod_with_lamp"),
        rodWithLamp("yellow_rod_with_lamp"),
        Block.Settings.create().strength(5f, 20f)
                      .luminance(RodWithLampBlock.LUMINANCE)
    );
    public static final Block LIME_ROD_WITH_LAMP = registerBlock(
        commitDouble("lime_rod_with_lamp"),
        rodWithLamp("lime_rod_with_lamp"),
        Block.Settings.create().strength(5f, 20f)
                      .luminance(RodWithLampBlock.LUMINANCE)
    );
    public static final Block PINK_ROD_WITH_LAMP = registerBlock(
        commitDouble("pink_rod_with_lamp"),
        rodWithLamp("pink_rod_with_lamp"),
        Block.Settings.create().strength(5f, 20f)
                      .luminance(RodWithLampBlock.LUMINANCE)
    );
    public static final Block GRAY_ROD_WITH_LAMP = registerBlock(
        commitDouble("gray_rod_with_lamp"),
        rodWithLamp("gray_rod_with_lamp"),
        Block.Settings.create().strength(5f, 20f)
                      .luminance(RodWithLampBlock.LUMINANCE)
    );
    public static final Block LIGHT_GRAY_ROD_WITH_LAMP = registerBlock(
        commitDouble("light_gray_rod_with_lamp"),
        rodWithLamp("light_gray_rod_with_lamp"),
        Block.Settings.create().strength(5f, 20f)
                      .luminance(RodWithLampBlock.LUMINANCE)
    );
    public static final Block CYAN_ROD_WITH_LAMP = registerBlock(
        commitDouble("cyan_rod_with_lamp"),
        rodWithLamp("cyan_rod_with_lamp"),
        Block.Settings.create().strength(5f, 20f)
                      .luminance(RodWithLampBlock.LUMINANCE)
    );
    public static final Block PURPLE_ROD_WITH_LAMP = registerBlock(
        commitDouble("purple_rod_with_lamp"),
        rodWithLamp("purple_rod_with_lamp"),
        Block.Settings.create().strength(5f, 20f)
                      .luminance(RodWithLampBlock.LUMINANCE)
    );
    public static final Block BLUE_ROD_WITH_LAMP = registerBlock(
        commitDouble("blue_rod_with_lamp"),
        rodWithLamp("blue_rod_with_lamp"),
        Block.Settings.create().strength(5f, 20f)
                      .luminance(RodWithLampBlock.LUMINANCE)
    );
    public static final Block BROWN_ROD_WITH_LAMP = registerBlock(
        commitDouble("brown_rod_with_lamp"),
        rodWithLamp("brown_rod_with_lamp"),
        Block.Settings.create().strength(5f, 20f)
                      .luminance(RodWithLampBlock.LUMINANCE)
    );
    public static final Block GREEN_ROD_WITH_LAMP = registerBlock(
        commitDouble("green_rod_with_lamp"),
        rodWithLamp("green_rod_with_lamp"),
        Block.Settings.create().strength(5f, 20f)
                      .luminance(RodWithLampBlock.LUMINANCE)
    );
    public static final Block RED_ROD_WITH_LAMP = registerBlock(
        commitDouble("red_rod_with_lamp"),
        rodWithLamp("red_rod_with_lamp"),
        Block.Settings.create().strength(5f, 20f)
                      .luminance(RodWithLampBlock.LUMINANCE)
    );
    public static final Block BLACK_ROD_WITH_LAMP = registerBlock(
        commitDouble("black_rod_with_lamp"),
        rodWithLamp("black_rod_with_lamp"),
        Block.Settings.create().strength(5f, 20f)
                      .luminance(RodWithLampBlock.LUMINANCE)
    );
    public static final Block FULL_SQUARE_BACKBOARD = registerBlock(
        commitDouble("full_square_backboard"),
        settings -> new DoubleFaceFacingBlock(settings) {
            public static final VoxelShape SHAPE_DEFAULT =
            cuboid(.3125, 0, .3125, .6875, 1, .6875);

            @Override
            public VoxelShape getOutlineShape(
                BlockState st, BlockView v, BlockPos p, ShapeContext c
            ) {
                switch (st.get(DoubleFaceFacing.FACING).id) {
                    case 0: return WideBoardBlock.SHAPE0;
                    case 4: return WideBoardBlock.SHAPE1;
                    case 8: return WideBoardBlock.SHAPE2;
                    case 12: return WideBoardBlock.SHAPE3;
                    case 16: return WideBoardBlock.SHAPE4;
                    case 20: return WideBoardBlock.SHAPE5;
                    case 24: return WideBoardBlock.SHAPE6;
                    case 25: return WideBoardBlock.SHAPE7;
                    case 26: return WideBoardBlock.SHAPE8;
                    case 27: return WideBoardBlock.SHAPE9;
                    default: return SHAPE_DEFAULT;
                }
            }
        }, Block.Settings.create().strength(21f, 84f)
    );
    public static final Block WHITE_DOTTED4_TP = registerBlock(
        commitDouble("white_dotted4_tp"),
        dottedTP("white_dotted4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block ORANGE_DOTTED4_TP = registerBlock(
        commitDouble("orange_dotted4_tp"),
        dottedTP("orange_dotted4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block MAGENTA_DOTTED4_TP = registerBlock(
        commitDouble("magenta_dotted4_tp"),
        dottedTP("magenta_dotted4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_BLUE_DOTTED4_TP = registerBlock(
        commitDouble("light_blue_dotted4_tp"),
        dottedTP("light_blue_dotted4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block YELLOW_DOTTED4_TP = registerBlock(
        commitDouble("yellow_dotted4_tp"),
        dottedTP("yellow_dotted4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIME_DOTTED4_TP = registerBlock(
        commitDouble("lime_dotted4_tp"),
        dottedTP("lime_dotted4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PINK_DOTTED4_TP = registerBlock(
        commitDouble("pink_dotted4_tp"),
        dottedTP("pink_dotted4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GRAY_DOTTED4_TP = registerBlock(
        commitDouble("gray_dotted4_tp"),
        dottedTP("gray_dotted4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_GRAY_DOTTED4_TP = registerBlock(
        commitDouble("light_gray_dotted4_tp"),
        dottedTP("light_gray_dotted4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block CYAN_DOTTED4_TP = registerBlock(
        commitDouble("cyan_dotted4_tp"),
        dottedTP("cyan_dotted4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PURPLE_DOTTED4_TP = registerBlock(
        commitDouble("purple_dotted4_tp"),
        dottedTP("purple_dotted4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLUE_DOTTED4_TP = registerBlock(
        commitDouble("blue_dotted4_tp"),
        dottedTP("blue_dotted4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BROWN_DOTTED4_TP = registerBlock(
        commitDouble("brown_dotted4_tp"),
        dottedTP("brown_dotted4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GREEN_DOTTED4_TP = registerBlock(
        commitDouble("green_dotted4_tp"),
        dottedTP("green_dotted4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block RED_DOTTED4_TP = registerBlock(
        commitDouble("red_dotted4_tp"),
        dottedTP("red_dotted4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLACK_DOTTED4_TP = registerBlock(
        commitDouble("black_dotted4_tp"),
        dottedTP("black_dotted4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block WHITE_DOTTED5_TP = registerBlock(
        commitDouble("white_dotted5_tp"),
        dottedTP("white_dotted5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block ORANGE_DOTTED5_TP = registerBlock(
        commitDouble("orange_dotted5_tp"),
        dottedTP("orange_dotted5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block MAGENTA_DOTTED5_TP = registerBlock(
        commitDouble("magenta_dotted5_tp"),
        dottedTP("magenta_dotted5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_BLUE_DOTTED5_TP = registerBlock(
        commitDouble("light_blue_dotted5_tp"),
        dottedTP("light_blue_dotted5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block YELLOW_DOTTED5_TP = registerBlock(
        commitDouble("yellow_dotted5_tp"),
        dottedTP("yellow_dotted5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIME_DOTTED5_TP = registerBlock(
        commitDouble("lime_dotted5_tp"),
        dottedTP("lime_dotted5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PINK_DOTTED5_TP = registerBlock(
        commitDouble("pink_dotted5_tp"),
        dottedTP("pink_dotted5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GRAY_DOTTED5_TP = registerBlock(
        commitDouble("gray_dotted5_tp"),
        dottedTP("gray_dotted5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_GRAY_DOTTED5_TP = registerBlock(
        commitDouble("light_gray_dotted5_tp"),
        dottedTP("light_gray_dotted5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block CYAN_DOTTED5_TP = registerBlock(
        commitDouble("cyan_dotted5_tp"),
        dottedTP("cyan_dotted5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PURPLE_DOTTED5_TP = registerBlock(
        commitDouble("purple_dotted5_tp"),
        dottedTP("purple_dotted5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLUE_DOTTED5_TP = registerBlock(
        commitDouble("blue_dotted5_tp"),
        dottedTP("blue_dotted5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BROWN_DOTTED5_TP = registerBlock(
        commitDouble("brown_dotted5_tp"),
        dottedTP("brown_dotted5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GREEN_DOTTED5_TP = registerBlock(
        commitDouble("green_dotted5_tp"),
        dottedTP("green_dotted5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block RED_DOTTED5_TP = registerBlock(
        commitDouble("red_dotted5_tp"),
        dottedTP("red_dotted5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLACK_DOTTED5_TP = registerBlock(
        commitDouble("black_dotted5_tp"),
        dottedTP("black_dotted5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block WHITE_DOTTED6_TP = registerBlock(
        commitDouble("white_dotted6_tp"),
        dottedTP("white_dotted6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block ORANGE_DOTTED6_TP = registerBlock(
        commitDouble("orange_dotted6_tp"),
        dottedTP("orange_dotted6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block MAGENTA_DOTTED6_TP = registerBlock(
        commitDouble("magenta_dotted6_tp"),
        dottedTP("magenta_dotted6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_BLUE_DOTTED6_TP = registerBlock(
        commitDouble("light_blue_dotted6_tp"),
        dottedTP("light_blue_dotted6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block YELLOW_DOTTED6_TP = registerBlock(
        commitDouble("yellow_dotted6_tp"),
        dottedTP("yellow_dotted6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIME_DOTTED6_TP = registerBlock(
        commitDouble("lime_dotted6_tp"),
        dottedTP("lime_dotted6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PINK_DOTTED6_TP = registerBlock(
        commitDouble("pink_dotted6_tp"),
        dottedTP("pink_dotted6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GRAY_DOTTED6_TP = registerBlock(
        commitDouble("gray_dotted6_tp"),
        dottedTP("gray_dotted6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_GRAY_DOTTED6_TP = registerBlock(
        commitDouble("light_gray_dotted6_tp"),
        dottedTP("light_gray_dotted6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block CYAN_DOTTED6_TP = registerBlock(
        commitDouble("cyan_dotted6_tp"),
        dottedTP("cyan_dotted6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PURPLE_DOTTED6_TP = registerBlock(
        commitDouble("purple_dotted6_tp"),
        dottedTP("purple_dotted6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLUE_DOTTED6_TP = registerBlock(
        commitDouble("blue_dotted6_tp"),
        dottedTP("blue_dotted6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BROWN_DOTTED6_TP = registerBlock(
        commitDouble("brown_dotted6_tp"),
        dottedTP("brown_dotted6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GREEN_DOTTED6_TP = registerBlock(
        commitDouble("green_dotted6_tp"),
        dottedTP("green_dotted6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block RED_DOTTED6_TP = registerBlock(
        commitDouble("red_dotted6_tp"),
        dottedTP("red_dotted6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLACK_DOTTED6_TP = registerBlock(
        commitDouble("black_dotted6_tp"),
        dottedTP("black_dotted6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block WHITE_DOTTED7_TP = registerBlock(
        commitDouble("white_dotted7_tp"),
        dottedTP("white_dotted7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block ORANGE_DOTTED7_TP = registerBlock(
        commitDouble("orange_dotted7_tp"),
        dottedTP("orange_dotted7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block MAGENTA_DOTTED7_TP = registerBlock(
        commitDouble("magenta_dotted7_tp"),
        dottedTP("magenta_dotted7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_BLUE_DOTTED7_TP = registerBlock(
        commitDouble("light_blue_dotted7_tp"),
        dottedTP("light_blue_dotted7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block YELLOW_DOTTED7_TP = registerBlock(
        commitDouble("yellow_dotted7_tp"),
        dottedTP("yellow_dotted7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIME_DOTTED7_TP = registerBlock(
        commitDouble("lime_dotted7_tp"),
        dottedTP("lime_dotted7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PINK_DOTTED7_TP = registerBlock(
        commitDouble("pink_dotted7_tp"),
        dottedTP("pink_dotted7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GRAY_DOTTED7_TP = registerBlock(
        commitDouble("gray_dotted7_tp"),
        dottedTP("gray_dotted7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_GRAY_DOTTED7_TP = registerBlock(
        commitDouble("light_gray_dotted7_tp"),
        dottedTP("light_gray_dotted7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block CYAN_DOTTED7_TP = registerBlock(
        commitDouble("cyan_dotted7_tp"),
        dottedTP("cyan_dotted7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PURPLE_DOTTED7_TP = registerBlock(
        commitDouble("purple_dotted7_tp"),
        dottedTP("purple_dotted7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLUE_DOTTED7_TP = registerBlock(
        commitDouble("blue_dotted7_tp"),
        dottedTP("blue_dotted7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BROWN_DOTTED7_TP = registerBlock(
        commitDouble("brown_dotted7_tp"),
        dottedTP("brown_dotted7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GREEN_DOTTED7_TP = registerBlock(
        commitDouble("green_dotted7_tp"),
        dottedTP("green_dotted7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block RED_DOTTED7_TP = registerBlock(
        commitDouble("red_dotted7_tp"),
        dottedTP("red_dotted7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLACK_DOTTED7_TP = registerBlock(
        commitDouble("black_dotted7_tp"),
        dottedTP("black_dotted7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block WHITE_DOTTED8_TP = registerBlock(
        commitDouble("white_dotted8_tp"),
        dottedTP("white_dotted8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block ORANGE_DOTTED8_TP = registerBlock(
        commitDouble("orange_dotted8_tp"),
        dottedTP("orange_dotted8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block MAGENTA_DOTTED8_TP = registerBlock(
        commitDouble("magenta_dotted8_tp"),
        dottedTP("magenta_dotted8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_BLUE_DOTTED8_TP = registerBlock(
        commitDouble("light_blue_dotted8_tp"),
        dottedTP("light_blue_dotted8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block YELLOW_DOTTED8_TP = registerBlock(
        commitDouble("yellow_dotted8_tp"),
        dottedTP("yellow_dotted8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIME_DOTTED8_TP = registerBlock(
        commitDouble("lime_dotted8_tp"),
        dottedTP("lime_dotted8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PINK_DOTTED8_TP = registerBlock(
        commitDouble("pink_dotted8_tp"),
        dottedTP("pink_dotted8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GRAY_DOTTED8_TP = registerBlock(
        commitDouble("gray_dotted8_tp"),
        dottedTP("gray_dotted8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_GRAY_DOTTED8_TP = registerBlock(
        commitDouble("light_gray_dotted8_tp"),
        dottedTP("light_gray_dotted8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block CYAN_DOTTED8_TP = registerBlock(
        commitDouble("cyan_dotted8_tp"),
        dottedTP("cyan_dotted8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PURPLE_DOTTED8_TP = registerBlock(
        commitDouble("purple_dotted8_tp"),
        dottedTP("purple_dotted8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLUE_DOTTED8_TP = registerBlock(
        commitDouble("blue_dotted8_tp"),
        dottedTP("blue_dotted8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BROWN_DOTTED8_TP = registerBlock(
        commitDouble("brown_dotted8_tp"),
        dottedTP("brown_dotted8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GREEN_DOTTED8_TP = registerBlock(
        commitDouble("green_dotted8_tp"),
        dottedTP("green_dotted8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block RED_DOTTED8_TP = registerBlock(
        commitDouble("red_dotted8_tp"),
        dottedTP("red_dotted8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLACK_DOTTED8_TP = registerBlock(
        commitDouble("black_dotted8_tp"),
        dottedTP("black_dotted8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block WHITE_DOTTED9_TP = registerBlock(
        commitDouble("white_dotted9_tp"),
        dottedTP("white_dotted9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block ORANGE_DOTTED9_TP = registerBlock(
        commitDouble("orange_dotted9_tp"),
        dottedTP("orange_dotted9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block MAGENTA_DOTTED9_TP = registerBlock(
        commitDouble("magenta_dotted9_tp"),
        dottedTP("magenta_dotted9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_BLUE_DOTTED9_TP = registerBlock(
        commitDouble("light_blue_dotted9_tp"),
        dottedTP("light_blue_dotted9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block YELLOW_DOTTED9_TP = registerBlock(
        commitDouble("yellow_dotted9_tp"),
        dottedTP("yellow_dotted9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIME_DOTTED9_TP = registerBlock(
        commitDouble("lime_dotted9_tp"),
        dottedTP("lime_dotted9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PINK_DOTTED9_TP = registerBlock(
        commitDouble("pink_dotted9_tp"),
        dottedTP("pink_dotted9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GRAY_DOTTED9_TP = registerBlock(
        commitDouble("gray_dotted9_tp"),
        dottedTP("gray_dotted9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_GRAY_DOTTED9_TP = registerBlock(
        commitDouble("light_gray_dotted9_tp"),
        dottedTP("light_gray_dotted9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block CYAN_DOTTED9_TP = registerBlock(
        commitDouble("cyan_dotted9_tp"),
        dottedTP("cyan_dotted9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PURPLE_DOTTED9_TP = registerBlock(
        commitDouble("purple_dotted9_tp"),
        dottedTP("purple_dotted9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLUE_DOTTED9_TP = registerBlock(
        commitDouble("blue_dotted9_tp"),
        dottedTP("blue_dotted9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BROWN_DOTTED9_TP = registerBlock(
        commitDouble("brown_dotted9_tp"),
        dottedTP("brown_dotted9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GREEN_DOTTED9_TP = registerBlock(
        commitDouble("green_dotted9_tp"),
        dottedTP("green_dotted9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block RED_DOTTED9_TP = registerBlock(
        commitDouble("red_dotted9_tp"),
        dottedTP("red_dotted9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLACK_DOTTED9_TP = registerBlock(
        commitDouble("black_dotted9_tp"),
        dottedTP("black_dotted9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block WHITE_DOTTED10_TP = registerBlock(
        commitDouble("white_dotted10_tp"),
        dottedTP("white_dotted10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block ORANGE_DOTTED10_TP = registerBlock(
        commitDouble("orange_dotted10_tp"),
        dottedTP("orange_dotted10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block MAGENTA_DOTTED10_TP = registerBlock(
        commitDouble("magenta_dotted10_tp"),
        dottedTP("magenta_dotted10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_BLUE_DOTTED10_TP = registerBlock(
        commitDouble("light_blue_dotted10_tp"),
        dottedTP("light_blue_dotted10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block YELLOW_DOTTED10_TP = registerBlock(
        commitDouble("yellow_dotted10_tp"),
        dottedTP("yellow_dotted10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIME_DOTTED10_TP = registerBlock(
        commitDouble("lime_dotted10_tp"),
        dottedTP("lime_dotted10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PINK_DOTTED10_TP = registerBlock(
        commitDouble("pink_dotted10_tp"),
        dottedTP("pink_dotted10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GRAY_DOTTED10_TP = registerBlock(
        commitDouble("gray_dotted10_tp"),
        dottedTP("gray_dotted10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_GRAY_DOTTED10_TP = registerBlock(
        commitDouble("light_gray_dotted10_tp"),
        dottedTP("light_gray_dotted10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block CYAN_DOTTED10_TP = registerBlock(
        commitDouble("cyan_dotted10_tp"),
        dottedTP("cyan_dotted10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PURPLE_DOTTED10_TP = registerBlock(
        commitDouble("purple_dotted10_tp"),
        dottedTP("purple_dotted10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLUE_DOTTED10_TP = registerBlock(
        commitDouble("blue_dotted10_tp"),
        dottedTP("blue_dotted10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BROWN_DOTTED10_TP = registerBlock(
        commitDouble("brown_dotted10_tp"),
        dottedTP("brown_dotted10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GREEN_DOTTED10_TP = registerBlock(
        commitDouble("green_dotted10_tp"),
        dottedTP("green_dotted10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block RED_DOTTED10_TP = registerBlock(
        commitDouble("red_dotted10_tp"),
        dottedTP("red_dotted10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLACK_DOTTED10_TP = registerBlock(
        commitDouble("black_dotted10_tp"),
        dottedTP("black_dotted10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block WHITE_LINED4_TP = registerBlock(
        commitDouble("white_lined4_tp"),
        linedTP("white_lined4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block ORANGE_LINED4_TP = registerBlock(
        commitDouble("orange_lined4_tp"),
        linedTP("orange_lined4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block MAGENTA_LINED4_TP = registerBlock(
        commitDouble("magenta_lined4_tp"),
        linedTP("magenta_lined4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_BLUE_LINED4_TP = registerBlock(
        commitDouble("light_blue_lined4_tp"),
        linedTP("light_blue_lined4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block YELLOW_LINED4_TP = registerBlock(
        commitDouble("yellow_lined4_tp"),
        linedTP("yellow_lined4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIME_LINED4_TP = registerBlock(
        commitDouble("lime_lined4_tp"),
        linedTP("lime_lined4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PINK_LINED4_TP = registerBlock(
        commitDouble("pink_lined4_tp"),
        linedTP("pink_lined4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GRAY_LINED4_TP = registerBlock(
        commitDouble("gray_lined4_tp"),
        linedTP("gray_lined4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_GRAY_LINED4_TP = registerBlock(
        commitDouble("light_gray_lined4_tp"),
        linedTP("light_gray_lined4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block CYAN_LINED4_TP = registerBlock(
        commitDouble("cyan_lined4_tp"),
        linedTP("cyan_lined4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PURPLE_LINED4_TP = registerBlock(
        commitDouble("purple_lined4_tp"),
        linedTP("purple_lined4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLUE_LINED4_TP = registerBlock(
        commitDouble("blue_lined4_tp"),
        linedTP("blue_lined4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BROWN_LINED4_TP = registerBlock(
        commitDouble("brown_lined4_tp"),
        linedTP("brown_lined4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GREEN_LINED4_TP = registerBlock(
        commitDouble("green_lined4_tp"),
        linedTP("green_lined4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block RED_LINED4_TP = registerBlock(
        commitDouble("red_lined4_tp"),
        linedTP("red_lined4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLACK_LINED4_TP = registerBlock(
        commitDouble("black_lined4_tp"),
        linedTP("black_lined4_tp", (byte)4),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block WHITE_LINED5_TP = registerBlock(
        commitDouble("white_lined5_tp"),
        linedTP("white_lined5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block ORANGE_LINED5_TP = registerBlock(
        commitDouble("orange_lined5_tp"),
        linedTP("orange_lined5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block MAGENTA_LINED5_TP = registerBlock(
        commitDouble("magenta_lined5_tp"),
        linedTP("magenta_lined5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_BLUE_LINED5_TP = registerBlock(
        commitDouble("light_blue_lined5_tp"),
        linedTP("light_blue_lined5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block YELLOW_LINED5_TP = registerBlock(
        commitDouble("yellow_lined5_tp"),
        linedTP("yellow_lined5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIME_LINED5_TP = registerBlock(
        commitDouble("lime_lined5_tp"),
        linedTP("lime_lined5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PINK_LINED5_TP = registerBlock(
        commitDouble("pink_lined5_tp"),
        linedTP("pink_lined5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GRAY_LINED5_TP = registerBlock(
        commitDouble("gray_lined5_tp"),
        linedTP("gray_lined5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_GRAY_LINED5_TP = registerBlock(
        commitDouble("light_gray_lined5_tp"),
        linedTP("light_gray_lined5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block CYAN_LINED5_TP = registerBlock(
        commitDouble("cyan_lined5_tp"),
        linedTP("cyan_lined5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PURPLE_LINED5_TP = registerBlock(
        commitDouble("purple_lined5_tp"),
        linedTP("purple_lined5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLUE_LINED5_TP = registerBlock(
        commitDouble("blue_lined5_tp"),
        linedTP("blue_lined5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BROWN_LINED5_TP = registerBlock(
        commitDouble("brown_lined5_tp"),
        linedTP("brown_lined5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GREEN_LINED5_TP = registerBlock(
        commitDouble("green_lined5_tp"),
        linedTP("green_lined5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block RED_LINED5_TP = registerBlock(
        commitDouble("red_lined5_tp"),
        linedTP("red_lined5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLACK_LINED5_TP = registerBlock(
        commitDouble("black_lined5_tp"),
        linedTP("black_lined5_tp", (byte)5),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block WHITE_LINED6_TP = registerBlock(
        commitDouble("white_lined6_tp"),
        linedTP("white_lined6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block ORANGE_LINED6_TP = registerBlock(
        commitDouble("orange_lined6_tp"),
        linedTP("orange_lined6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block MAGENTA_LINED6_TP = registerBlock(
        commitDouble("magenta_lined6_tp"),
        linedTP("magenta_lined6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_BLUE_LINED6_TP = registerBlock(
        commitDouble("light_blue_lined6_tp"),
        linedTP("light_blue_lined6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block YELLOW_LINED6_TP = registerBlock(
        commitDouble("yellow_lined6_tp"),
        linedTP("yellow_lined6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIME_LINED6_TP = registerBlock(
        commitDouble("lime_lined6_tp"),
        linedTP("lime_lined6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PINK_LINED6_TP = registerBlock(
        commitDouble("pink_lined6_tp"),
        linedTP("pink_lined6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GRAY_LINED6_TP = registerBlock(
        commitDouble("gray_lined6_tp"),
        linedTP("gray_lined6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_GRAY_LINED6_TP = registerBlock(
        commitDouble("light_gray_lined6_tp"),
        linedTP("light_gray_lined6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block CYAN_LINED6_TP = registerBlock(
        commitDouble("cyan_lined6_tp"),
        linedTP("cyan_lined6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PURPLE_LINED6_TP = registerBlock(
        commitDouble("purple_lined6_tp"),
        linedTP("purple_lined6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLUE_LINED6_TP = registerBlock(
        commitDouble("blue_lined6_tp"),
        linedTP("blue_lined6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BROWN_LINED6_TP = registerBlock(
        commitDouble("brown_lined6_tp"),
        linedTP("brown_lined6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GREEN_LINED6_TP = registerBlock(
        commitDouble("green_lined6_tp"),
        linedTP("green_lined6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block RED_LINED6_TP = registerBlock(
        commitDouble("red_lined6_tp"),
        linedTP("red_lined6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLACK_LINED6_TP = registerBlock(
        commitDouble("black_lined6_tp"),
        linedTP("black_lined6_tp", (byte)6),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block WHITE_LINED7_TP = registerBlock(
        commitDouble("white_lined7_tp"),
        linedTP("white_lined7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block ORANGE_LINED7_TP = registerBlock(
        commitDouble("orange_lined7_tp"),
        linedTP("orange_lined7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block MAGENTA_LINED7_TP = registerBlock(
        commitDouble("magenta_lined7_tp"),
        linedTP("magenta_lined7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_BLUE_LINED7_TP = registerBlock(
        commitDouble("light_blue_lined7_tp"),
        linedTP("light_blue_lined7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block YELLOW_LINED7_TP = registerBlock(
        commitDouble("yellow_lined7_tp"),
        linedTP("yellow_lined7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIME_LINED7_TP = registerBlock(
        commitDouble("lime_lined7_tp"),
        linedTP("lime_lined7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PINK_LINED7_TP = registerBlock(
        commitDouble("pink_lined7_tp"),
        linedTP("pink_lined7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GRAY_LINED7_TP = registerBlock(
        commitDouble("gray_lined7_tp"),
        linedTP("gray_lined7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_GRAY_LINED7_TP = registerBlock(
        commitDouble("light_gray_lined7_tp"),
        linedTP("light_gray_lined7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block CYAN_LINED7_TP = registerBlock(
        commitDouble("cyan_lined7_tp"),
        linedTP("cyan_lined7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PURPLE_LINED7_TP = registerBlock(
        commitDouble("purple_lined7_tp"),
        linedTP("purple_lined7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLUE_LINED7_TP = registerBlock(
        commitDouble("blue_lined7_tp"),
        linedTP("blue_lined7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BROWN_LINED7_TP = registerBlock(
        commitDouble("brown_lined7_tp"),
        linedTP("brown_lined7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GREEN_LINED7_TP = registerBlock(
        commitDouble("green_lined7_tp"),
        linedTP("green_lined7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block RED_LINED7_TP = registerBlock(
        commitDouble("red_lined7_tp"),
        linedTP("red_lined7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLACK_LINED7_TP = registerBlock(
        commitDouble("black_lined7_tp"),
        linedTP("black_lined7_tp", (byte)7),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block WHITE_LINED8_TP = registerBlock(
        commitDouble("white_lined8_tp"),
        linedTP("white_lined8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block ORANGE_LINED8_TP = registerBlock(
        commitDouble("orange_lined8_tp"),
        linedTP("orange_lined8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block MAGENTA_LINED8_TP = registerBlock(
        commitDouble("magenta_lined8_tp"),
        linedTP("magenta_lined8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_BLUE_LINED8_TP = registerBlock(
        commitDouble("light_blue_lined8_tp"),
        linedTP("light_blue_lined8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block YELLOW_LINED8_TP = registerBlock(
        commitDouble("yellow_lined8_tp"),
        linedTP("yellow_lined8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIME_LINED8_TP = registerBlock(
        commitDouble("lime_lined8_tp"),
        linedTP("lime_lined8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PINK_LINED8_TP = registerBlock(
        commitDouble("pink_lined8_tp"),
        linedTP("pink_lined8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GRAY_LINED8_TP = registerBlock(
        commitDouble("gray_lined8_tp"),
        linedTP("gray_lined8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_GRAY_LINED8_TP = registerBlock(
        commitDouble("light_gray_lined8_tp"),
        linedTP("light_gray_lined8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block CYAN_LINED8_TP = registerBlock(
        commitDouble("cyan_lined8_tp"),
        linedTP("cyan_lined8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PURPLE_LINED8_TP = registerBlock(
        commitDouble("purple_lined8_tp"),
        linedTP("purple_lined8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLUE_LINED8_TP = registerBlock(
        commitDouble("blue_lined8_tp"),
        linedTP("blue_lined8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BROWN_LINED8_TP = registerBlock(
        commitDouble("brown_lined8_tp"),
        linedTP("brown_lined8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GREEN_LINED8_TP = registerBlock(
        commitDouble("green_lined8_tp"),
        linedTP("green_lined8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block RED_LINED8_TP = registerBlock(
        commitDouble("red_lined8_tp"),
        linedTP("red_lined8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLACK_LINED8_TP = registerBlock(
        commitDouble("black_lined8_tp"),
        linedTP("black_lined8_tp", (byte)8),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block WHITE_LINED9_TP = registerBlock(
        commitDouble("white_lined9_tp"),
        linedTP("white_lined9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block ORANGE_LINED9_TP = registerBlock(
        commitDouble("orange_lined9_tp"),
        linedTP("orange_lined9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block MAGENTA_LINED9_TP = registerBlock(
        commitDouble("magenta_lined9_tp"),
        linedTP("magenta_lined9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_BLUE_LINED9_TP = registerBlock(
        commitDouble("light_blue_lined9_tp"),
        linedTP("light_blue_lined9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block YELLOW_LINED9_TP = registerBlock(
        commitDouble("yellow_lined9_tp"),
        linedTP("yellow_lined9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIME_LINED9_TP = registerBlock(
        commitDouble("lime_lined9_tp"),
        linedTP("lime_lined9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PINK_LINED9_TP = registerBlock(
        commitDouble("pink_lined9_tp"),
        linedTP("pink_lined9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GRAY_LINED9_TP = registerBlock(
        commitDouble("gray_lined9_tp"),
        linedTP("gray_lined9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_GRAY_LINED9_TP = registerBlock(
        commitDouble("light_gray_lined9_tp"),
        linedTP("light_gray_lined9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block CYAN_LINED9_TP = registerBlock(
        commitDouble("cyan_lined9_tp"),
        linedTP("cyan_lined9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PURPLE_LINED9_TP = registerBlock(
        commitDouble("purple_lined9_tp"),
        linedTP("purple_lined9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLUE_LINED9_TP = registerBlock(
        commitDouble("blue_lined9_tp"),
        linedTP("blue_lined9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BROWN_LINED9_TP = registerBlock(
        commitDouble("brown_lined9_tp"),
        linedTP("brown_lined9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GREEN_LINED9_TP = registerBlock(
        commitDouble("green_lined9_tp"),
        linedTP("green_lined9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block RED_LINED9_TP = registerBlock(
        commitDouble("red_lined9_tp"),
        linedTP("red_lined9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLACK_LINED9_TP = registerBlock(
        commitDouble("black_lined9_tp"),
        linedTP("black_lined9_tp", (byte)9),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block WHITE_LINED10_TP = registerBlock(
        commitDouble("white_lined10_tp"),
        linedTP("white_lined10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block ORANGE_LINED10_TP = registerBlock(
        commitDouble("orange_lined10_tp"),
        linedTP("orange_lined10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block MAGENTA_LINED10_TP = registerBlock(
        commitDouble("magenta_lined10_tp"),
        linedTP("magenta_lined10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_BLUE_LINED10_TP = registerBlock(
        commitDouble("light_blue_lined10_tp"),
        linedTP("light_blue_lined10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block YELLOW_LINED10_TP = registerBlock(
        commitDouble("yellow_lined10_tp"),
        linedTP("yellow_lined10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIME_LINED10_TP = registerBlock(
        commitDouble("lime_lined10_tp"),
        linedTP("lime_lined10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PINK_LINED10_TP = registerBlock(
        commitDouble("pink_lined10_tp"),
        linedTP("pink_lined10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GRAY_LINED10_TP = registerBlock(
        commitDouble("gray_lined10_tp"),
        linedTP("gray_lined10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block LIGHT_GRAY_LINED10_TP = registerBlock(
        commitDouble("light_gray_lined10_tp"),
        linedTP("light_gray_lined10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block CYAN_LINED10_TP = registerBlock(
        commitDouble("cyan_lined10_tp"),
        linedTP("cyan_lined10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block PURPLE_LINED10_TP = registerBlock(
        commitDouble("purple_lined10_tp"),
        linedTP("purple_lined10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLUE_LINED10_TP = registerBlock(
        commitDouble("blue_lined10_tp"),
        linedTP("blue_lined10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BROWN_LINED10_TP = registerBlock(
        commitDouble("brown_lined10_tp"),
        linedTP("brown_lined10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block GREEN_LINED10_TP = registerBlock(
        commitDouble("green_lined10_tp"),
        linedTP("green_lined10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block RED_LINED10_TP = registerBlock(
        commitDouble("red_lined10_tp"),
        linedTP("red_lined10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );
    public static final Block BLACK_LINED10_TP = registerBlock(
        commitDouble("black_lined10_tp"),
        linedTP("black_lined10_tp", (byte)10),
        Block.Settings.create().strength(.9f).requiresTool()
    );

    @Deprecated(since = "0.0.3-a1", forRemoval = true)
    @Contract("_ -> new")
    public static CircleStandingSymbolBlock
    newCircleStandingSymbolBlock(Block.Settings settings) {
        return new CircleStandingSymbolBlock(settings);
    }

    @Deprecated(since = "0.0.3-a1", forRemoval = true)
    @Contract("_ -> new")
    public static WideBoardBlock
    newWideBoardBlock(Block.Settings settings) {
        return new WideBoardBlock(settings);
    }

    @Deprecated(since = "0.0.3-a1", forRemoval = true)
    @Contract("_, _ -> new")
    public static WideBoardBlock
    newWideBoardBlockBunched(WideBoardBlock cb, Block.Settings settings) {
        return new WideBoardBlock(cb, settings);
    }

    public static void init() {}

    static {
        FLOOR_LINE_EIGHTHS.setItm1(AllBlockItems.WHITE_FLOOR_LINE_EIGHTH);
        FLOOR_LINE_EIGHTHS.setItm2(AllBlockItems.YELLOW_FLOOR_LINE_EIGHTH);
        BARRICADES_1.setItm0(AllBlockItems.BARRICADE_1M_EDGE_1M_HEIGHT);
        BARRICADES_1.setItm1(AllBlockItems.BARRICADE_50CM_EDGE_75CM_HEIGHT);
        BARRICADES_1.setItm2(AllBlockItems.BARRICADE_50CM_EDGE_1M_HEIGHT);
        DISTANCE_DETECTION_0M_LEFT.addToArr(DISTANCE_DETECTION_0M_LEFT);
        DISTANCE_DETECTION_0M_LEFT.addToArr(DISTANCE_DETECTION_0M_RIGHT);
        DISTANCE_DETECTION_0M_LEFT.freezeArr();
        DISTANCE_DETECTION_0M_RIGHT.freezeArr();
        DISTANCE_DETECTION_50M_LEFT.addToArr(DISTANCE_DETECTION_50M_LEFT);
        DISTANCE_DETECTION_50M_LEFT.addToArr(DISTANCE_DETECTION_50M_RIGHT);
        DISTANCE_DETECTION_50M_LEFT.freezeArr();
        DISTANCE_DETECTION_50M_RIGHT.freezeArr();
        DISTANCE_DETECTION_100M_LEFT.addToArr(DISTANCE_DETECTION_100M_LEFT);
        DISTANCE_DETECTION_100M_LEFT.addToArr(DISTANCE_DETECTION_100M_RIGHT);
        DISTANCE_DETECTION_100M_LEFT.freezeArr();
        DISTANCE_DETECTION_100M_RIGHT.freezeArr();
        DISTANCE_DETECTION_200M_LEFT.addToArr(DISTANCE_DETECTION_200M_LEFT);
        DISTANCE_DETECTION_200M_LEFT.addToArr(DISTANCE_DETECTION_200M_RIGHT);
        DISTANCE_DETECTION_200M_LEFT.freezeArr();
        DISTANCE_DETECTION_200M_RIGHT.freezeArr();
        HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE
        .addToArr(HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE);
        HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE
        .addToArr(HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE);
        HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE
        .addToArr(HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE);
        HIGHWAY_EXIT_DISTANCE_INFO_LEFT_SINGLE.freezeArr();
        HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_SINGLE.freezeArr();
        HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_SINGLE.freezeArr();
        HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP
        .addToArr(HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP);
        HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP
        .addToArr(HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP);
        HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP
        .addToArr(HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP);
        HIGHWAY_EXIT_DISTANCE_INFO_LEFT_TOP.freezeArr();
        HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_TOP.freezeArr();
        HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_TOP.freezeArr();
        HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE
        .addToArr(HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE);
        HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE
        .addToArr(HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE);
        HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE
        .addToArr(HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE);
        HIGHWAY_EXIT_DISTANCE_INFO_LEFT_MIDDLE.freezeArr();
        HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_MIDDLE.freezeArr();
        HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_MIDDLE.freezeArr();
        HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM
        .addToArr(HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM);
        HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM
        .addToArr(HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM);
        HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM
        .addToArr(HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM);
        HIGHWAY_EXIT_DISTANCE_INFO_LEFT_BOTTOM.freezeArr();
        HIGHWAY_EXIT_DISTANCE_INFO_MIDDLE_BOTTOM.freezeArr();
        HIGHWAY_EXIT_DISTANCE_INFO_RIGHT_BOTTOM.freezeArr();
        KEEP_SPACE_VARIANT1_UPPERLEFT.addToArr(KEEP_SPACE_VARIANT1_UPPERLEFT);
        KEEP_SPACE_VARIANT1_UPPERLEFT.addToArr(KEEP_SPACE_VARIANT1_UPPER);
        KEEP_SPACE_VARIANT1_UPPERLEFT.addToArr(KEEP_SPACE_VARIANT1_UPPERRIGHT);
        KEEP_SPACE_VARIANT1_UPPERLEFT.freezeArr();
        KEEP_SPACE_VARIANT1_UPPER.freezeArr();
        KEEP_SPACE_VARIANT1_UPPERRIGHT.freezeArr();
        KEEP_SPACE_VARIANT1_LEFT.addToArr(KEEP_SPACE_VARIANT1_LEFT);
        KEEP_SPACE_VARIANT1_LEFT.addToArr(KEEP_SPACE_VARIANT1_CENTER);
        KEEP_SPACE_VARIANT1_LEFT.addToArr(KEEP_SPACE_VARIANT1_RIGHT);
        KEEP_SPACE_VARIANT1_LEFT.freezeArr();
        KEEP_SPACE_VARIANT1_CENTER.freezeArr();
        KEEP_SPACE_VARIANT1_RIGHT.freezeArr();
        KEEP_SPACE_VARIANT1_LOWERLEFT.addToArr(KEEP_SPACE_VARIANT1_LOWERLEFT);
        KEEP_SPACE_VARIANT1_LOWERLEFT.addToArr(KEEP_SPACE_VARIANT1_LOWER);
        KEEP_SPACE_VARIANT1_LOWERLEFT.addToArr(KEEP_SPACE_VARIANT1_LOWERRIGHT);
        KEEP_SPACE_VARIANT1_LOWERLEFT.freezeArr();
        KEEP_SPACE_VARIANT1_LOWER.freezeArr();
        KEEP_SPACE_VARIANT1_LOWERRIGHT.freezeArr();
        KEEP_SPACE_VARIANT2_UPPERLEFT.addToArr(KEEP_SPACE_VARIANT2_UPPERLEFT);
        KEEP_SPACE_VARIANT2_UPPERLEFT.addToArr(KEEP_SPACE_VARIANT2_UPPER);
        KEEP_SPACE_VARIANT2_UPPERLEFT.addToArr(KEEP_SPACE_VARIANT2_UPPERRIGHT);
        KEEP_SPACE_VARIANT2_UPPERLEFT.freezeArr();
        KEEP_SPACE_VARIANT2_UPPER.freezeArr();
        KEEP_SPACE_VARIANT2_UPPERRIGHT.freezeArr();
        KEEP_SPACE_VARIANT2_LEFT.addToArr(KEEP_SPACE_VARIANT2_LEFT);
        KEEP_SPACE_VARIANT2_LEFT.addToArr(KEEP_SPACE_VARIANT2_CENTER);
        KEEP_SPACE_VARIANT2_LEFT.addToArr(KEEP_SPACE_VARIANT2_RIGHT);
        KEEP_SPACE_VARIANT2_LEFT.freezeArr();
        KEEP_SPACE_VARIANT2_CENTER.freezeArr();
        KEEP_SPACE_VARIANT2_RIGHT.freezeArr();
        KEEP_SPACE_VARIANT2_LOWERLEFT.addToArr(KEEP_SPACE_VARIANT2_LOWERLEFT);
        KEEP_SPACE_VARIANT2_LOWERLEFT.addToArr(KEEP_SPACE_VARIANT2_LOWER);
        KEEP_SPACE_VARIANT2_LOWERLEFT.addToArr(KEEP_SPACE_VARIANT2_LOWERRIGHT);
        KEEP_SPACE_VARIANT2_LOWERLEFT.freezeArr();
        KEEP_SPACE_VARIANT2_LOWER.freezeArr();
        KEEP_SPACE_VARIANT2_LOWERRIGHT.freezeArr();
    }
}
