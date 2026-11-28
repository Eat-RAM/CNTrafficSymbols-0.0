package io.github.eat_ram.cntrafficsymbols.v0d0.block.be;

import java.util.UUID;

import io.github.eat_ram.cntrafficsymbols.v0d0.block.AllBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class CountdownTimerBlockEntity extends BlockEntity {
    public static final BlockEntityType<CountdownTimerBlockEntity> TYPE =
    BlockEntityType.Builder.create(
        CountdownTimerBlockEntity::new,
        AllBlocks.COUNTDOWN_TIMER
    ).build();

    private @Nullable UUID groupId;
    private @Nullable BlockPos boundLightPos;

    public CountdownTimerBlockEntity(BlockPos pos, BlockState state) {
        super(TYPE, pos, state);
    }

    public @Nullable UUID getGroupId() {
        return this.groupId;
    }

    public void setGroupId(@Nullable UUID id) {
        this.groupId = id;
    }

    public @Nullable BlockPos getBoundLightPos() {
        return this.boundLightPos;
    }

    public void setBoundLightPos(@Nullable BlockPos pos) {
        this.boundLightPos = pos;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        if (this.groupId != null) {
            nbt.putUuid("GroupId", this.groupId);
        }
        if (this.boundLightPos != null) {
            nbt.put(
                "BoundLightPos", NbtHelper.fromBlockPos(this.boundLightPos)
            );
        }
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        this.groupId = nbt.containsUuid("GroupId") ?
                       nbt.getUuid("GroupId") : null;
        this.boundLightPos = nbt.contains(
            "BoundLightPos", NbtElement.COMPOUND_TYPE
        ) ? NbtHelper.toBlockPos(nbt.getCompound("BoundLightPos")) : null;
    }

    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return this.createNbt();
    }
}