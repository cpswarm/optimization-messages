package eu.cpswarm.optimization.messages;

public class OptimizationCompleteMessage extends OptimizationReplyMessage {
	public static final String TYPE_NAME = "OptimizationComplete";

	protected double fitnessValue;

	public OptimizationCompleteMessage(String id, String description, OptimizationReplyMessage.Status operationStatus,
			double fitnessValue) {
		super(TYPE_NAME, id, description, operationStatus);
		this.fitnessValue = fitnessValue;
	}

	public double getFitnessValue() {
		return fitnessValue;
	}
}
