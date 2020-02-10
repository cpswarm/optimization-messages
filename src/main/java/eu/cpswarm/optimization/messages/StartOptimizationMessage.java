/**
 * File: StartOptimizationMessage.java
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
import eu.cpswarm.optimization.parameters.ParameterOptimizationConfiguration;

public class StartOptimizationMessage extends Message {

	public static final String TYPE_NAME = "StartOptimization";

	@SerializedName("configuration")
	protected ParameterOptimizationConfiguration configuration;

	@SerializedName("SCID")
	protected String simulationConfigurationId;


	public StartOptimizationMessage(String optimizationId,
			ParameterOptimizationConfiguration configuration, String simulationConfigurationId) {
		super(TYPE_NAME, optimizationId);
		this.configuration = configuration;
		this.simulationConfigurationId = simulationConfigurationId;
	}

	public StartOptimizationMessage() {
		this(null, null, null);
	}

	public ParameterOptimizationConfiguration getConfiguration() {
		return configuration;
	}

	public String getSimulationConfigurationId() {
		return simulationConfigurationId;
	}
}
