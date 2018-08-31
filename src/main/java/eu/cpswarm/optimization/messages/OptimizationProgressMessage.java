package eu.cpswarm.optimization.messages;

public class OptimizationProgressMessage extends OptimizationReplyMessage {
	public static final String TYPE_NAME = "OptimizationProgress";
	protected double progress;
	protected double fitnessValue;

	public OptimizationProgressMessage(String id, String description, OptimizationReplyMessage.Status operationStatus, double progress,
			double fitnessValue) {
		super(TYPE_NAME, id, description, operationStatus);
		this.progress = progress;
		this.fitnessValue = fitnessValue;
	}

	public double getProgress() {
		return progress;
	}

	public double getFitnessValue() {
		return fitnessValue;
	}
}
