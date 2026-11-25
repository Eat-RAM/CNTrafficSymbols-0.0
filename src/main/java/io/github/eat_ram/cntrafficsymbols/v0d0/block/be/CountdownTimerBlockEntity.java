package io.github.eat_ram.cntrafficsymbols.v0d0.block.be;

import io.github.eat_ram.cntrafficsymbols.v0d0.block.AllBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity
       .FabricBlockEntityTypeBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryView;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.util.Uuids;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class CountdownTimerBlockEntity extends BlockEntity {
    public static final BlockEntityType<CountdownTimerBlockEntity> TYPE =
        FabricBlockEntityTypeBuilder.create(
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
    protected void writeData(WriteView view) {
        super.writeData(view);
        if (this.groupId != null) {
            view.put("GroupId", Uuids.CODEC, this.groupId);
        }
        if (this.boundLightPos != null) {
            view.put("BoundLightPos", BlockPos.CODEC, this.boundLightPos);
        }
    }

    @Override
    protected void readData(ReadView view) {
        super.readData(view);
        this.groupId = view.read("GroupId", Uuids.CODEC).orElse(null);
        this.boundLightPos =
            view.read("BoundLightPos", BlockPos.CODEC).orElse(null);
    }

    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt(
        RegistryView.WrapperLookup registries
    ) {
        return this.createNbt(registries);
    }
}
