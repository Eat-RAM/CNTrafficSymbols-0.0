package rege.pegui.cntrafficsymbols.render.be;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
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

@Environment(EnvType.CLIENT)
public class HighwayExitDistanceInfoKmBERenderer
implements BlockEntityRenderer<HighwayExitDistanceInfoKmBlockEntity> {
    private static final Vec3d TEXT_OFFSET = new Vec3d(0, .75, .075);
    private final TextRenderer tr;

    public HighwayExitDistanceInfoKmBERenderer(
        BlockEntityRendererFactory.Context ctx
    ) {
        this.tr = ctx.getTextRenderer();
    }

    @Override
    public void render(
        HighwayExitDistanceInfoKmBlockEntity ett, float tickDelta,
        MatrixStack matrices, VertexConsumerProvider vcs, int light,
        int overlay
    ) {
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
            this.renderText(st, p, tx, matrices, vcs, light, 8, 90, true);
            if (!(st.get(FACING).isSingle())) {
                this.renderText(st, p, tx, matrices, vcs, light, 8, 90, false);
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
        BlockState st, BlockPos pos, Text tx, MatrixStack matrices,
        VertexConsumerProvider vcs, int light, int lineHeight, int lineWidth,
        boolean front
    ) {
        matrices.push();
        this.setTextAngles(st, matrices, front, TEXT_OFFSET);
        int i = 16777215;
        int j = 4 * lineHeight / 2;
        net.minecraft.text.OrderedText odt = tx.asOrderedText();
        this.tr.draw(odt, (float)(6 - this.tr.getWidth(odt) / 1.25), (float)j,
                     i, false, matrices.peek().getPositionMatrix(),
                     vcs, TextRenderer.TextLayerType.POLYGON_OFFSET, 0, light);
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
