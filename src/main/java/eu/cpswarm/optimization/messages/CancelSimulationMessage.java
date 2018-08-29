package eu.cpswarm.optimization.messages;

public class CancelSimulationMessage extends Message {
	public CancelSimulationMessage() {
		super();
		super.setType("CancelSimulation");
	}
}
