package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing90;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayExitDistanceInfoKmBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayExitDistanceInfoNameBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

public class HighwayExitDistanceInfoParts {
    @Contract(pure = true)
    public static @NotNull Direction getCanonicalStep(int facingId) {
        switch (facingId) {
            case 0: case 4: case 8: return Direction.EAST;
            case 1: case 5: case 9: return Direction.SOUTH;
            case 2: case 6: return Direction.WEST;
            case 3: case 7: return Direction.NORTH;
            default: return Direction.EAST;
        }
    }

    @Contract(pure = true)
    public static boolean isStepCompatible(
        int sourceFacingId, int targetFacingId, @Nullable Direction step
    ) {
        if (sourceFacingId > 5) {
            return sourceFacingId == targetFacingId;
        }
        if (targetFacingId > 5 || step == null) {
            return false;
        }
        switch (step) {
            case EAST: return (targetFacingId == 0 || targetFacingId == 4) &&
                              (sourceFacingId == 0 || sourceFacingId == 4);
            case WEST: return (targetFacingId == 2 || targetFacingId == 4) &&
                              (sourceFacingId == 2 || sourceFacingId == 4);
            case SOUTH: return (targetFacingId == 1 || targetFacingId == 5) &&
                               (sourceFacingId == 1 || sourceFacingId == 5);
            case NORTH: return (targetFacingId == 3 || targetFacingId == 5) &&
                               (sourceFacingId == 3 || sourceFacingId == 5);
            default: return false;
        }
    }

    public static @NotNull Direction getStepFromLeft(
        @NotNull World world, @NotNull BlockPos pos, int facingId,
        Direction hitSide
    ) {
        if (facingId == 4) {
            if (hitSide == Direction.NORTH) {
                return Direction.WEST;
            }
            if (hitSide == Direction.SOUTH) {
                return Direction.EAST;
            }
            BlockState east = world.getBlockState(pos.east());
            if (east.getBlock() instanceof
                HighwayExitDistanceInfoMiddleBlock) {
                int fid = east.get(DoubleFaceFacing90.FACING).id;
                if (fid == 0 || fid == 4) {
                    return Direction.EAST;
                }
            }
            BlockState west = world.getBlockState(pos.west());
            if (west.getBlock() instanceof
                HighwayExitDistanceInfoMiddleBlock) {
                int fid = west.get(DoubleFaceFacing90.FACING).id;
                if (fid == 2 || fid == 4) {
                    return Direction.WEST;
                }
            }
            return Direction.EAST;
        }
        if (facingId == 5) {
            if (hitSide == Direction.EAST) {
                return Direction.NORTH;
            }
            if (hitSide == Direction.WEST) {
                return Direction.SOUTH;
            }
            BlockState south = world.getBlockState(pos.south());
            if (south.getBlock() instanceof
                HighwayExitDistanceInfoMiddleBlock) {
                int fid = south.get(DoubleFaceFacing90.FACING).id;
                if (fid == 1 || fid == 5) {
                    return Direction.SOUTH;
                }
            }
            BlockState north = world.getBlockState(pos.north());
            if (north.getBlock() instanceof
                HighwayExitDistanceInfoMiddleBlock) {
                int fid = north.get(DoubleFaceFacing90.FACING).id;
                if (fid == 3 || fid == 5) {
                    return Direction.NORTH;
                }
            }
            return Direction.SOUTH;
        }
        return getCanonicalStep(facingId);
    }

    public static @NotNull Direction getStepFromMiddle(
        @NotNull World world, @NotNull BlockPos pos, int facingId,
        Direction hitSide
    ) {
        if (facingId == 4) {
            if (hitSide == Direction.NORTH) {
                return Direction.WEST;
            }
            if (hitSide == Direction.SOUTH) {
                return Direction.EAST;
            }
            BlockState west = world.getBlockState(pos.west());
            if (west.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) {
                int fid = west.get(DoubleFaceFacing90.FACING).id;
                if (fid == 0 || fid == 4) {
                    return Direction.EAST;
                }
            }
            BlockState east = world.getBlockState(pos.east());
            if (east.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) {
                int fid = east.get(DoubleFaceFacing90.FACING).id;
                if (fid == 2 || fid == 4) {
                    return Direction.WEST;
                }
            }
            return Direction.EAST;
        }
        if (facingId == 5) {
            if (hitSide == Direction.EAST) {
                return Direction.NORTH;
            }
            if (hitSide == Direction.WEST) {
                return Direction.SOUTH;
            }
            BlockState north = world.getBlockState(pos.north());
            if (north.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) {
                int fid = north.get(DoubleFaceFacing90.FACING).id;
                if (fid == 1 || fid == 5) {
                    return Direction.SOUTH;
                }
            }
            BlockState south = world.getBlockState(pos.south());
            if (south.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) {
                int fid = south.get(DoubleFaceFacing90.FACING).id;
                if (fid == 3 || fid == 5) {
                    return Direction.NORTH;
                }
            }
            return Direction.SOUTH;
        }
        return getCanonicalStep(facingId);
    }

    public static @NotNull Direction getStepFromRight(
        @NotNull World world, @NotNull BlockPos pos, int facingId,
        Direction hitSide
    ) {
        if (facingId == 4) {
            if (hitSide == Direction.NORTH) {
                return Direction.WEST;
            }
            if (hitSide == Direction.SOUTH) {
                return Direction.EAST;
            }
            BlockState west = world.getBlockState(pos.west());
            if (west.getBlock() instanceof
                HighwayExitDistanceInfoMiddleBlock) {
                int fid = west.get(DoubleFaceFacing90.FACING).id;
                if (fid == 0 || fid == 4) {
                    return Direction.EAST;
                }
            }
            BlockState east = world.getBlockState(pos.east());
            if (east.getBlock() instanceof
                HighwayExitDistanceInfoMiddleBlock) {
                int fid = east.get(DoubleFaceFacing90.FACING).id;
                if (fid == 2 || fid == 4) {
                    return Direction.WEST;
                }
            }
            return Direction.EAST;
        }
        if (facingId == 5) {
            if (hitSide == Direction.EAST) {
                return Direction.NORTH;
            }
            if (hitSide == Direction.WEST) {
                return Direction.SOUTH;
            }
            BlockState north = world.getBlockState(pos.north());
            if (north.getBlock() instanceof
                HighwayExitDistanceInfoMiddleBlock) {
                int fid = north.get(DoubleFaceFacing90.FACING).id;
                if (fid == 1 || fid == 5) {
                    return Direction.SOUTH;
                }
            }
            BlockState south = world.getBlockState(pos.south());
            if (south.getBlock() instanceof
                HighwayExitDistanceInfoMiddleBlock) {
                int fid = south.get(DoubleFaceFacing90.FACING).id;
                if (fid == 3 || fid == 5) {
                    return Direction.NORTH;
                }
            }
            return Direction.SOUTH;
        }
        return getCanonicalStep(facingId);
    }

    public final @Nullable BlockPos leftPos;
    public final @Nullable HighwayExitDistanceInfoNameBlockEntity leftBe;
    public final @Nullable BlockPos middlePos;
    public final @Nullable HighwayExitDistanceInfoNameBlockEntity middleBe;
    public final @Nullable BlockPos kmPos;
    public final @Nullable HighwayExitDistanceInfoKmBlockEntity kmBe;
    public final @Nullable Direction hitSide;
    public final @Range(from = -1, to = 9) int facingId;

    public HighwayExitDistanceInfoParts(
        @NotNull World world, @NotNull BlockPos pos, @NotNull BlockState state
    ) {
        this(world, pos, state, Direction.NORTH);
    }

    public HighwayExitDistanceInfoParts(
        @NotNull World world, @NotNull BlockPos pos, @NotNull BlockState state,
        Direction hitSide
    ) {
        if (!state.contains(DoubleFaceFacing90.FACING)) {
            this.leftPos = null;
            this.leftBe = null;
            this.middlePos = null;
            this.middleBe = null;
            this.kmPos = null;
            this.kmBe = null;
            this.hitSide = null;
            this.facingId = -1;
            return;
        }
        Block block = state.getBlock();
        BlockEntity be = world.getBlockEntity(pos);
        int facingId = state.get(DoubleFaceFacing90.FACING).id;
        this.facingId = facingId;
        this.hitSide = hitSide;
        BlockPos leftPos = null;
        HighwayExitDistanceInfoNameBlockEntity leftBe = null;
        BlockPos middlePos = null;
        HighwayExitDistanceInfoNameBlockEntity middleBe = null;
        BlockPos kmPos = null;
        HighwayExitDistanceInfoKmBlockEntity kmBe = null;
        if (block instanceof HighwayExitDistanceInfoLeftBlock &&
            be instanceof HighwayExitDistanceInfoNameBlockEntity) {
            leftPos = pos;
            leftBe = (HighwayExitDistanceInfoNameBlockEntity)be;
            Direction step = getStepFromLeft(world, pos, facingId, hitSide);
            BlockPos mPos = pos.offset(step);
            BlockState mState = world.getBlockState(mPos);
            if (mState.getBlock() instanceof
                HighwayExitDistanceInfoMiddleBlock &&
                mState.contains(DoubleFaceFacing90.FACING)) {
                int mFacing = mState.get(DoubleFaceFacing90.FACING).id;
                if (isStepCompatible(facingId, mFacing, step) &&
                    world.getBlockEntity(mPos) instanceof
                    HighwayExitDistanceInfoNameBlockEntity mBe) {
                    middlePos = mPos;
                    middleBe = mBe;
                    BlockPos rPos = mPos.offset(step);
                    BlockState rState = world.getBlockState(rPos);
                    if (rState.getBlock() instanceof
                        HighwayExitDistanceInfoRightBlock &&
                        rState.contains(DoubleFaceFacing90.FACING)) {
                        int rFacing = rState.get(DoubleFaceFacing90.FACING).id;
                        if (isStepCompatible(mFacing, rFacing, step) &&
                            world.getBlockEntity(rPos) instanceof
                            HighwayExitDistanceInfoKmBlockEntity rBe) {
                            kmPos = rPos;
                            kmBe = rBe;
                        }
                    }
                }
            }
        } else if (block instanceof HighwayExitDistanceInfoMiddleBlock &&
                   be instanceof HighwayExitDistanceInfoNameBlockEntity) {
            middlePos = pos;
            middleBe = (HighwayExitDistanceInfoNameBlockEntity)be;
            Direction step = getStepFromMiddle(world, pos, facingId, hitSide);
            BlockPos lPos = pos.offset(step.getOpposite());
            BlockState lState = world.getBlockState(lPos);
            if (lState.getBlock() instanceof HighwayExitDistanceInfoLeftBlock
                && lState.contains(DoubleFaceFacing90.FACING)) {
                int lFacing = lState.get(DoubleFaceFacing90.FACING).id;
                if (isStepCompatible(lFacing, facingId, step) &&
                    world.getBlockEntity(lPos) instanceof
                    HighwayExitDistanceInfoNameBlockEntity lBe) {
                    leftPos = lPos;
                    leftBe = lBe;
                }
            }
            BlockPos rPos = pos.offset(step);
            BlockState rState = world.getBlockState(rPos);
            if (rState.getBlock() instanceof HighwayExitDistanceInfoRightBlock
                && rState.contains(DoubleFaceFacing90.FACING)) {
                int rFacing = rState.get(DoubleFaceFacing90.FACING).id;
                if (isStepCompatible(facingId, rFacing, step) &&
                    world.getBlockEntity(rPos) instanceof
                    HighwayExitDistanceInfoKmBlockEntity rBe) {
                    kmPos = rPos;
                    kmBe = rBe;
                }
            }
        } else if (block instanceof HighwayExitDistanceInfoRightBlock &&
                   be instanceof HighwayExitDistanceInfoKmBlockEntity) {
            kmPos = pos;
            kmBe = (HighwayExitDistanceInfoKmBlockEntity)be;
            Direction step = getStepFromRight(world, pos, facingId, hitSide);
            BlockPos mPos = pos.offset(step.getOpposite());
            BlockState mState = world.getBlockState(mPos);
            if (mState.getBlock() instanceof HighwayExitDistanceInfoMiddleBlock
                && mState.contains(DoubleFaceFacing90.FACING)) {
                int mFacing = mState.get(DoubleFaceFacing90.FACING).id;
                if (isStepCompatible(mFacing, facingId, step) &&
                    world.getBlockEntity(mPos) instanceof
                    HighwayExitDistanceInfoNameBlockEntity mBe) {
                    middlePos = mPos;
                    middleBe = mBe;
                    BlockPos lPos = mPos.offset(step.getOpposite());
                    BlockState lState = world.getBlockState(lPos);
                    if (lState.getBlock() instanceof
                        HighwayExitDistanceInfoLeftBlock &&
                        lState.contains(DoubleFaceFacing90.FACING)) {
                        int lFacing = lState.get(DoubleFaceFacing90.FACING).id;
                        if (isStepCompatible(lFacing, mFacing, step) &&
                            world.getBlockEntity(lPos) instanceof
                            HighwayExitDistanceInfoNameBlockEntity lBe) {
                            leftPos = lPos;
                            leftBe = lBe;
                        }
                    }
                }
            }
        }
        this.leftPos = leftPos;
        this.leftBe = leftBe;
        this.middlePos = middlePos;
        this.middleBe = middleBe;
        this.kmPos = kmPos;
        this.kmBe = kmBe;
    }
}
