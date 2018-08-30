package eu.cpswarm.optimization.messages;

public class RunSimulationMessage extends SimulationMessage {
	public static final String TYPE_NAME = "RunSimulation";

	protected boolean gui;

	protected String params;

	public RunSimulationMessage(String id, String sid, boolean gui, String params) {
		super(TYPE_NAME, id, sid);
		this.gui = gui;
		this.params = params;
	}

	public boolean isGui() {
		return gui;
	}

	public String getParams() {
		return params;
	}
}
