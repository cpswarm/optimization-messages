package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public class OptimizationStatusMessage extends Message {
	public static final String TYPE_NAME = "OptimizationStatus";

	public enum Status {
		@SerializedName("ErrorBadConfiguration")
		ERROR_BAD_CONFIGURATION,
		@SerializedName("Started")
		STARTED,
		@SerializedName("Running")
		RUNNING,
		@SerializedName("ErrorOptimizationFailed")
		ERROR_OPTIMIZAZION_FAILED,
		@SerializedName("Cancelled")
		CANCELLED,
		@SerializedName("Completed")
		COMPLETED
	}
	
	@SerializedName("status")
	protected Status operationStatus;

	@SerializedName("progress")
	protected double progress;
	@SerializedName("bestFitnessValue")
	protected double bestFitnessValue;
	@SerializedName("bestController")
	protected String bestController;
	
	public OptimizationStatusMessage(String oid, double progress, Status operationStatus, double bestFitnessValue, String bestController) {
		super(TYPE_NAME, oid);
		this.progress = progress;
		this.operationStatus = operationStatus;
		this.bestFitnessValue = bestFitnessValue;
		this.bestController = bestController;
	}
	
	public OptimizationStatusMessage() {
		this.type = TYPE_NAME;
	}
	
	public Status getOperationStatus() {
		return operationStatus;
	}
	
	public double getProgress() {
		return progress;
	}
	
	public double getBestFitnessValue() {
		return bestFitnessValue;
	}
	
	public String getBestController() {
		return bestController;
	}
}