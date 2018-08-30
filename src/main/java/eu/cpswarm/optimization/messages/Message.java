package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public abstract class Message {

	@SerializedName("ID")
	protected String id;

	@SerializedName("type")
	protected String type;

	protected Message(String type, String id) {
		this.type = type;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}
}
