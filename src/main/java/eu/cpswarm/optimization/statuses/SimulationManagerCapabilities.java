/**
 * File: SimulationManagerCapabilities.java
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

public class SimulationManagerCapabilities implements Comparable<SimulationManagerCapabilities> {

  @SerializedName("dimensions")
  protected int dimensions;

  @SerializedName("maxAgents")
  protected int maxAgents;


  public SimulationManagerCapabilities(int dimensions, int maxAgents) {
    this.dimensions = dimensions;
    this.maxAgents = maxAgents;
  }

  public SimulationManagerCapabilities() {
    this(0, 0);
  }

  /**
   * @return the dimensions
   */
  public int getDimensions() {
    return dimensions;
  }

  /**
   * @return the maxAgents
   */
  public int getMaxAgents() {
    return maxAgents;
  }

  @Override
  public int compareTo(SimulationManagerCapabilities capabilitiesToCompare) {
    if ((this.getDimensions() == capabilitiesToCompare.getDimensions()
        || capabilitiesToCompare.getDimensions() == 1)
        && (this.getMaxAgents() == 0
            || this.getMaxAgents() >= capabilitiesToCompare.getMaxAgents())) {
      return 0;
    } else {
      return -1;
    }
  }
}
