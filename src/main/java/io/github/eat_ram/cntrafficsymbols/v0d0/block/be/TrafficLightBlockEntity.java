package io.github.eat_ram.cntrafficsymbols.v0d0.block.be;

import java.util.UUID;

import io.github.eat_ram.cntrafficsymbols.v0d0.block.AllBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class TrafficLightBlockEntity extends BlockEntity {
    public static final BlockEntityType<TrafficLightBlockEntity> TYPE =
    BlockEntityType.Builder.create(
        TrafficLightBlockEntity::new,
        AllBlocks.HORIZONTAL2_TRAFFIC_LIGHT,
        AllBlocks.HORIZONTAL3_TRAFFIC_LIGHT,
        AllBlocks.HORIZONTAL3_SQMID_TRAFFIC_LIGHT,
        AllBlocks.VERTICAL2_TRAFFIC_LIGHT,
        AllBlocks.VERTICAL3_TRAFFIC_LIGHT,
        AllBlocks.VERTICAL3_SQMID_TRAFFIC_LIGHT
    ).build();

    private @Nullable UUID groupId;

    public TrafficLightBlockEntity(BlockPos pos, BlockState state) {
        super(TYPE, pos, state);
    }

    public @Nullable UUID getGroupId() {
        return this.groupId;
    }

    public void setGroupId(@Nullable UUID id) {
        this.groupId = id;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        if (this.groupId != null) {
            nbt.putUuid("GroupId", this.groupId);
        }
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        this.groupId = nbt.containsUuid("GroupId") ?
                       nbt.getUuid("GroupId") : null;
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