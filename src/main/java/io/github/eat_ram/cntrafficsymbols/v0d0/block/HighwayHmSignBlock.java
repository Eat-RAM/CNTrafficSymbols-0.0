package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import io.github.eat_ram.cntrafficsymbols.core.block
       .Attachment3DoubleFaceFacingBlock;
import io.github.eat_ram.cntrafficsymbols.core.struct.Attachment3;
import io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayHmSignBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.network
       .OpenEditTrafficSignPayload;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static net.minecraft.util.shape.VoxelShapes.empty;

public class HighwayHmSignBlock extends Attachment3DoubleFaceFacingBlock
implements net.minecraft.block.BlockEntityProvider {
    public static final VoxelShape SHAPE0 =
    cuboid(0.4375, 0.4375, 0.4375, 0.5625, 0.5625, 0.5625);
    public static final VoxelShape SHAPE0N =
    cuboid(0.4375, 0.4375, 0.984375, 0.5625, 0.5625, 1);
    public static final VoxelShape SHAPE0E =
    cuboid(0, 0.4375, 0.4375, 0.015625, 0.5625, 0.5625);
    public static final VoxelShape SHAPE0S =
    cuboid(0.4375, 0.4375, 0, 0.5625, 0.5625, 0.015625);
    public static final VoxelShape SHAPE0W =
    cuboid(0.984375, 0.4375, 0.4375, 1, 0.5625, 0.5625);
    public static final VoxelShape SHAPE1 =
    cuboid(0.4375, 0, 0.4375, 0.5625, 0.125, 0.5625);
    public static final VoxelShape SHAPE1N =
    cuboid(0.4375, 0, 0.984375, 0.5625, 0.125, 1);
    public static final VoxelShape SHAPE1E =
    cuboid(0, 0, 0.4375, 0.015625, 0.125, 0.5625);
    public static final VoxelShape SHAPE1S =
    cuboid(0.4375, 0, 0, 0.5625, 0.125, 0.015625);
    public static final VoxelShape SHAPE1W =
    cuboid(0.984375, 0, 0.4375, 1, 0.125, 0.5625);
    public static final VoxelShape SHAPE2 =
    cuboid(0.4375, 0.875, 0.4375, 0.5625, 1, 0.5625);
    public static final VoxelShape SHAPE2N =
    cuboid(0.4375, 0.875, 0.984375, 0.5625, 1, 1);
    public static final VoxelShape SHAPE2E =
    cuboid(0, 0.875, 0.4375, 0.015625, 1, 0.5625);
    public static final VoxelShape SHAPE2S =
    cuboid(0.4375, 0.875, 0, 0.5625, 1, 0.015625);
    public static final VoxelShape SHAPE2W =
    cuboid(0.984375, 0.875, 0.4375, 1, 1, 0.5625);

    public HighwayHmSignBlock(Settings settings) {
        super(settings);
    }

    @Override
    @Contract("_, _ -> new")
    public BlockEntity createBlockEntity(BlockPos p, BlockState st) {
        return new HighwayHmSignBlockEntity(p, st);
    }

    @Override
    public VoxelShape
    getOutlineShape(BlockState st, BlockView v, BlockPos p, ShapeContext c) {
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
    public VoxelShape getCollisionShape(
        BlockState state, BlockView world, BlockPos pos, ShapeContext context
    ) {
        return empty();
    }

    @Override
    public void onPlaced(
        World world, BlockPos pos, BlockState state,
        @Nullable LivingEntity placer, ItemStack itemStack
    ) {
        if (world.isClient()) {
            world.getBlockEntity(
                pos, HighwayHmSignBlockEntity.TYPE
            ).ifPresent(be -> be.setCustomName(itemStack.getCustomName()));
        } else if (itemStack.getCustomName() != null) {
            world.getBlockEntity(
                pos, HighwayHmSignBlockEntity.TYPE
            ).ifPresent(be -> be.setCustomName(itemStack.getName()));
        }
    }

    @Override
    public ItemStack getPickStack(
        WorldView world, BlockPos pos, BlockState state, boolean includeData
    ) {
        BlockEntity be = world.getBlockEntity(pos);
        if (!(be instanceof HighwayHmSignBlockEntity)) {
            return super.getPickStack(world, pos, state, includeData);
        }
        ItemStack stack = new ItemStack(this.asItem(), state.get(
            DoubleFaceFacing.FACING
        ).isSingle() ? 1 : 2);
        if (includeData) {
            stack.set(DataComponentTypes.CUSTOM_NAME, (
                (HighwayHmSignBlockEntity)be
            ).getCustomName());
        }
        return stack;
    }

    @Override
    public ActionResult onUse(
        BlockState state, World world, BlockPos pos, PlayerEntity player,
        BlockHitResult hit
    ) {
        if (!world.isClient() && player instanceof
            net.minecraft.server.network.ServerPlayerEntity spe) {
            ServerPlayNetworking.send(spe, new OpenEditTrafficSignPayload(
                pos, OpenEditTrafficSignPayload.TYPE_HIGHWAY_HM, hit.getSide()
            ));
        }
        return ActionResult.SUCCESS_SERVER;
    }

    @Override
    protected boolean canBucketPlace(BlockState state, Fluid fluid) {
        return false;
    }

    public static int getHmDigit(net.minecraft.block.Block block) {
        if (block == AllBlocks.HIGHWAY_2HM) return 2;
        if (block == AllBlocks.HIGHWAY_3HM) return 3;
        if (block == AllBlocks.HIGHWAY_4HM) return 4;
        if (block == AllBlocks.HIGHWAY_5HM) return 5;
        if (block == AllBlocks.HIGHWAY_6HM) return 6;
        if (block == AllBlocks.HIGHWAY_7HM) return 7;
        if (block == AllBlocks.HIGHWAY_8HM) return 8;
        if (block == AllBlocks.HIGHWAY_9HM) return 9;
        return 1;
    }
}
