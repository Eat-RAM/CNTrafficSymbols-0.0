package rege.pegui.cntrafficsymbols;
public class Main implements net.fabricmc.api.ModInitializer{
	public static final org.slf4j.Logger LOGGER=
	org.slf4j.LoggerFactory.getLogger("cntrafficsymbols");
	@Override public void onInitialize(){
		LOGGER.info("");
		SelfWork.doit();
	}
}