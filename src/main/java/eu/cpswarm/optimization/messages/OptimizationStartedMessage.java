package eu.cpswarm.optimization.messages;

public class OptimizationStartedMessage extends OptimizationReplyMessage {

	public OptimizationStartedMessage() {
		super();
		super.setType("OptimizationStarted");
	}
	
}
