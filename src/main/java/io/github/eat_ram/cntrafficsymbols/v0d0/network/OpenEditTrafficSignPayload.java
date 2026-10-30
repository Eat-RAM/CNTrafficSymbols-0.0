package io.github.eat_ram.cntrafficsymbols.v0d0.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public record OpenEditTrafficSignPayload(
    BlockPos pos, byte type, Direction hitSide
) implements CustomPayload {
    public static final byte TYPE_HIGHWAY_KM = 0;
    public static final byte TYPE_HIGHWAY_HM = 1;
    public static final byte TYPE_HIGHWAY_EXIT_INFO = 2;
    public static final byte TYPE_ROD_WITH_LAMP = 3;

    @Contract(pure = true)
    public OpenEditTrafficSignPayload(BlockPos pos, byte type) {
        this(pos, type, Direction.NORTH);
    }

    public static final CustomPayload.Id<OpenEditTrafficSignPayload> ID =
    new CustomPayload.Id<>(
        Identifier.of("cntrafficsymbols_0d0", "open_edit_traffic_sign")
    );

    public static final PacketCodec<ByteBuf, OpenEditTrafficSignPayload>
    CODEC = PacketCodec.tuple(
        BlockPos.PACKET_CODEC, OpenEditTrafficSignPayload::pos,
        PacketCodecs.BYTE, OpenEditTrafficSignPayload::type,
        Direction.PACKET_CODEC, OpenEditTrafficSignPayload::hitSide,
        OpenEditTrafficSignPayload::new
    );

    @Override
    @Contract(pure = true)
    public @NotNull Id<? extends CustomPayload> getId() {
        return ID;
    }
}
