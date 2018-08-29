package eu.cpswarm.optimization.messages;

public class OptimizationCancelledMessage extends OptimizationReplyMessage {
	public OptimizationCancelledMessage() {
		super();
		super.setType("OptimizationCancelled");
	}
}
