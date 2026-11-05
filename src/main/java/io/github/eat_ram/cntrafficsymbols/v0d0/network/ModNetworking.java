package io.github.eat_ram.cntrafficsymbols.v0d0.network;

import io.github.eat_ram.cntrafficsymbols.v0d0.block.RodWithLampBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayExitDistanceInfoKmBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayExitDistanceInfoNameBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayHmSignBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayKmSignBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be.RodWithLampBlockEntity;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Contract;

public abstract class ModNetworking {
    public static final Identifier OPEN_EDIT_SCREEN_ID =
    new Identifier("cntrafficsymbols_0d0", "open_edit_traffic_sign");
    public static final Identifier UPDATE_SIGN_ID =
    new Identifier("cntrafficsymbols_0d0", "update_traffic_sign");

    public static void init() {
        ServerPlayNetworking.registerGlobalReceiver(UPDATE_SIGN_ID, (
            server, player, handler, buf, responseSender
        ) -> {  UpdateTrafficSignPayload payload =
                new UpdateTrafficSignPayload(buf); server.execute(() -> {
            BlockPos pos = payload.pos();
            if (pos.getSquaredDistanceFromCenter(
                player.getX(), player.getY(), player.getZ()
            ) > 81.) {
                return;
            }
            World world = player.getEntityWorld();
            BlockEntity be = world.getBlockEntity(pos);
            if (be == null) {
                return;
            }
            BlockState bst = world.getBlockState(pos);
            NbtCompound data = payload.data();
            if (data == null) {
                return;
            }
            if (be instanceof HighwayKmSignBlockEntity kmSign) {
                if (data.contains("km")) {
                    kmSign.setKm(data.getInt("km"));
                }
                if (data.contains("PointFive")) {
                    kmSign.setPointFive(data.getBoolean("PointFive"));
                }
                if (data.contains("CustomName")) {
                    String name = data.getString("CustomName");
                    kmSign
                    .setCustomName(name.isEmpty() ? null : Text.literal(name));
                }
                kmSign.markDirty();
                world.updateListeners(pos, bst, bst, Block.NOTIFY_ALL);
            } else if (be instanceof HighwayHmSignBlockEntity hmSign) {
                if (data.contains("CustomName")) {
                    String name = data.getString("CustomName");
                    hmSign
                    .setCustomName(name.isEmpty() ? null : Text.literal(name));
                }
                hmSign.markDirty();
                world.updateListeners(pos, bst, bst, Block.NOTIFY_ALL);
            } else if (be instanceof
                       HighwayExitDistanceInfoNameBlockEntity exitName) {
                if (data.contains("CustomName")) {
                    String name = data.getString("CustomName");
                    exitName
                    .setCustomName(name.isEmpty() ? null : Text.literal(name));
                }
                exitName.markDirty();
                world.updateListeners(pos, bst, bst, Block.NOTIFY_ALL);
            } else if (be instanceof
                       HighwayExitDistanceInfoKmBlockEntity exitKm) {
                if (data.contains("km")) {
                    exitKm.setKm(data.getFloat("km"));
                }
                exitKm.markDirty();
                world.updateListeners(pos, bst, bst, Block.NOTIFY_ALL);
            } else if (be instanceof RodWithLampBlockEntity rodLamp) {
                if (data.contains("Duration")) {
                    rodLamp.setDurationFromString(data.getString("Duration"));
                }
                if (data.contains("Color") &&
                    bst.contains(RodWithLampBlock.COLOR)) {
                    int colorId = data.getInt("Color");
                    bst = bst.with(
                        RodWithLampBlock.COLOR,
                        RodWithLampBlock.LightVisualColor.byID(colorId)
                    );
                    world.setBlockState(pos, bst, Block.NOTIFY_ALL);
                }
                rodLamp.markDirty();
                world.updateListeners(pos, bst, bst, Block.NOTIFY_ALL);
            }
        });});
    }

    @Contract(value = "-> fail", pure = true)
    private ModNetworking() {
        throw new UnsupportedOperationException("Utility class");
    }
}
