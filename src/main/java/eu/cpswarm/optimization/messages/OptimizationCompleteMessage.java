package eu.cpswarm.optimization.messages;

public class OptimizationCompleteMessage extends OptimizationReplyMessage {
	protected double fitnessValue;
	
	public OptimizationCompleteMessage() {
		super();
		super.setType("OptimizationComplete");
	}
	
	public double getFitnessValue() {
		return fitnessValue;
	}

	public void setFitnessValue(double fitnessValue) {
		this.fitnessValue = fitnessValue;
	}
}
