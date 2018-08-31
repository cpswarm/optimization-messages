package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public class SimulationMessage extends Message {
	@SerializedName("SID")
	protected String sid;

	public SimulationMessage(String type, String id, String description, String sid) {
		super(type, id, description);
		this.sid = sid;
	}

	public String getSid() {
		return sid;
	}
}
