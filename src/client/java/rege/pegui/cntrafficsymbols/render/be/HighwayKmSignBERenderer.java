package rege.pegui.cntrafficsymbols.render.be;

import io.github.eat_ram.cntrafficsymbols.v0d0.client.render.be
       .CustomBERenderState;
import io.github.eat_ram.cntrafficsymbols.v0d0.client.render.be
       .CustomBERenderer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Text;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import rege.pegui.cntrafficsymbols.be.HighwayKmSignBlockEntity;

import static io.github.eat_ram.cntrafficsymbols.core.struct.Attachment3
              .ATTACHMENT;
import static io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing
              .FACING;
import static net.minecraft.world.LightUtil.getBlockBrightness;

@Environment(EnvType.CLIENT)
public class HighwayKmSignBERenderer
implements CustomBERenderer<HighwayKmSignBlockEntity> {
    private static final Vec3d TEXT_OFFSET = new Vec3d(0, .25, .075);
    private static final Vec3d INT_OFFSET = new Vec3d(0, .625, .075);
    public static final float UP_OFFSET = .25f;
    public static final float DOWN_OFFSET = -.25f;
    private final TextRenderer tr;

    public HighwayKmSignBERenderer(BlockEntityRendererFactory.Context ctx) {
        this.tr = ctx.textRenderer();
    }

    @Override
    public void render(
        CustomBERenderState<HighwayKmSignBlockEntity> state,
        MatrixStack matrices, OrderedRenderCommandQueue queue,
        CameraRenderState cameraState
    ) {
        HighwayKmSignBlockEntity ett = state.blockEntity;
        int light = (ett.getWorld() != null) ?
                    getBlockBrightness(ett.getWorld(), ett.getPos()) :
                    15728880;
        Text tx = ett.getCustomName();
        int km = ett.getKm();
        if (km < 0) {
            km = ~km;
        }
        BlockState st = ett.getCachedState();
        matrices.push();
        this.setAngles(
            matrices,
            st.get(FACING).isWall() ? (26 - st.get(FACING).id) * 90f :
            (((32 - st.get(FACING).id) % 16) * 22.5f), st
        );
        if (tx != null) {
            this.renderText(matrices, light, queue, tx, true);
        }
        this.renderInt(matrices, light, queue, km, true);
        if (!st.get(FACING).isSingle()) {
            if (tx != null) {
                this.renderText(matrices, light, queue, tx, false);
            }
            this.renderInt(matrices, light, queue, km, false);
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
            case 1:
                matrices.translate(0f, DOWN_OFFSET, 0f);
                break;
            case 2:
                matrices.translate(0f, UP_OFFSET, 0f);
                break;
        }
    }

    private void renderText(
        MatrixStack matrices, int light, OrderedRenderCommandQueue queue,
        Text tx, boolean front
    ) {
        matrices.push();
        this.setTextAngles(matrices, front, TEXT_OFFSET);
        int i = -1;
        int j = 16;
        OrderedText odt = tx.asOrderedText();
        queue.submitText(
            matrices, (float)(-this.tr.getWidth(odt) / 2), (float)j, odt,
            false, TextRenderer.TextLayerType.POLYGON_OFFSET, light, i, 0, 0
        );
        matrices.pop();
    }

    private void
    setTextAngles(MatrixStack matrices, boolean front, Vec3d translation) {
        if (!front) {
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180f));
        }
        float f = .01171875f;
        matrices.translate(translation.x, translation.y, translation.z);
        matrices.scale(f, -f, f);
    }

    private void renderInt(
        MatrixStack matrices, int light, OrderedRenderCommandQueue queue,
        int v, boolean front
    ) {
        matrices.push();
        this.setIntAngles(matrices, front, INT_OFFSET);
        int i = -1;
        int j = 16;
        OrderedText odt = Text.literal(Integer.toString(v)).asOrderedText();
        queue.submitText(
            matrices, (float)(-this.tr.getWidth(odt) / 2), (float)j, odt,
            false, TextRenderer.TextLayerType.POLYGON_OFFSET, light, i, 0, 0
        );
        matrices.pop();
    }

    private void
    setIntAngles(MatrixStack matrices, boolean front, Vec3d translation) {
        if (!front) {
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180f));
        }
        float f = .01953125f;
        matrices.translate(translation.x, translation.y, translation.z);
        matrices.scale(f, -f, f);
    }
}
