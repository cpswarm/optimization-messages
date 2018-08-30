package eu.cpswarm.optimization.messages;

public abstract class OptimizationReplyMessage extends Message {

	public enum Status {
		OK, ERROR
	}

	protected Status operationStatus;

	public OptimizationReplyMessage(String type, String id, Status operationStatus) {
		super(type, id);
	}

	public Status getOperationStatus() {
		return operationStatus;
	}
}
