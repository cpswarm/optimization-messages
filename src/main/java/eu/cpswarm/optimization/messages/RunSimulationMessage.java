/**
 * File: RunSimulationMessage.java
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

public class RunSimulationMessage extends Message {

	public static final String TYPE_NAME = "RunSimulation";

	@SerializedName("SID")
	protected String sid;

	@SerializedName("configuration")
	protected String configuration;

	@SerializedName("ParameterSet")
	protected ParameterSet parameterSet;


	public RunSimulationMessage(String id, String description, String sid, String configuration,
			ParameterSet parameterSet) {
		super(TYPE_NAME, id, description);
		this.sid = sid;
		this.configuration = configuration;
		this.parameterSet = parameterSet;
	}

	public RunSimulationMessage() {
		this(null, null, null, null, null);
	}

	public String getSid() {
		return sid;
	}

	public String getConfiguration() {
		return configuration;
	}

	public ParameterSet getParameterSet() {
		return parameterSet;
	}
}
