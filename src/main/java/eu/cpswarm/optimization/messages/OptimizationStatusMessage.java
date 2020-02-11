/**
 * File: OptimizationStatusMessage.java
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

import java.util.List;
import com.google.gson.annotations.SerializedName;
import eu.cpswarm.optimization.parameters.Parameter;
import eu.cpswarm.optimization.parameters.ParameterOptimizationConfiguration;
import eu.cpswarm.optimization.statuses.OptimizationStatusType;

public class OptimizationStatusMessage extends Message {

  public static final String TYPE_NAME = "OptimizationStatus";

  @SerializedName("statusType")
  protected OptimizationStatusType statusType;

  @SerializedName("bestFitness")
  protected double bestFitness;

  @SerializedName("generation")
  protected int generation;

  @SerializedName("maxGenerations")
  protected int maximumGenerations;

  @SerializedName("bestParameters")
  protected List<Parameter> bestParameters;

  @SerializedName("configuration")
  protected ParameterOptimizationConfiguration configuration;


  public OptimizationStatusMessage(String optimizationId, OptimizationStatusType statusType,
      double bestFitness, int generation, int maximumGenerations, List<Parameter> bestParameters,
      ParameterOptimizationConfiguration configuration) {
    super(TYPE_NAME, optimizationId);

    this.statusType = statusType;
    this.bestFitness = bestFitness;
    this.generation = generation;
    this.maximumGenerations = maximumGenerations;
    this.bestParameters = bestParameters;
    this.configuration = configuration;
  }

  public OptimizationStatusMessage() {
    this(null, OptimizationStatusType.NONE, -1, 0, 0, null, null);
  }

  public OptimizationStatusType getStatusType() {
    return statusType;
  }

  public double getBestFitness() {
    return bestFitness;
  }

  /**
   * @return the generation
   */
  public int getGeneration() {
    return generation;
  }

  /**
   * @return the maximumGenerations
   */
  public int getMaximumGenerations() {
    return maximumGenerations;
  }

  public List<Parameter> getBestParameters() {
    return bestParameters;
  }

  /**
   * @return the configuration
   */
  public ParameterOptimizationConfiguration getConfiguration() {
    return configuration;
  }
}
