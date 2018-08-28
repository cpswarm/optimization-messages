package eu.cpswarm.optimization.messages;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class StartOptimizationMessage extends Message{

	protected int threads;

	protected boolean gui;

	protected String params;

	@SerializedName("SimulationManagers")
	protected ArrayList<String> simulationManagers;

	public int getThreads() {
		return threads;
	}

	public void setThreads(int threads) {
		this.threads = threads;
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

	public ArrayList<String> getSimulationManagers() {
		return simulationManagers;
	}

	public void setSimulationManagers(ArrayList<String> simulationManagers) {
		this.simulationManagers = simulationManagers;
	}
}
