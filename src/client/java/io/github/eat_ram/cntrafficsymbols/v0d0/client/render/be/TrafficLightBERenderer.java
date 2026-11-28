package io.github.eat_ram.cntrafficsymbols.v0d0.client.render.be;

import io.github.eat_ram.cntrafficsymbols.core.helper.TimelineHelper;
import io.github.eat_ram.cntrafficsymbols.core.struct.HorizontalAttach4;
import io.github.eat_ram.cntrafficsymbols.core.struct.LampSignal;
import io.github.eat_ram.cntrafficsymbols.core.struct.VerticalAttach3;
import io.github.eat_ram.cntrafficsymbols.core.traffic.ClientTrafficLightCache;
import io.github.eat_ram.cntrafficsymbols.core.traffic.LightConfig;
import io.github.eat_ram.cntrafficsymbols.core.traffic.TrafficLightGroup;
import io.github.eat_ram.cntrafficsymbols.v0d0.block
       .HorizontalTrafficLightBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.block
       .Horizontal3SqMidTrafficLightBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.block
       .Vertical3SqMidTrafficLightBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.VerticalTrafficLightBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .TrafficLightBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.World;
import org.jetbrains.annotations.Contract;

import static io.github.eat_ram.cntrafficsymbols.core.client.screen
              .TrafficLightConfigScreen.getPatternTexture;
import static net.minecraft.client.render.OverlayTexture.DEFAULT_UV;
import static net.minecraft.state.property.Properties.HORIZONTAL_FACING;

public class TrafficLightBERenderer
implements BlockEntityRenderer<TrafficLightBlockEntity> {
    private static final float APERTURE_RADIUS = 2.25f / 16f;

    private static void renderPatternQuad(
        MatrixStack matrices, VertexConsumerProvider vcs,
        Identifier texture, float cx, float cy, float z, float radius,
        int r, int g, int b, int a
    ) {
        if (texture == null) {
            return;
        }
        float x1 = cx - radius;
        float x2 = cx + radius;
        float y1 = cy - radius;
        float y2 = cy + radius;

        VertexConsumer vc =
        vcs.getBuffer(RenderLayer.getEntityTranslucentEmissive(texture));
        MatrixStack.Entry entry = matrices.peek();

        vc.vertex(entry.getPositionMatrix(), x1, y1, z).color(r, g, b, a)
        .texture(0f, 1f).overlay(DEFAULT_UV).light(15728880)
        .normal(entry.getNormalMatrix(), 0f, 0f, 1f).next();
        vc.vertex(entry.getPositionMatrix(), x2, y1, z).color(r, g, b, a)
        .texture(1f, 1f).overlay(DEFAULT_UV).light(15728880)
        .normal(entry.getNormalMatrix(), 0f, 0f, 1f).next();
        vc.vertex(entry.getPositionMatrix(), x2, y2, z).color(r, g, b, a)
        .texture(1f, 0f).overlay(DEFAULT_UV).light(15728880)
        .normal(entry.getNormalMatrix(), 0f, 0f, 1f).next();
        vc.vertex(entry.getPositionMatrix(), x1, y2, z).color(r, g, b, a)
        .texture(0f, 0f).overlay(DEFAULT_UV).light(15728880)
        .normal(entry.getNormalMatrix(), 0f, 0f, 1f).next();
    }

    @Contract(pure = true)
    private static int getSignalArgb(LampSignal signal) {
        return switch (signal) {
            case RED -> 0xffff2020;
            case YELLOW, YELLOW_FLASHING -> 0xffffb800;
            case GREEN, GREEN_FLASHING -> 0xff00e676;
            default -> 0xff000000;
        };
    }

    private final TextRenderer textRenderer;

    public TrafficLightBERenderer(BlockEntityRendererFactory.Context ctx) {
        this.textRenderer = ctx.getTextRenderer();
    }

    @Override
    public void render(
        TrafficLightBlockEntity be, float tickDelta, MatrixStack matrices,
        VertexConsumerProvider vcs, int light, int overlay
    ) {
        World world = be.getWorld();
        if (world == null) {
            return;
        }
        BlockPos pos = be.getPos();
        TrafficLightGroup group = ClientTrafficLightCache.getGroupByPos(pos);
        if (group == null) {
            return;
        }
        LightConfig config = group.getLights().get(pos);
        if (config == null) {
            return;
        }

        BlockState bst = be.getCachedState();
        Direction facing = bst.get(HORIZONTAL_FACING);
        Block blk = bst.getBlock();
        boolean isHorizontal = blk instanceof HorizontalTrafficLightBlock;

        int unitCount = config.getUnitCount();
        long time =
        TimelineHelper.getEffectiveTime(world, group.syncWithDayNight);

        matrices.push();
        matrices.translate(0.5f, 0.5f, 0.5f);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(
            -facing.asRotation()
        ));
        matrices.translate(-0.5f, -0.5f, -0.5f);

        if (isHorizontal) {
            this.renderHorizontal(
                matrices, vcs, bst, group, config, pos, unitCount, time
            );
        } else if (blk instanceof VerticalTrafficLightBlock) {
            this.renderVertical(
                matrices, vcs, bst, group, config, pos, unitCount, time
            );
        }

        matrices.pop();
    }

    private void renderHorizontal(
        MatrixStack matrices, VertexConsumerProvider vcs, BlockState bst,
        TrafficLightGroup group, LightConfig config, BlockPos pos,
        int unitCount, long time
    ) {
        HorizontalAttach4 attach = bst.get(HorizontalAttach4.ATTACHMENT);
        float z =
        (attach == HorizontalAttach4.CEILING ? 10.005f : 2.005f) / 16f;
        float cy;
        if (attach == HorizontalAttach4.DOWN) {
            cy = 3f / 16f;
        } else if (attach == HorizontalAttach4.MIDDLE) {
            cy = 8f / 16f;
        } else {
            cy = 13f / 16f;
        }

        Block block = bst.getBlock();
        for (int i = 0; i < unitCount; i++) {
            this.renderUnit(
                matrices, vcs, group, config, pos, block, i, time,
                (unitCount == 2 ? (i == 0 ? 5.25f : 10.75f) :
                 (i == 0 ? 3f : (i == 1 ? 8f : 13f))) / 16f, cy, z
            );
        }
    }

    private void renderVertical(
        MatrixStack matrices, VertexConsumerProvider vcs, BlockState bst,
        TrafficLightGroup group, LightConfig config, BlockPos pos,
        int unitCount, long time
    ) {
        VerticalAttach3 attach = bst.get(VerticalAttach3.ATTACHMENT);
        float z = 2.005f / 16f;
        float cx;
        if (attach == VerticalAttach3.LEFT) {
            cx = 3f / 16f;
        } else if (attach == VerticalAttach3.MIDDLE) {
            cx = 8f / 16f;
        } else {
            cx = 13f / 16f;
        }

        Block block = bst.getBlock();
        for (int i = 0; i < unitCount; i++) {
            this.renderUnit(
                matrices, vcs, group, config, pos, block, i, time, cx,
                (unitCount == 2 ? (i == 0 ? 10.5f : 5.5f) :
                 (i == 0 ? 13f : (i == 1 ? 8f : 3f))) / 16f, z
            );
        }
    }

    private void renderUnit(
        MatrixStack matrices, VertexConsumerProvider vcs,
        TrafficLightGroup group, LightConfig cfg, BlockPos pos, Block block,
        int unitIndex, long time, float cx, float cy, float z
    ) {
        byte pattern = cfg != null ? cfg.getPattern(unitIndex) : (byte)0;
        LampSignal signal = group.getActiveSignal(time, pos, unitIndex);

        boolean isSqMidCountdownUnit = unitIndex == 1 && (
            block instanceof Horizontal3SqMidTrafficLightBlock ||
            block instanceof Vertical3SqMidTrafficLightBlock
        );

        if (isSqMidCountdownUnit) {
            if (signal == LampSignal.YELLOW ||
                signal == LampSignal.YELLOW_FLASHING) {
                if (signal.isFlashing() && (time % 20L) >= 10L) {
                    return;
                }
                int[] rgb = CountdownTimerBERenderer.getSignalRgb(signal);
                Identifier tex = getPatternTexture(pattern);
                renderPatternQuad(
                    matrices, vcs, tex, cx, cy, z, APERTURE_RADIUS,
                    rgb[0], rgb[1], rgb[2], 255
                );
            } else {
                int remSec =
                group.getRemainingSecondsForCountdown(time, pos, false);
                LampSignal overallColor =
                group.getActiveCountdownColor(time, pos);
                if (remSec >= 0 && overallColor != null) {
                    boolean flashing =
                    overallColor.isFlashing() || signal.isFlashing();
                    if (flashing && (time % 20L) >= 10L) {
                        return;
                    }
                    int argb = getSignalArgb(overallColor);
                    this.renderCountdownText(
                        matrices, vcs, cx, cy, z, remSec, argb
                    );
                } else if (signal.isLit()) {
                    if (signal.isFlashing() && (time % 20L) >= 10L) {
                        return;
                    }
                    int[] rgb = CountdownTimerBERenderer.getSignalRgb(signal);
                    Identifier tex = getPatternTexture(pattern);
                    renderPatternQuad(
                        matrices, vcs, tex, cx, cy, z, APERTURE_RADIUS,
                        rgb[0], rgb[1], rgb[2], 255
                    );
                }
            }
        } else {
            if (signal == LampSignal.OFF) {
                return;
            }
            if (signal.isFlashing() && (time % 20L) >= 10L) {
                return;
            }
            int[] rgb = CountdownTimerBERenderer.getSignalRgb(signal);
            Identifier tex = getPatternTexture(pattern);
            renderPatternQuad(
                matrices, vcs, tex, cx, cy, z, APERTURE_RADIUS,
                rgb[0], rgb[1], rgb[2], 255
            );
        }
    }

    private void renderCountdownText(
        MatrixStack matrices, VertexConsumerProvider vcs,
        float cx, float cy, float z, int remSec, int argb
    ) {
        String str = Integer.toString(remSec);
        OrderedText odt =
        Text.literal(str).styled(s -> s.withBold(true)).asOrderedText();
        float textWidth = this.textRenderer.getWidth(odt);

        matrices.push();
        matrices.translate(cx, cy, z + 0.0005f);
        float scale = 0.017f;
        matrices.scale(scale, -scale, scale);
        float textX = -textWidth * 0.5f;
        float textY = -4.5f;

        this.textRenderer.draw(
            odt, textX, textY, argb, false,
            matrices.peek().getPositionMatrix(), vcs,
            TextRenderer.TextLayerType.POLYGON_OFFSET, 0, 15728880
        );
        matrices.pop();
    }
}
