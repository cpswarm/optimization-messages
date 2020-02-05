/**
 * File: RunSimulationMessage.java
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
import eu.cpswarm.optimization.parameters.ParameterSet;

public class RunSimulationMessage extends Message {

	public static final String TYPE_NAME = "RunSimulation";

	@SerializedName("SID")
	protected String simulationId;

	@SerializedName("simulationSeed")
	protected long simulationSeed;

	@SerializedName("parameterSet")
	protected ParameterSet parameterSet;

	public RunSimulationMessage(String optimizationId, String simulationId, long simulationSeed,  ParameterSet parameterSet) {
		super(TYPE_NAME, optimizationId);
		this.simulationId = simulationId;
		this.simulationSeed = simulationSeed;
		this.parameterSet = parameterSet;
	}

	public RunSimulationMessage() {
		this(null, null, 0, null);
	}

	public String getSimulationId() {
		return simulationId;
	}

	/**
	 * @return the simulationSeed
	 */
	public long getSimulationSeed() {
	  return simulationSeed;
	}

	public ParameterSet getParameterSet() {
		return parameterSet;
	}
}
