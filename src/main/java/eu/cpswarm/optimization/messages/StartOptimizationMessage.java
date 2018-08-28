package eu.cpswarm.optimization.messages;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class StartOptimizationMessage extends Message{

	protected int threads;

	protected boolean gui;

	protected String params;

	@SerializedName("SimulationManagers")
	protected ArrayList<String> simulationManagers;
}
