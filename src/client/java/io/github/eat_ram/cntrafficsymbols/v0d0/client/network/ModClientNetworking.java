package io.github.eat_ram.cntrafficsymbols.v0d0.client.network;

import io.github.eat_ram.cntrafficsymbols.v0d0.block
       .HighwayExitDistanceInfoParts;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.RodWithLampBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayHmSignBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayKmSignBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be.RodWithLampBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.client.screen
       .HighwayExitInfoEditScreen;
import io.github.eat_ram.cntrafficsymbols.v0d0.client.screen
       .HighwayHmSignEditScreen;
import io.github.eat_ram.cntrafficsymbols.v0d0.client.screen
       .HighwayKmSignEditScreen;
import io.github.eat_ram.cntrafficsymbols.v0d0.client.screen
       .RodWithLampEditScreen;
import io.github.eat_ram.cntrafficsymbols.v0d0.network
       .OpenEditTrafficSignPayload;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Contract;

public final class ModClientNetworking {
    public static void init() {
        ClientPlayNetworking
        .registerGlobalReceiver(OpenEditTrafficSignPayload.ID, (
            payload, context
        ) -> context.client().execute(() -> {
            ClientWorld world = context.client().world;
            if (world == null) {
                return;
            }
            BlockPos pos = payload.pos();
            BlockEntity be = world.getBlockEntity(pos);
            BlockState state = world.getBlockState(pos);
            switch (payload.type()) {
                case OpenEditTrafficSignPayload.TYPE_HIGHWAY_KM:
                    if (be instanceof HighwayKmSignBlockEntity km) {
                        context.client().guiManager
                        .setScreen(new HighwayKmSignEditScreen(km));
                    }
                    break;
                case OpenEditTrafficSignPayload.TYPE_HIGHWAY_HM:
                    if (be instanceof HighwayHmSignBlockEntity hm) {
                        context.client().guiManager
                        .setScreen(new HighwayHmSignEditScreen(hm));
                    }
                    break;
                case OpenEditTrafficSignPayload.TYPE_HIGHWAY_EXIT_INFO:
                    HighwayExitDistanceInfoParts parts =
                    new HighwayExitDistanceInfoParts(
                        world, pos, state, payload.hitSide()
                    );
                    context.client().guiManager
                    .setScreen(new HighwayExitInfoEditScreen(parts));
                    break;
                case OpenEditTrafficSignPayload.TYPE_ROD_WITH_LAMP:
                    if (be instanceof RodWithLampBlockEntity rod) {
                        RodWithLampBlock.LightVisualColor color =
                        state.getOrEmpty(RodWithLampBlock.COLOR)
                        .orElse(RodWithLampBlock.LightVisualColor.WHITE);
                        context.client().guiManager
                        .setScreen(new RodWithLampEditScreen(rod, color));
                    }
                    break;
            }
        }));
    }

    @Contract(value = "-> fail", pure = true)
    private ModClientNetworking() {
        throw new UnsupportedOperationException("Utility class");
    }
}
