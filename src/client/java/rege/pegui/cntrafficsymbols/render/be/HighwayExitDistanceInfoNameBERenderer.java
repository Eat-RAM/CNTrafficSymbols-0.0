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
import rege.pegui.cntrafficsymbols.be.HighwayExitDistanceInfoNameBlockEntity;
import rege.pegui.cntrafficsymbols.block.HighwayExitDistanceInfoLeftBlock;
import rege.pegui.cntrafficsymbols.block.HighwayExitDistanceInfoMiddleBlock;

import static io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing90
              .FACING;
import static net.minecraft.world.LightUtil.getBlockBrightness;

@Environment(EnvType.CLIENT)
public class HighwayExitDistanceInfoNameBERenderer
implements CustomBERenderer<HighwayExitDistanceInfoNameBlockEntity> {
    private static final Vec3d TEXT_OFFSET = new Vec3d(0, .8125, .075);
    private final TextRenderer tr;

    public HighwayExitDistanceInfoNameBERenderer(
        BlockEntityRendererFactory.Context ctx
    ) {
        this.tr = ctx.textRenderer();
    }

    @Override
    public void render(
        CustomBERenderState<HighwayExitDistanceInfoNameBlockEntity> state,
        MatrixStack matrices, OrderedRenderCommandQueue queue,
        CameraRenderState cameraState
    ) {
        HighwayExitDistanceInfoNameBlockEntity ett = state.blockEntity;
        Text tx = ett.getCustomName();
        if (tx == null) {
            return;
        }
        int light = (ett.getWorld() != null) ?
                    getBlockBrightness(ett.getWorld(), ett.getPos()) :
                    15728880;
        BlockState st = ett.getCachedState();
        matrices.push();
        if (st.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) {
            setAngles(
                matrices,
                st.get(FACING).isWall() ? (8 - st.get(FACING).id) * 90f :
                (((8 - st.get(FACING).id) % 4) * 90f), st
            );
            BlockPos p = ett.getPos();
            World w = ett.getWorld();
            switch (st.get(FACING).id) {
                case 0: {
                    BlockState st1 = w.getBlockState(p.east());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoMiddleBlock) &&
                        (st1.get(FACING).id == 0 || st1.get(FACING).id == 4)) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    break;
                }
                case 1: {
                    BlockState st1 = w.getBlockState(p.south());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoMiddleBlock) &&
                        (st1.get(FACING).id == 1 || st1.get(FACING).id == 5)) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    break;
                }
                case 2: {
                    BlockState st1 = w.getBlockState(p.west());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoMiddleBlock) &&
                        (st1.get(FACING).id == 2 || st1.get(FACING).id == 4)) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    break;
                }
                case 3: {
                    BlockState st1 = w.getBlockState(p.north());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoMiddleBlock) &&
                        (st1.get(FACING).id == 3 || st1.get(FACING).id == 5)) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    break;
                }
                case 4: {
                    BlockState st1 = w.getBlockState(p.east());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoMiddleBlock) &&
                        (st1.get(FACING).id == 0 || st1.get(FACING).id == 4)) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    st1 = w.getBlockState(p.west());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoMiddleBlock) &&
                        (st1.get(FACING).id == 2 || st1.get(FACING).id == 4)) {
                        renderText(st, matrices, light, queue, tx, false);
                    }
                    break;
                }
                case 5: {
                    BlockState st1 = w.getBlockState(p.south());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoMiddleBlock) &&
                        (st1.get(FACING).id == 1 || st1.get(FACING).id == 5)) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    st1 = w.getBlockState(p.north());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoMiddleBlock) &&
                        (st1.get(FACING).id == 3 || st1.get(FACING).id == 5)) {
                        renderText(st, matrices, light, queue, tx, false);
                    }
                    break;
                }
                case 6: {
                    BlockState st1 = w.getBlockState(p.west());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoMiddleBlock) &&
                        st1.get(FACING).id == 6) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    break;
                }
                case 7: {
                    BlockState st1 = w.getBlockState(p.north());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoMiddleBlock) &&
                        st1.get(FACING).id == 7) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    break;
                }
                case 8: {
                    BlockState st1 = w.getBlockState(p.east());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoMiddleBlock) &&
                        st1.get(FACING).id == 8) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    break;
                }
                case 9: {
                    BlockState st1 = w.getBlockState(p.south());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoMiddleBlock) &&
                        st1.get(FACING).id == 9) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    break;
                }
            }
            matrices.pop();
            return;
        }
        if (st.getBlock() instanceof HighwayExitDistanceInfoMiddleBlock) {
            setAngles(
                matrices,
                st.get(FACING).isWall() ? (8 - st.get(FACING).id) * 90f :
                (((8 - st.get(FACING).id) % 4) * 90f), st
            );
            BlockPos p = ett.getPos();
            World w = ett.getWorld();
            switch (st.get(FACING).id) {
                case 0: {
                    BlockState st1 = w.getBlockState(p.west());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) &&
                        (st1.get(FACING).id == 0 || st1.get(FACING).id == 4)) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    break;
                }
                case 1: {
                    BlockState st1 = w.getBlockState(p.north());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) &&
                        (st1.get(FACING).id == 1 || st1.get(FACING).id == 5)) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    break;
                }
                case 2: {
                    BlockState st1 = w.getBlockState(p.east());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) &&
                        (st1.get(FACING).id == 2 || st1.get(FACING).id == 4)) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    break;
                }
                case 3: {
                    BlockState st1 = w.getBlockState(p.south());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) &&
                        (st1.get(FACING).id == 3 || st1.get(FACING).id == 5)) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    break;
                }
                case 4: {
                    BlockState st1 = w.getBlockState(p.west());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) &&
                        (st1.get(FACING).id == 0 || st1.get(FACING).id == 4)) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    st1 = w.getBlockState(p.east());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) &&
                        (st1.get(FACING).id == 2 || st1.get(FACING).id == 4)) {
                        renderText(st, matrices, light, queue, tx, false);
                    }
                    break;
                }
                case 5: {
                    BlockState st1 = w.getBlockState(p.north());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) &&
                        (st1.get(FACING).id == 1 || st1.get(FACING).id == 5)) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    st1 = w.getBlockState(p.south());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) &&
                        (st1.get(FACING).id == 3 || st1.get(FACING).id == 5)) {
                        renderText(st, matrices, light, queue, tx, false);
                    }
                    break;
                }
                case 6: {
                    BlockState st1 = w.getBlockState(p.east());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) &&
                        st1.get(FACING).id == 6) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    break;
                }
                case 7: {
                    BlockState st1 = w.getBlockState(p.south());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) &&
                        st1.get(FACING).id == 7) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    break;
                }
                case 8: {
                    BlockState st1 = w.getBlockState(p.west());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) &&
                        st1.get(FACING).id == 8) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    break;
                }
                case 9: {
                    BlockState st1 = w.getBlockState(p.north());
                    if ((st1.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) &&
                        st1.get(FACING).id == 9) {
                        renderText(st, matrices, light, queue, tx, true);
                    }
                    break;
                }
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
        float o = Float.NaN;
        if (st.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) {
            o = 13f;
        } else if (st.getBlock() instanceof HighwayExitDistanceInfoMiddleBlock) {
            o = -16f;
        }
        queue.submitText(
            matrices, (float)(-this.tr.getWidth(odt) / 2 + o), (float)j, odt,
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
        if (st.getBlock() instanceof HighwayExitDistanceInfoLeftBlock) {
            f = .046875f;
            matrices.translate(0f, .375f, 0f);
        } else if (st.getBlock() instanceof
                   HighwayExitDistanceInfoMiddleBlock) {
            f = .0234375f;
            matrices.translate(0f, -.4375f, 0f);
        }
        if (f > 0f) {
            matrices.translate(translation.x, translation.y, translation.z);
            matrices.scale(f, -f, f);
        }
    }
}
