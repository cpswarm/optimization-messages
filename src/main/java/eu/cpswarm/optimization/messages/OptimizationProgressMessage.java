package eu.cpswarm.optimization.messages;

public class OptimizationProgressMessage extends OptimizationReplyMessage {
	protected double progress;
	protected double fitnessValue;
	protected String uom;
}
