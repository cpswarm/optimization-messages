package eu.cpswarm.optimization.messages;

public class RunSimulationMessage extends SimulationMessage {
	protected boolean gui;

	protected String params;
	
	public RunSimulationMessage() {
		super();
		super.setType("RunSimulation");
	}

	public boolean isGui() {
		return gui;
	}

	public void setGui(boolean gui) {
		this.gui = gui;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}
}
