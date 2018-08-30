package eu.cpswarm.optimization.messages;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class StartOptimizationMessage extends Message {
	public static final String TYPE_NAME = "StartOptimization";

	protected int threads;

	protected boolean gui;

	protected String params;

	@SerializedName("SimulationManagers")
	protected List<String> simulationManagers;

	public StartOptimizationMessage(String id, int threads, boolean gui, String params,
			List<String> simulationManagers) {
		super(TYPE_NAME, id);
		this.threads = threads;
		this.gui = gui;
		this.params = params;
		this.simulationManagers = simulationManagers;
	}

	public int getThreads() {
		return threads;
	}

	public boolean isGui() {
		return gui;
	}

	public String getParams() {
		return params;
	}

	public List<String> getSimulationManagers() {
		return simulationManagers;
	}
}
