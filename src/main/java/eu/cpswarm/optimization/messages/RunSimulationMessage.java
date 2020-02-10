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

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import eu.cpswarm.optimization.parameters.Parameter;;

public class RunSimulationMessage extends Message {

	public static final String TYPE_NAME = "RunSimulation";

	@SerializedName("SID")
	protected String simulationId;

	@SerializedName("simulationSeed")
	protected long simulationSeed;

	@SerializedName("parameters")
	protected List<Parameter> parameters;


	public RunSimulationMessage(String optimizationId, String simulationId, long simulationSeed,
			List<Parameter> parameters) {
		super(TYPE_NAME, optimizationId);
		this.simulationId = simulationId;
		this.simulationSeed = simulationSeed;
		this.parameters = parameters;
	}

	public RunSimulationMessage() {
		this(null, null, 0, new ArrayList<>());
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

	/**
	 * Gets the parameters.
	 * 
	 * @return the parameters
	 */
	public List<Parameter> getParameters() {
		return parameters;
	}
}
