package rege.pegui.cntrafficsymbols.render.be;
import static rege.pegui.cntrafficsymbols.struct.Attachment3.ATTACHMENT;
import static rege.pegui.cntrafficsymbols.struct.DoubleFaceFacing.FACING;
import net.minecraft.block.BlockState;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import rege.pegui.cntrafficsymbols.be.HighwayHmSignBlockEntity;
@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class HighwayHmSignBERenderer
implements net.minecraft.client.render.block.entity.BlockEntityRenderer
<HighwayHmSignBlockEntity>{
	private static final Vec3d TEXT_OFFSET=new Vec3d(0,.171875,.075);
	public static final float UP_OFFSET=.375f;
	public static final float DOWN_OFFSET=-.375f;
	private final TextRenderer tr;
	public HighwayHmSignBERenderer(BlockEntityRendererFactory.Context ctx){
		tr=ctx.getTextRenderer();
	}
	@Override public void render(HighwayHmSignBlockEntity ett,float tickDelta,
	MatrixStack matrices,VertexConsumerProvider vcs,int light,int overlay){
		Text tx=ett.getCustomName();if(tx==null)return;
		BlockState st=ett.getCachedState();matrices.push();
		setAngles(matrices,st.get(FACING).isWall()?(26-st.get(FACING).id)*90f:
		(((32-st.get(FACING).id)%16)*22.5f),st);
		renderText(ett.getPos(),tx,matrices,vcs,light,8,90,true);
		if(!st.get(FACING).isSingle())renderText(ett.getPos(),tx,matrices,vcs,light,8,90,false);
		matrices.pop();
	}
	void setAngles(MatrixStack matrices,float rotationDegrees,BlockState st){
		matrices.translate(.5f,.375f,.5f);
		matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(rotationDegrees));
		if(st.get(FACING).isWall())matrices.translate(0f,0f,-.5f);
		switch(st.get(ATTACHMENT).id){
			case 1:matrices.translate(0f,DOWN_OFFSET,0f);break;
			case 2:matrices.translate(0f,UP_OFFSET,0f);break;
		}
	}
	void renderText(BlockPos pos,Text tx,MatrixStack matrices,
	VertexConsumerProvider vcs,int light,int lineHeight,int lineWidth,
	boolean front){
		matrices.push();setTextAngles(matrices,front,TEXT_OFFSET);
		int i=36912;int j=4*lineHeight/2;
		net.minecraft.text.OrderedText odt=tx.asOrderedText();
		tr.draw(odt,(float)(-tr.getWidth(odt)/2),(float)j,i,false,matrices.peek()
		.getPositionMatrix(),vcs,TextRenderer.TextLayerType.POLYGON_OFFSET,0,light);
		matrices.pop();
	}
	private void
	setTextAngles(MatrixStack matrices,boolean front,Vec3d translation){
		if(!front)matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180f));
		float f=.00390625f;
		matrices.translate(translation.x,translation.y,translation.z);
		matrices.scale(f,-f,f);
	}
}
