package io.github.eat_ram.cntrafficsymbols.v0d0.client.render.be;

import net.minecraft.block.BlockState;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayKmSignBlockEntity;

import static io.github.eat_ram.cntrafficsymbols.core.struct.Attachment3
              .ATTACHMENT;
import static io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing
              .FACING;

public class HighwayKmSignBERenderer
implements BlockEntityRenderer<HighwayKmSignBlockEntity> {
    private static final Vec3d TEXT_OFFSET = new Vec3d(0, 0.25, 0.0375);
    private static final Vec3d INT_OFFSET = new Vec3d(0, 0.625, 0.0375);
    public static final float UP_OFFSET = 0.259375f;
    public static final float DOWN_OFFSET = -0.259375f;
    private final TextRenderer tr;

    public HighwayKmSignBERenderer(BlockEntityRendererFactory.Context ctx) {
        this.tr = ctx.getTextRenderer();
    }

    @Override
    public void render(
        HighwayKmSignBlockEntity ett, float tickDelta, MatrixStack matrices,
        VertexConsumerProvider vcs, int light, int overlay
    ) {
        Text tx = ett.getCustomName();
        int km = ett.getKm();
        if (km < 0) {
            km = ~km;
        }
        boolean pf = ett.isPointFive();
        BlockState st = ett.getCachedState();
        matrices.push();
        this.setAngles(matrices, st.get(FACING).isWall() ? (
            26 - st.get(FACING).id
        ) * 90f : (((32 - st.get(FACING).id) % 16) * 22.5f), st);
        if (tx != null) {
            this
            .renderText(ett.getPos(), tx, matrices, vcs, light, 8, 90, true);
        }
        this.renderKm(ett.getPos(), km, pf, matrices, vcs, light, 8, 90, true);
        if (!st.get(FACING).isSingle()) {
            if (tx != null) {
                this.renderText(
                    ett.getPos(), tx, matrices, vcs, light, 8, 90, false
                );
            }
            this.renderKm(ett.getPos(), km, pf, matrices, vcs, light, 8, 90,
                          false);
        }
        matrices.pop();
    }

    void
    setAngles(MatrixStack matrices, float rotationDegrees, BlockState st) {
        matrices.translate(.5f, .375f, .5f);
        matrices.multiply(
            RotationAxis.POSITIVE_Y.rotationDegrees(rotationDegrees)
        );
        if (st.get(FACING).isWall()) {
            matrices.translate(0f, 0f, -.5f);
        }
        switch (st.get(ATTACHMENT).id) {
            case 1: matrices.translate(0f, DOWN_OFFSET, 0f); break;
            case 2: matrices.translate(0f, UP_OFFSET, 0f); break;
        }
    }

    private void renderText(
        BlockPos pos, Text tx, MatrixStack matrices,
        VertexConsumerProvider vcs, int light, int lineHeight, int lineWidth,
        boolean front
    ) {
        matrices.push();
        setTextAngles(matrices, front, TEXT_OFFSET);
        int i = 16777215;
        int j = 4 * lineHeight / 2;
        OrderedText odt = tx.asOrderedText();
        this.tr.draw(odt, (float)(-this.tr.getWidth(odt) / 2), (float)j, i,
                     false, matrices.peek().getPositionMatrix(), vcs,
                     TextRenderer.TextLayerType.POLYGON_OFFSET, 0, light);
        matrices.pop();
    }

    private static void
    setTextAngles(MatrixStack matrices, boolean front, Vec3d translation) {
        if (!front) {
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180f));
        }
        float f = .01171875f;
        matrices.translate(translation.x, translation.y, translation.z);
        matrices.scale(f, -f, f);
    }

    private void renderKm(
        BlockPos pos, int v, boolean pointFive, MatrixStack matrices,
        VertexConsumerProvider vcs, int light, int lineHeight, int lineWidth,
        boolean front
    ) {
        matrices.push();
        setIntAngles(matrices, front, INT_OFFSET);
        int i = 16777215;
        int j = 4 * lineHeight / 2;
        String s = v + (pointFive ? ".\u2085" : "");
        OrderedText odt = Text.literal(s).asOrderedText();
        this.tr.draw(odt, (float)(-this.tr.getWidth(odt) / 2), (float)j, i,
                     false, matrices.peek().getPositionMatrix(), vcs,
                     TextRenderer.TextLayerType.POLYGON_OFFSET, 0, light);
        matrices.pop();
    }

    private static void
    setIntAngles(MatrixStack matrices, boolean front, Vec3d translation) {
        if (!front) {
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180f));
        }
        float f = .01953125f;
        matrices.translate(translation.x, translation.y, translation.z);
        matrices.scale(f, -f, f);
    }
}
