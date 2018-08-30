package eu.cpswarm.optimization.messages;

public class CancelSimulationMessage extends Message {
	public static final String TYPE_NAME = "CancelSimulation";
	
	public CancelSimulationMessage(String id) {
		super(TYPE_NAME, id);
	}
}
