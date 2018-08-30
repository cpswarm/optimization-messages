package eu.cpswarm.optimization.messages;

public class OptimizationStartedMessage extends OptimizationReplyMessage {
	public static final String TYPE_NAME = "OptimizationStarted";

	public OptimizationStartedMessage(String id, OptimizationReplyMessage.Status operationStatus) {
		super(TYPE_NAME, id, operationStatus);
	}
}
