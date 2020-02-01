/**
 * File: SimulationResultMessage.java
 * 
 * Copyright (C) 2020 CPSwarm Project
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

public class SimulationResultMessage extends ReplyMessage {

	public static final String TYPE_NAME = "SimulationResult";

	@SerializedName("SID")
	protected String simulationId;

	@SerializedName("fitnessValue")
	protected double fitnessValue;


	public SimulationResultMessage(String optimizationId, boolean success, String simulationId,
			double fitnessValue) {
		super(TYPE_NAME, optimizationId, success);
		this.simulationId = simulationId;
		this.fitnessValue = fitnessValue;
	}

	public SimulationResultMessage() {
		this(null, false, null, -1);
	}

	public String getSimulationId() {
		return simulationId;
	}

	public double getFitnessValue() {
		return fitnessValue;
	}
}
