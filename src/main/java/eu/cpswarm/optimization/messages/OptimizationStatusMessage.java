/**
 * File: OptimizationStatusMessage.java
 * 
 * Copyright (C) 2019 CPSwarm Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public class OptimizationStatusMessage extends Message {

	public static final String TYPE_NAME = "OptimizationStatus";

	public enum Status {
		// No status, in reality should not occur
		@SerializedName("None")
		NONE,

		// OT receives a bad configuration for replying to
		// StartOptimization
		@SerializedName("ErrorBadConfiguration")
		ERROR_BAD_CONFIGURATION,

		// optimization is actived for replying to StartOptimization received in first time
		@SerializedName("Started")
		STARTED,

		// running for some time, with a progress
		@SerializedName("Running")
		RUNNING,

		// error occurs, optimization is not ongoing
		@SerializedName("ErrorOptimizationFailed")
		ERROR_OPTIMIZAZION_FAILED,

		// request from SOO to cancel it without error, stopped
		@SerializedName("Cancelled")
		CANCELLED,

		// completed
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


	public OptimizationStatusMessage(String oid, double progress, Status operationStatus,
			double bestFitnessValue, String bestController) {
		super(TYPE_NAME, oid);
		this.progress = progress;
		this.operationStatus = operationStatus;
		this.bestFitnessValue = bestFitnessValue;
		this.bestController = bestController;
	}

	public OptimizationStatusMessage() {
		this(null, -1, Status.NONE, -1, null);
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
