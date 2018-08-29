package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public class Message {
	@SerializedName("ID")
	protected String id;
	
	@SerializedName("type")
	private String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
