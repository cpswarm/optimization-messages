package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public class Message {
	@SerializedName("ID")
	protected String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
