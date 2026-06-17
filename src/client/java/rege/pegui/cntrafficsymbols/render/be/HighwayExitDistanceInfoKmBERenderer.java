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
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import rege.pegui.cntrafficsymbols.be.HighwayExitDistanceInfoKmBlockEntity;
import rege.pegui.cntrafficsymbols.block.HighwayExitDistanceInfoRightBlock;

import static io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing90
              .FACING;
import static net.minecraft.world.LightUtil.getBlockBrightness;

@Environment(EnvType.CLIENT)
public class HighwayExitDistanceInfoKmBERenderer
implements CustomBERenderer<HighwayExitDistanceInfoKmBlockEntity> {
    private static final Vec3d TEXT_OFFSET = new Vec3d(0, .75, .075);
    private final TextRenderer tr;

    public HighwayExitDistanceInfoKmBERenderer(
        BlockEntityRendererFactory.Context ctx
    ) {
        this.tr = ctx.textRenderer();
    }

    @Override
    public void render(
        CustomBERenderState<HighwayExitDistanceInfoKmBlockEntity> state,
        MatrixStack matrices, OrderedRenderCommandQueue queue,
        CameraRenderState cameraState
    ) {
        HighwayExitDistanceInfoKmBlockEntity ett = state.blockEntity;
        int light = (ett.getWorld() != null) ?
                    getBlockBrightness(ett.getWorld(), ett.getPos()) :
                    15728880;
        Text tx = Text.literal(ett.getKmStr() + "km");
        BlockState st = ett.getCachedState();
        matrices.push();
        if (st.getBlock() instanceof HighwayExitDistanceInfoRightBlock) {
            this.setAngles(
                matrices,
                st.get(FACING).isWall() ? (8 - st.get(FACING).id) * 90f :
                (((8 - st.get(FACING).id) % 4) * 90f), st
            );
            BlockPos p = ett.getPos();
            World w = ett.getWorld();
            this.renderText(st, matrices, light, queue, tx, true);
            if (!(st.get(FACING).isSingle())) {
                this.renderText(st, matrices, light, queue, tx, false);
            }
            matrices.pop();
            return;
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
    }

    void renderText(
        BlockState st, MatrixStack matrices, int light,
        OrderedRenderCommandQueue queue, Text tx, boolean front
    ) {
        matrices.push();
        this.setTextAngles(st, matrices, front, TEXT_OFFSET);
        int i = -1;
        int j = 16;
        net.minecraft.text.OrderedText odt = tx.asOrderedText();
        queue.submitText(
            matrices, (float)(6 - this.tr.getWidth(odt) / 1.25), (float)j, odt,
            false, TextRenderer.TextLayerType.POLYGON_OFFSET, light, i, 0, 0
        );
        matrices.pop();
    }

    private void setTextAngles(
        BlockState st, MatrixStack matrices, boolean front, Vec3d translation
    ) {
        if (!front) {
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180f));
        }
        float f = 0f;
        if (st.getBlock() instanceof HighwayExitDistanceInfoRightBlock) {
            f = .03125f;
        }
        if (f > 0f) {
            matrices.translate(translation.x, translation.y, translation.z);
            matrices.scale(f, -f, f);
        }
    }
}
