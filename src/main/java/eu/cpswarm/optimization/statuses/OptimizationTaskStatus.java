/**
 * File: OptimizationTaskStatus.java
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

package eu.cpswarm.optimization.statuses;

import com.google.gson.annotations.SerializedName;

public class OptimizationTaskStatus {
  
    @SerializedName("OID")	
    protected String optimizationId;

    @SerializedName("status_type")
    protected OptimizationStatusType statusType;

    @SerializedName("best_fitness")	
    protected double bestFitness;

    @SerializedName("generation")	
    protected int generation;

    @SerializedName("max_generations")	
    protected int maximumGenerations;


    public OptimizationTaskStatus(String optimizationId, OptimizationStatusType statusType, double bestFitness, int generation, int maximumGenerations ) {
        this.optimizationId = optimizationId;
        this.statusType = statusType;
        this.bestFitness = bestFitness;
        this.generation = generation;
        this.maximumGenerations = maximumGenerations;
    }

    public OptimizationTaskStatus() {
        this(null, OptimizationStatusType.NONE, 0, 0, 0);
    }

    /**
     * @return the optimizationId
     */
    public String getOptimizationId() {
      return optimizationId;
    }

    /**
     * @return the statusType
     */
    public OptimizationStatusType getStatusType() {
      return statusType;
    }

    /**
     * @return the bestFitness
     */
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
}