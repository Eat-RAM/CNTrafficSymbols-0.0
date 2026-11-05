package io.github.eat_ram.cntrafficsymbols.v0d0.network;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public record OpenEditTrafficSignPayload(
    @NotNull BlockPos pos, byte type, @NotNull Direction hitSide
) {
    public static final byte TYPE_HIGHWAY_KM = 0;
    public static final byte TYPE_HIGHWAY_HM = 1;
    public static final byte TYPE_HIGHWAY_EXIT_INFO = 2;
    public static final byte TYPE_ROD_WITH_LAMP = 3;

    @Contract(pure = true)
    public OpenEditTrafficSignPayload(BlockPos pos, byte type) {
        this(pos, type, Direction.NORTH);
    }

    public OpenEditTrafficSignPayload(@NotNull PacketByteBuf buf) {
        this(
            buf.readBlockPos(), buf.readByte(),
            buf.readEnumConstant(Direction.class)
        );
    }

    public void write(@NotNull PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);
        buf.writeByte(this.type);
        buf.writeEnumConstant(this.hitSide);
    }

    public @NotNull PacketByteBuf toBuffer() {
        PacketByteBuf buf = PacketByteBufs.create();
        this.write(buf);
        return buf;
    }
}
