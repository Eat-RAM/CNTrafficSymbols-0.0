package io.github.eat_ram.cntrafficsymbols.v0d0.client;

import java.util.function.Supplier;

import io.github.eat_ram.cntrafficsymbols.v0d0.block.AllBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.fabricmc.fabric.api.client.rendereregistry.v1
       .BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.renderer.v1.RendererAccess;
import net.fabricmc.fabric.api.renderer.v1.material.BlendMode;
import net.fabricmc.fabric.api.renderer.v1.material.MaterialFinder;
import net.fabricmc.fabric.api.renderer.v1.material.RenderMaterial;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.model.ForwardingBakedModel;
import net.fabricmc.fabric.api.renderer.v1.render.RenderContext;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.model.BakedQuad;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockRenderView;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayExitDistanceInfoKmBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayExitDistanceInfoNameBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayHmSignBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayKmSignBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.client.render.be
       .HighwayExitDistanceInfoKmBERenderer;
import io.github.eat_ram.cntrafficsymbols.v0d0.client.render.be
       .HighwayExitDistanceInfoNameBERenderer;
import io.github.eat_ram.cntrafficsymbols.v0d0.client.render.be
       .HighwayHmSignBERenderer;
import io.github.eat_ram.cntrafficsymbols.v0d0.client.render.be
       .HighwayKmSignBERenderer;

@SuppressWarnings("deprecation")
public class MainClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Block[] tab = {
            AllBlocks.SPEEDLIMIT_HIGH_3,
            AllBlocks.SPEEDLIMIT_HIGH_5,
            AllBlocks.SPEEDLIMIT_HIGH_10,
            AllBlocks.SPEEDLIMIT_HIGH_15,
            AllBlocks.SPEEDLIMIT_HIGH_20,
            AllBlocks.SPEEDLIMIT_HIGH_25,
            AllBlocks.SPEEDLIMIT_HIGH_30,
            AllBlocks.SPEEDLIMIT_HIGH_35,
            AllBlocks.SPEEDLIMIT_HIGH_40,
            AllBlocks.SPEEDLIMIT_HIGH_45,
            AllBlocks.SPEEDLIMIT_HIGH_50,
            AllBlocks.SPEEDLIMIT_HIGH_55,
            AllBlocks.SPEEDLIMIT_HIGH_60,
            AllBlocks.SPEEDLIMIT_HIGH_65,
            AllBlocks.SPEEDLIMIT_HIGH_70,
            AllBlocks.SPEEDLIMIT_HIGH_75,
            AllBlocks.SPEEDLIMIT_HIGH_80,
            AllBlocks.SPEEDLIMIT_HIGH_85,
            AllBlocks.SPEEDLIMIT_HIGH_90,
            AllBlocks.SPEEDLIMIT_HIGH_95,
            AllBlocks.SPEEDLIMIT_HIGH_100,
            AllBlocks.SPEEDLIMIT_HIGH_105,
            AllBlocks.SPEEDLIMIT_HIGH_110,
            AllBlocks.SPEEDLIMIT_HIGH_115,
            AllBlocks.SPEEDLIMIT_HIGH_120,
            AllBlocks.SPEEDLIMIT_HIGH_125,
            AllBlocks.SPEEDLIMIT_HIGH_130,
            AllBlocks.SPEEDLIMIT_HIGH_135,
            AllBlocks.SPEEDLIMIT_HIGH_140,
            AllBlocks.SPEEDLIMIT_HIGH_145,
            AllBlocks.SPEEDLIMIT_HIGH_150,
            AllBlocks.SPEEDLIMIT_HIGH_SPECIAL,
            AllBlocks.SPEEDLIMIT_LOW_3,
            AllBlocks.SPEEDLIMIT_LOW_5,
            AllBlocks.SPEEDLIMIT_LOW_10,
            AllBlocks.SPEEDLIMIT_LOW_15,
            AllBlocks.SPEEDLIMIT_LOW_20,
            AllBlocks.SPEEDLIMIT_LOW_25,
            AllBlocks.SPEEDLIMIT_LOW_30,
            AllBlocks.SPEEDLIMIT_LOW_35,
            AllBlocks.SPEEDLIMIT_LOW_40,
            AllBlocks.SPEEDLIMIT_LOW_45,
            AllBlocks.SPEEDLIMIT_LOW_50,
            AllBlocks.SPEEDLIMIT_LOW_55,
            AllBlocks.SPEEDLIMIT_LOW_60,
            AllBlocks.SPEEDLIMIT_LOW_65,
            AllBlocks.SPEEDLIMIT_LOW_70,
            AllBlocks.SPEEDLIMIT_LOW_75,
            AllBlocks.SPEEDLIMIT_LOW_80,
            AllBlocks.SPEEDLIMIT_LOW_85,
            AllBlocks.SPEEDLIMIT_LOW_90,
            AllBlocks.SPEEDLIMIT_LOW_95,
            AllBlocks.SPEEDLIMIT_LOW_100,
            AllBlocks.SPEEDLIMIT_LOW_105,
            AllBlocks.SPEEDLIMIT_LOW_110,
            AllBlocks.SPEEDLIMIT_LOW_115,
            AllBlocks.SPEEDLIMIT_LOW_120,
            AllBlocks.SPEEDLIMIT_LOW_125,
            AllBlocks.SPEEDLIMIT_LOW_130,
            AllBlocks.SPEEDLIMIT_LOW_135,
            AllBlocks.SPEEDLIMIT_LOW_140,
            AllBlocks.SPEEDLIMIT_LOW_145,
            AllBlocks.SPEEDLIMIT_LOW_150,
            AllBlocks.SPEEDLIMIT_LOW_SPECIAL,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_3,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_5,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_10,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_15,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_20,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_25,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_30,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_35,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_40,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_45,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_50,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_55,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_60,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_65,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_70,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_75,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_80,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_85,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_90,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_95,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_100,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_105,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_110,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_115,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_120,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_125,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_130,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_135,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_140,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_145,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_150,
            AllBlocks.LIFT_SPEEDLIMIT_HIGH_SPECIAL,
            AllBlocks.CIRCLE_BACKBOARD,
            AllBlocks.HEIGHTLIMIT_SPECIAL,
            AllBlocks.HEIGHTLIMIT_0D1,
            AllBlocks.HEIGHTLIMIT_0D2,
            AllBlocks.HEIGHTLIMIT_0D3,
            AllBlocks.HEIGHTLIMIT_0D4,
            AllBlocks.HEIGHTLIMIT_0D5,
            AllBlocks.HEIGHTLIMIT_0D6,
            AllBlocks.HEIGHTLIMIT_0D7,
            AllBlocks.HEIGHTLIMIT_0D8,
            AllBlocks.HEIGHTLIMIT_0D9,
            AllBlocks.HEIGHTLIMIT_1,
            AllBlocks.HEIGHTLIMIT_1D1,
            AllBlocks.HEIGHTLIMIT_1D2,
            AllBlocks.HEIGHTLIMIT_1D3,
            AllBlocks.HEIGHTLIMIT_1D4,
            AllBlocks.HEIGHTLIMIT_1D5,
            AllBlocks.HEIGHTLIMIT_1D6,
            AllBlocks.HEIGHTLIMIT_1D7,
            AllBlocks.HEIGHTLIMIT_1D8,
            AllBlocks.HEIGHTLIMIT_1D9,
            AllBlocks.HEIGHTLIMIT_2,
            AllBlocks.HEIGHTLIMIT_2D1,
            AllBlocks.HEIGHTLIMIT_2D2,
            AllBlocks.HEIGHTLIMIT_2D3,
            AllBlocks.HEIGHTLIMIT_2D4,
            AllBlocks.HEIGHTLIMIT_2D5,
            AllBlocks.HEIGHTLIMIT_2D6,
            AllBlocks.HEIGHTLIMIT_2D7,
            AllBlocks.HEIGHTLIMIT_2D8,
            AllBlocks.HEIGHTLIMIT_2D9,
            AllBlocks.HEIGHTLIMIT_3,
            AllBlocks.HEIGHTLIMIT_3D1,
            AllBlocks.HEIGHTLIMIT_3D2,
            AllBlocks.HEIGHTLIMIT_3D3,
            AllBlocks.HEIGHTLIMIT_3D4,
            AllBlocks.HEIGHTLIMIT_3D5,
            AllBlocks.HEIGHTLIMIT_3D6,
            AllBlocks.HEIGHTLIMIT_3D7,
            AllBlocks.HEIGHTLIMIT_3D8,
            AllBlocks.HEIGHTLIMIT_3D9,
            AllBlocks.HEIGHTLIMIT_4,
            AllBlocks.HEIGHTLIMIT_4D1,
            AllBlocks.HEIGHTLIMIT_4D2,
            AllBlocks.HEIGHTLIMIT_4D3,
            AllBlocks.HEIGHTLIMIT_4D4,
            AllBlocks.HEIGHTLIMIT_4D5,
            AllBlocks.HEIGHTLIMIT_4D6,
            AllBlocks.HEIGHTLIMIT_4D7,
            AllBlocks.HEIGHTLIMIT_4D8,
            AllBlocks.HEIGHTLIMIT_4D9,
            AllBlocks.HEIGHTLIMIT_5,
            AllBlocks.HEIGHTLIMIT_5D1,
            AllBlocks.HEIGHTLIMIT_5D2,
            AllBlocks.HEIGHTLIMIT_5D3,
            AllBlocks.HEIGHTLIMIT_5D4,
            AllBlocks.HEIGHTLIMIT_5D5,
            AllBlocks.HEIGHTLIMIT_5D6,
            AllBlocks.HEIGHTLIMIT_5D7,
            AllBlocks.HEIGHTLIMIT_5D8,
            AllBlocks.HEIGHTLIMIT_5D9,
            AllBlocks.HEIGHTLIMIT_6,
            AllBlocks.HEIGHTLIMIT_6D1,
            AllBlocks.HEIGHTLIMIT_6D2,
            AllBlocks.HEIGHTLIMIT_6D3,
            AllBlocks.HEIGHTLIMIT_6D4,
            AllBlocks.HEIGHTLIMIT_6D5,
            AllBlocks.HEIGHTLIMIT_6D6,
            AllBlocks.HEIGHTLIMIT_6D7,
            AllBlocks.HEIGHTLIMIT_6D8,
            AllBlocks.HEIGHTLIMIT_6D9,
            AllBlocks.HEIGHTLIMIT_7,
            AllBlocks.HEIGHTLIMIT_7D1,
            AllBlocks.HEIGHTLIMIT_7D2,
            AllBlocks.HEIGHTLIMIT_7D3,
            AllBlocks.HEIGHTLIMIT_7D4,
            AllBlocks.HEIGHTLIMIT_7D5,
            AllBlocks.HEIGHTLIMIT_7D6,
            AllBlocks.HEIGHTLIMIT_7D7,
            AllBlocks.HEIGHTLIMIT_7D8,
            AllBlocks.HEIGHTLIMIT_7D9,
            AllBlocks.HEIGHTLIMIT_8,
            AllBlocks.HEIGHTLIMIT_8D1,
            AllBlocks.HEIGHTLIMIT_8D2,
            AllBlocks.HEIGHTLIMIT_8D3,
            AllBlocks.HEIGHTLIMIT_8D4,
            AllBlocks.HEIGHTLIMIT_8D5,
            AllBlocks.HEIGHTLIMIT_8D6,
            AllBlocks.HEIGHTLIMIT_8D7,
            AllBlocks.HEIGHTLIMIT_8D8,
            AllBlocks.HEIGHTLIMIT_8D9,
            AllBlocks.HEIGHTLIMIT_9,
            AllBlocks.HEIGHTLIMIT_9D1,
            AllBlocks.HEIGHTLIMIT_9D2,
            AllBlocks.HEIGHTLIMIT_9D3,
            AllBlocks.HEIGHTLIMIT_9D4,
            AllBlocks.HEIGHTLIMIT_9D5,
            AllBlocks.HEIGHTLIMIT_9D6,
            AllBlocks.HEIGHTLIMIT_9D7,
            AllBlocks.HEIGHTLIMIT_9D8,
            AllBlocks.HEIGHTLIMIT_9D9,
            AllBlocks.HEIGHTLIMIT_10,
            AllBlocks.PROHIBITION,
            AllBlocks.NO_U_TURN,
            AllBlocks.NO_LEFT_TURN,
            AllBlocks.NO_RIGHT_TURN,
            AllBlocks.NO_PARKING,
            AllBlocks.NO_ENTRY,
            AllBlocks.NO_LEFT_AND_RIGHT_TURN,
            AllBlocks.NO_STRAIGHT_AHEAD,
            AllBlocks.NO_STRAIGHT_AHEAD_AND_LEFT_TURN,
            AllBlocks.NO_STRAIGHT_AHEAD_AND_RIGHT_TURN,
            AllBlocks.NO_STOPPING,
            AllBlocks.NO_STOPPING_LEFT,
            AllBlocks.NO_STOPPING_LEFT_RIGHT,
            AllBlocks.NO_STOPPING_RIGHT,
            AllBlocks.HIGHWAY_1HM,
            AllBlocks.HIGHWAY_2HM,
            AllBlocks.HIGHWAY_3HM,
            AllBlocks.HIGHWAY_4HM,
            AllBlocks.HIGHWAY_5HM,
            AllBlocks.HIGHWAY_6HM,
            AllBlocks.HIGHWAY_7HM,
            AllBlocks.HIGHWAY_8HM,
            AllBlocks.HIGHWAY_9HM,
            AllBlocks.HIGHWAY_KM,
            AllBlocks.WHITE_HALF1_CYLINDRICAL_ROD,
            AllBlocks.ORANGE_HALF1_CYLINDRICAL_ROD,
            AllBlocks.MAGENTA_HALF1_CYLINDRICAL_ROD,
            AllBlocks.LIGHT_BLUE_HALF1_CYLINDRICAL_ROD,
            AllBlocks.YELLOW_HALF1_CYLINDRICAL_ROD,
            AllBlocks.LIME_HALF1_CYLINDRICAL_ROD,
            AllBlocks.PINK_HALF1_CYLINDRICAL_ROD,
            AllBlocks.GRAY_HALF1_CYLINDRICAL_ROD,
            AllBlocks.LIGHT_GRAY_HALF1_CYLINDRICAL_ROD,
            AllBlocks.CYAN_HALF1_CYLINDRICAL_ROD,
            AllBlocks.PURPLE_HALF1_CYLINDRICAL_ROD,
            AllBlocks.BLUE_HALF1_CYLINDRICAL_ROD,
            AllBlocks.BROWN_HALF1_CYLINDRICAL_ROD,
            AllBlocks.GREEN_HALF1_CYLINDRICAL_ROD,
            AllBlocks.RED_HALF1_CYLINDRICAL_ROD,
            AllBlocks.BLACK_HALF1_CYLINDRICAL_ROD,
            AllBlocks.WHITE_FULL1_CYLINDRICAL_ROD,
            AllBlocks.ORANGE_FULL1_CYLINDRICAL_ROD,
            AllBlocks.MAGENTA_FULL1_CYLINDRICAL_ROD,
            AllBlocks.LIGHT_BLUE_FULL1_CYLINDRICAL_ROD,
            AllBlocks.YELLOW_FULL1_CYLINDRICAL_ROD,
            AllBlocks.LIME_FULL1_CYLINDRICAL_ROD,
            AllBlocks.PINK_FULL1_CYLINDRICAL_ROD,
            AllBlocks.GRAY_FULL1_CYLINDRICAL_ROD,
            AllBlocks.LIGHT_GRAY_FULL1_CYLINDRICAL_ROD,
            AllBlocks.CYAN_FULL1_CYLINDRICAL_ROD,
            AllBlocks.PURPLE_FULL1_CYLINDRICAL_ROD,
            AllBlocks.BLUE_FULL1_CYLINDRICAL_ROD,
            AllBlocks.BROWN_FULL1_CYLINDRICAL_ROD,
            AllBlocks.GREEN_FULL1_CYLINDRICAL_ROD,
            AllBlocks.RED_FULL1_CYLINDRICAL_ROD,
            AllBlocks.BLACK_FULL1_CYLINDRICAL_ROD
        };
        for (Block i : tab) {
            BlockRenderLayerMap.INSTANCE.putBlock(i, RenderLayer.getCutout());
        }
        ModelLoadingPlugin
        .register(pluginContext -> pluginContext.modifyModelAfterBake()
                                   .register((model, context) -> {
            Identifier id = context.id();
            if (id.getNamespace().equals("cntrafficsymbols_0d0") &&
                id.getPath().matches("block/[a-z_]*rod_with_lamp[a-z_]*")) {
                return new ForwardingBakedModel() {
                    private final RenderMaterial cutoutMaterial;
                    private final RenderMaterial translucentMaterial;

                    {
                        this.wrapped = model;
                        MaterialFinder finder =
                        RendererAccess.INSTANCE.getRenderer().materialFinder();
                        this.cutoutMaterial =
                        finder.clear().blendMode(BlendMode.CUTOUT).find();
                        this.translucentMaterial =
                        finder.clear().blendMode(BlendMode.TRANSLUCENT).find();
                    }

                    @Override
                    public boolean isVanillaAdapter() {
                        return false;
                    }

                    @Override
                    public void emitBlockQuads(
                        BlockRenderView blockView, BlockState state,
                        BlockPos pos, Supplier<Random> randomSupplier,
                        RenderContext context
                    ) {
                        QuadEmitter emitter = context.getEmitter();
                        for (Direction dir : Direction.values()) {
                            this.emitFiltered(this.wrapped.getQuads(
                                state, dir, randomSupplier.get()
                            ), emitter);
                        }
                        this.emitFiltered(this.wrapped.getQuads(
                            state, null, randomSupplier.get()
                        ), emitter);
                    }

                    private void emitFiltered(
                        Iterable<? extends BakedQuad> quads,
                        QuadEmitter emitter
                    ) {
                        for (BakedQuad quad : quads) {
                            emitter.fromVanilla(
                                quad,
                                quad.getSprite().getContents().getId()
                                .getPath().contains("_cover_") ?
                                this.translucentMaterial : this.cutoutMaterial,
                                null
                            );
                            emitter.emit();
                        }
                    }
                };
            }
            return model;
        })); // We should find a better way to handle it
        BlockEntityRendererRegistry.INSTANCE
        .register(HighwayHmSignBlockEntity.TYPE, HighwayHmSignBERenderer::new);
        BlockEntityRendererRegistry.INSTANCE
        .register(HighwayKmSignBlockEntity.TYPE, HighwayKmSignBERenderer::new);
        BlockEntityRendererRegistry.INSTANCE.register(
            HighwayExitDistanceInfoNameBlockEntity.TYPE,
            HighwayExitDistanceInfoNameBERenderer::new
        );
        BlockEntityRendererRegistry.INSTANCE.register(
            HighwayExitDistanceInfoKmBlockEntity.TYPE,
            HighwayExitDistanceInfoKmBERenderer::new
        );
        io.github.eat_ram.cntrafficsymbols.v0d0.client.network
        .ModClientNetworking.init();
    }
}
