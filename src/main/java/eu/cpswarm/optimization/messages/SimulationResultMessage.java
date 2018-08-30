package eu.cpswarm.optimization.messages;

public class SimulationResultMessage extends SimulationMessage {
	public static final String TYPE_NAME = "SimulationResult";

	protected double fitnessValue;

	public SimulationResultMessage(String id, String sid, double fitnessValue) {
		super(TYPE_NAME, id, sid);
		this.fitnessValue = fitnessValue;
	}

	public double getFitnessValue() {
		return fitnessValue;
	}
}
