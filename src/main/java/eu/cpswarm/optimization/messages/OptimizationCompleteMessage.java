package eu.cpswarm.optimization.messages;

public class OptimizationCompleteMessage extends OptimizationReplyMessage {
	protected double fitnessValue;

	public double getFitnessValue() {
		return fitnessValue;
	}

	public void setFitnessValue(double fitnessValue) {
		this.fitnessValue = fitnessValue;
	}
}
