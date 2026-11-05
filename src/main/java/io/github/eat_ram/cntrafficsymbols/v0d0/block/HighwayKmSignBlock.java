package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import io.github.eat_ram.cntrafficsymbols.core.block
       .Attachment3DoubleFaceFacingBlock;
import io.github.eat_ram.cntrafficsymbols.core.struct.Attachment3;
import io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayKmSignBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.network
       .OpenEditTrafficSignPayload;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static net.minecraft.util.shape.VoxelShapes.empty;
import static net.minecraft.util.shape.VoxelShapes.union;

public class HighwayKmSignBlock extends Attachment3DoubleFaceFacingBlock
implements net.minecraft.block.BlockEntityProvider {
    public static final VoxelShape SHAPE0 =
    cuboid(0.375, 0.259375, 0.375, 0.625, 0.740625, 0.625);
    public static final VoxelShape SHAPE1 =
    cuboid(0.375, 0, 0.375, 0.625, 0.48125, 0.625);
    public static final VoxelShape SHAPE2 =
    cuboid(0.375, 0.51875, 0.375, 0.625, 1, 0.625);
    private static final double @NotNull[]@NotNull[] BOXES = {
        {0.15, 0.4125, 0.85, 0.71875},
        {0.171875, 0.390625, 0.828125, 0.740625},
        {0.19375, 0.36875, 0.80625, 0.390625},
        {0.215625, 0.346875, 0.784375, 0.36875},
        {0.2375, 0.325, 0.7625, 0.346875},
        {0.259375, 0.303125, 0.740625, 0.325},
        {0.28125, 0.28125, 0.71875, 0.303125},
        {0.303125, 0.259375, 0.696875, 0.28125}
    };
    public static final VoxelShape SHAPE0N = createWallShape(0., 24);
    public static final VoxelShape SHAPE0E = createWallShape(0., 25);
    public static final VoxelShape SHAPE0S = createWallShape(0., 26);
    public static final VoxelShape SHAPE0W = createWallShape(0., 27);
    public static final VoxelShape SHAPE1N = createWallShape(-0.259375, 24);
    public static final VoxelShape SHAPE1E = createWallShape(-0.259375, 25);
    public static final VoxelShape SHAPE1S = createWallShape(-0.259375, 26);
    public static final VoxelShape SHAPE1W = createWallShape(-0.259375, 27);
    public static final VoxelShape SHAPE2N = createWallShape(0.259375, 24);
    public static final VoxelShape SHAPE2E = createWallShape(0.259375, 25);
    public static final VoxelShape SHAPE2S = createWallShape(0.259375, 26);
    public static final VoxelShape SHAPE2W = createWallShape(0.259375, 27);

    private static VoxelShape createWallShape(double yShift, int wallFacing) {
        VoxelShape shape = empty();
        for (double[] box : BOXES) {
            double x1 = box[0];
            double y1 = box[1] + yShift;
            double x2 = box[2];
            double y2 = box[3] + yShift;
            switch (wallFacing) {
                case 24:
                    shape = union(shape, cuboid(x1, y1, 0.975, x2, y2, 1.0));
                    break;
                case 25:
                    shape = union(shape, cuboid(0.0, y1, x1, 0.025, y2, x2));
                    break;
                case 26:
                    shape = union(shape, cuboid(x1, y1, 0.0, x2, y2, 0.025));
                    break;
                case 27:
                    shape = union(shape, cuboid(0.975, y1, x1, 1.0, y2, x2));
                    break;
            }
        }
        return shape;
    }

    @Deprecated(since = "0.0.3-a1", forRemoval = true)
    public static final TagKey<net.minecraft.item.Item> LOCKS_HIGHWAY_KM_SIGN =
    TagKey.of(RegistryKeys.ITEM, Identifier.of(
        "cntrafficsymbols_0d0", "locks_highway_km_sign"
    ));

    public HighwayKmSignBlock(Settings settings) {
        super(settings);
    }

    @Override
    @Contract("_, _ -> new")
    public BlockEntity createBlockEntity(BlockPos p, BlockState st) {
        return new HighwayKmSignBlockEntity(p, st);
    }

    @Override
    public VoxelShape getOutlineShape(
        BlockState st, BlockView v, BlockPos p,
        net.minecraft.block.ShapeContext c
    ) {
        int f = st.get(DoubleFaceFacing.FACING).id;
        int i = st.get(Attachment3.ATTACHMENT).id;
        switch (f) {
            case 24:
                switch (i) {
                    case 1: return SHAPE1N;
                    case 2: return SHAPE2N;
                    default: return SHAPE0N;
                }
            case 25:
                switch (i) {
                    case 1: return SHAPE1E;
                    case 2: return SHAPE2E;
                    default: return SHAPE0E;
                }
            case 26:
                switch (i) {
                    case 1: return SHAPE1S;
                    case 2: return SHAPE2S;
                    default: return SHAPE0S;
                }
            case 27:
                switch (i) {
                    case 1: return SHAPE1W;
                    case 2: return SHAPE2W;
                    default: return SHAPE0W;
                }
        }
        switch (i) {
            case 1: return SHAPE1;
            case 2: return SHAPE2;
            default: return SHAPE0;
        }
    }

    @Override
    public void onPlaced(
        World world, BlockPos pos, BlockState state,
        @Nullable LivingEntity placer, ItemStack itemStack
    ) {
        if (world.isClient()) {
            world.getBlockEntity(
                pos, HighwayKmSignBlockEntity.TYPE
            ).ifPresent(be -> be.setCustomName(itemStack.getCustomName()));
        } else if (itemStack.getCustomName() != null) {
            world.getBlockEntity(
                pos, HighwayKmSignBlockEntity.TYPE
            ).ifPresent(be -> be.setCustomName(itemStack.getName()));
        }
    }

    @Override
    public ItemStack getPickStack(
        WorldView world, BlockPos pos, BlockState state, boolean includeData
    ) {
        BlockEntity be = world.getBlockEntity(pos);
        if (!(be instanceof HighwayKmSignBlockEntity)) {
            return super.getPickStack(world, pos, state, includeData);
        }
        ItemStack stack = new ItemStack(this.asItem(), state.get(
            DoubleFaceFacing.FACING
        ).isSingle() ? 1 : 2);
        if (includeData) {
            stack.set(DataComponentTypes.CUSTOM_NAME, (
                (HighwayKmSignBlockEntity)be
            ).getCustomName());
        }
        return stack;
    }

    @Override
    public ActionResult onUse(
        BlockState state, World world, BlockPos pos, PlayerEntity player,
        BlockHitResult hit
    ) {
        BlockEntity ett = world.getBlockEntity(pos);
        if (!(ett instanceof HighwayKmSignBlockEntity) ||
            ((HighwayKmSignBlockEntity)ett).getKm() < 0) {
            return ActionResult.PASS;
        }
        if (!world.isClient() && player instanceof ServerPlayerEntity spe) {
            ServerPlayNetworking.send(spe, new OpenEditTrafficSignPayload(
                pos, OpenEditTrafficSignPayload.TYPE_HIGHWAY_KM, hit.getSide()
            ));
        }
        return ActionResult.SUCCESS_SERVER;
    }
}
