package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public abstract class OptimizationReplyMessage extends Message {

	public enum Status {
		@SerializedName("0")
		OK, 
		@SerializedName("1")
		ERROR
	}

	@SerializedName("status")
	protected Status operationStatus;

	public OptimizationReplyMessage(String type, String id, Status operationStatus) {
		super(type, id);
		this.operationStatus = operationStatus;
	}

	public Status getOperationStatus() {
		return operationStatus;
	}
}
