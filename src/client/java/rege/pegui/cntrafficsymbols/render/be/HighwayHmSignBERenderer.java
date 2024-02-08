package rege.pegui.cntrafficsymbols.render.be;
import static rege.pegui.cntrafficsymbols.struct.DoubleFaceFacing.FACING;

import net.minecraft.block.BlockState;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.font.TextRenderer.TextLayerType;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import rege.pegui.cntrafficsymbols.be.HighwayHmSignBlockEntity;
@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class HighwayHmSignBERenderer
implements net.minecraft.client.render.block.entity.BlockEntityRenderer
<HighwayHmSignBlockEntity>{
	private static final Vec3d TEXT_OFFSET=new Vec3d(0,.25,.075);
	private final TextRenderer tr;
	public HighwayHmSignBERenderer(BlockEntityRendererFactory.Context ctx){
		tr=ctx.getTextRenderer();
	}
	@Override public void render(HighwayHmSignBlockEntity ett,float tickDelta,
	MatrixStack matrices,VertexConsumerProvider vcs,int light,int overlay){
		Text tx=ett.getCustomName();
		if(tx==null)return;
		BlockState st=ett.getCachedState();
		matrices.push();
		setAngles(matrices,st.get(FACING).isWall()?(26-st.get(FACING).id)*90f:
		(((32-st.get(FACING).id)%16)*22.5f),st);
		renderText(ett.getPos(),tx,matrices,vcs,light,8,90,true);
		if(!st.get(FACING).isSingle())renderText(ett.getPos(),tx,matrices,vcs,light,8,90,false);
		matrices.pop();
	}
	void setAngles(MatrixStack matrices,float rotationDegrees,BlockState st){
		matrices.translate(.5f,.375f,.5f);
		matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(rotationDegrees));
		if(st.get(FACING).isWall())matrices.translate(0f,-.3125f,-.4375f);
	}
	void renderText(BlockPos pos,Text tx,MatrixStack matrices,
	VertexConsumerProvider vcs,int light,int lineHeight,int lineWidth,boolean front){
		matrices.push();
		this.setTextAngles(matrices,front,TEXT_OFFSET);
		int i=16777215;
		int j=4*lineHeight/2;
		int k;
		int l;
		k=i;
		l=light;
		OrderedText odt=tx.asOrderedText();
		tr.draw(odt,(float)(-tr.getWidth(odt)/2),(float)j,k,false,matrices.peek().getPositionMatrix(),vcs,TextLayerType.POLYGON_OFFSET,0,l);
		matrices.pop();
	}

	private void setTextAngles(MatrixStack matrices,boolean front,Vec3d translation){
		if(!front)matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180f));
		float f=0.0078125F;
		matrices.translate(translation.x,translation.y,translation.z);
		matrices.scale(f,-f,f);
	}
}
