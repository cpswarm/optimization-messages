package eu.cpswarm.optimization.messages;

public class SimulationResultMessage extends SimulationMessage {
	protected double fitnessValue;

	public SimulationResultMessage() {
		super();
		super.setType("SimulationResult");
	}

	public double getFitnessValue() {
		return fitnessValue;
	}

	public void setFitnessValue(double fitnessValue) {
		this.fitnessValue = fitnessValue;
	}
}
