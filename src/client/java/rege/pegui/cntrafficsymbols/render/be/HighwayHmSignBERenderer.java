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
import net.minecraft.text.Text;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import rege.pegui.cntrafficsymbols.be.HighwayHmSignBlockEntity;

import static io.github.eat_ram.cntrafficsymbols.core.struct.Attachment3
              .ATTACHMENT;
import static io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing
              .FACING;
import static net.minecraft.world.LightUtil.getBlockBrightness;

@Environment(EnvType.CLIENT)
public class HighwayHmSignBERenderer
implements CustomBERenderer<HighwayHmSignBlockEntity> {
    private static final Vec3d TEXT_OFFSET = new Vec3d(0, .171875, .075);
    public static final float UP_OFFSET = .375f;
    public static final float DOWN_OFFSET = -.375f;
    private final TextRenderer tr;

    public HighwayHmSignBERenderer(BlockEntityRendererFactory.Context ctx) {
        this.tr = ctx.textRenderer();
    }

    @Override
    public void render(
        CustomBERenderState<HighwayHmSignBlockEntity> state,
        MatrixStack matrices, OrderedRenderCommandQueue queue,
        CameraRenderState cameraState
    ) {
        HighwayHmSignBlockEntity ett = state.blockEntity;
        Text tx = ett.getCustomName();
        if (tx == null) {
            return;
        }
        int light = (ett.getWorld() != null) ?
                    getBlockBrightness(ett.getWorld(), ett.getPos()) :
                    15728880;
        BlockState st = ett.getCachedState();
        matrices.push();
        this.setAngles(
            matrices,
            st.get(FACING).isWall() ? (26 - st.get(FACING).id) * 90f :
            (((32 - st.get(FACING).id) % 16) * 22.5f), st
        );
        this.renderText(matrices, light, queue, tx, true);
        if (!st.get(FACING).isSingle()) {
            this.renderText(matrices, light, queue, tx, false);
        }
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

    void renderText(
        MatrixStack matrices, int light, OrderedRenderCommandQueue queue,
        Text tx, boolean front
    ) {
        matrices.push();
        this.setTextAngles(matrices, front, TEXT_OFFSET);
        int i = 0xff009030;
        int j = 16;
        net.minecraft.text.OrderedText odt = tx.asOrderedText();
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
        float f = .00390625f;
        matrices.translate(translation.x, translation.y, translation.z);
        matrices.scale(f, -f, f);
    }
}
