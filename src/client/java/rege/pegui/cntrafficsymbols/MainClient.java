package rege.pegui.cntrafficsymbols;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import rege.pegui.cntrafficsymbols.be.HighwayExitDistanceInfoKmBlockEntity;
import rege.pegui.cntrafficsymbols.be.HighwayExitDistanceInfoNameBlockEntity;
import rege.pegui.cntrafficsymbols.be.HighwayHmSignBlockEntity;
import rege.pegui.cntrafficsymbols.be.HighwayKmSignBlockEntity;
import rege.pegui.cntrafficsymbols.render.be
       .HighwayExitDistanceInfoKmBERenderer;
import rege.pegui.cntrafficsymbols.render.be
       .HighwayExitDistanceInfoNameBERenderer;
import rege.pegui.cntrafficsymbols.render.be.HighwayHmSignBERenderer;
import rege.pegui.cntrafficsymbols.render.be.HighwayKmSignBERenderer;

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
