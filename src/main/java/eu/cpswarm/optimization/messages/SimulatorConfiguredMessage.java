package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public class SimulatorConfiguredMessage extends ReplyMessage {

	public static final String TYPE_NAME = "SimulationConfigured";

	@SerializedName("SID")
	protected String sid;
	
	public SimulatorConfiguredMessage(String id, String description, Status operationStatus) {
		super(TYPE_NAME, id, description, operationStatus);
	}
}
