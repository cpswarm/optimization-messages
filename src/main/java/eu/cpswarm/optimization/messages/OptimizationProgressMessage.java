/**
 * File: OptimizationProgressMessage.java
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

public class OptimizationProgressMessage extends ReplyMessage {

	public static final String TYPE_NAME = "OptimizationProgress";

	@SerializedName("progress")
	protected double progress;

	@SerializedName("fitnessValue")
	protected double fitnessValue;

	@SerializedName("ParameterSet")
	protected ParameterSet parameterSet;


	public OptimizationProgressMessage(String id, String description,
			ReplyMessage.Status operationStatus, double progress, double fitnessValue,
			ParameterSet parameterSet) {
		super(TYPE_NAME, id, description, operationStatus);
		this.progress = progress;
		this.fitnessValue = fitnessValue;
		this.parameterSet = parameterSet;
	}

	public double getProgress() {
		return progress;
	}

	public double getFitnessValue() {
		return fitnessValue;
	}

	public ParameterSet getParameterSet() {
		return parameterSet;
	}
}