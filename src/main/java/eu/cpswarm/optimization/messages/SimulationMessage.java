package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public class SimulationMessage extends Message {
	@SerializedName("SID")
	protected String sid;
}
