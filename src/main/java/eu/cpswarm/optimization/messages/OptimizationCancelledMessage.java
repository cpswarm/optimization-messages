package eu.cpswarm.optimization.messages;

public class OptimizationCancelledMessage extends OptimizationReplyMessage {
	public static final String TYPE_NAME = "OptimizationCancelled";

	public OptimizationCancelledMessage(String id, OptimizationReplyMessage.Status operationStatus) {
		super(TYPE_NAME, id, operationStatus);
	}
}
