package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public abstract class Message {

	@SerializedName("OID")
	protected String oid;

	@SerializedName("type")
	protected String type;


	protected Message(String type, String oid) {
		this.type = type;
		this.oid = oid;
	}

	public String getOId() {
		return oid;
	}

	public String getType() {
		return type;
	}
}
