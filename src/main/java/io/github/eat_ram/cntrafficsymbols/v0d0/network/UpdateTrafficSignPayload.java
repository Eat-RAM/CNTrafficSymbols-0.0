package io.github.eat_ram.cntrafficsymbols.v0d0.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public record UpdateTrafficSignPayload(BlockPos pos, NbtCompound data)
implements CustomPayload {
    public static final CustomPayload.Id<UpdateTrafficSignPayload> ID =
    new CustomPayload.Id<>(
        Identifier.of("cntrafficsymbols_0d0", "update_traffic_sign")
    );

    public static final PacketCodec<ByteBuf, UpdateTrafficSignPayload> CODEC =
    PacketCodec.tuple(
        BlockPos.PACKET_CODEC, UpdateTrafficSignPayload::pos,
        PacketCodecs.NBT_COMPOUND, UpdateTrafficSignPayload::data,
        UpdateTrafficSignPayload::new
    );

    @Override
    @Contract(pure = true)
    public @NotNull Id<? extends CustomPayload> getId() {
        return ID;
    }
}
