package eu.cpswarm.optimization.messages;

public class OptimizationCompleteMessage extends OptimizationReplyMessage {
	public static final String TYPE_NAME = "OptimizationComplete";

	protected double fitnessValue;

	public OptimizationCompleteMessage(String id, OptimizationReplyMessage.Status operationStatus,
			double fitnessValue) {
		super(TYPE_NAME, id, operationStatus);
		this.fitnessValue = fitnessValue;
	}

	public double getFitnessValue() {
		return fitnessValue;
	}
}
