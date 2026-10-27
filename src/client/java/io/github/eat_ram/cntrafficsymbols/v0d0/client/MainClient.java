package io.github.eat_ram.cntrafficsymbols.v0d0.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be.HighwayExitDistanceInfoKmBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be.HighwayExitDistanceInfoNameBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be.HighwayHmSignBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be.HighwayKmSignBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.client.render.be.HighwayExitDistanceInfoKmBERenderer;
import io.github.eat_ram.cntrafficsymbols.v0d0.client.render.be.HighwayExitDistanceInfoNameBERenderer;
import io.github.eat_ram.cntrafficsymbols.v0d0.client.render.be.HighwayHmSignBERenderer;
import io.github.eat_ram.cntrafficsymbols.v0d0.client.render.be.HighwayKmSignBERenderer;

public class MainClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories
        .register(HighwayHmSignBlockEntity.TYPE, HighwayHmSignBERenderer::new);
        BlockEntityRendererFactories
        .register(HighwayKmSignBlockEntity.TYPE, HighwayKmSignBERenderer::new);
        BlockEntityRendererFactories.register(
            HighwayExitDistanceInfoNameBlockEntity.TYPE,
            HighwayExitDistanceInfoNameBERenderer::new
        );
        BlockEntityRendererFactories.register(
            HighwayExitDistanceInfoKmBlockEntity.TYPE,
            HighwayExitDistanceInfoKmBERenderer::new
        );
    }
}
