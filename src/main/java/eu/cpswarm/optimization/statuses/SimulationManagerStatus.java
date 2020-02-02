/**
 * File: SimulationManagerStatus.java
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

public class SimulationManagerStatus extends BaseStatus implements Comparable<SimulationManagerStatus> {

  public static final String TYPE_NAME = "SimulationManager";

  @SerializedName("SCID")
  protected String simulationConfigurationId;

  @SerializedName("SID")
  protected String simulationId;

  @SerializedName("capabilities")
  protected SimulationManagerCapabilities capabilities;


  public SimulationManagerStatus(String simulationConfigurationId, String simulationId,
      SimulationManagerCapabilities capabilities) {
    super(TYPE_NAME);
  }

  public SimulationManagerStatus() {
    this(null, null, null);
  }

  /**
   * @return the simulationConfigurationId
   */
  public String getSimulationConfigurationId() {
    return simulationConfigurationId;
  }

  /**
   * @return the simulationId
   */
  public String getSimulationId() {
    return simulationId;
  }

  /**
   * @return the capabilities
   */
  public SimulationManagerCapabilities getCapabilities() {
    return capabilities;
  }

  @Override
  public int compareTo(SimulationManagerStatus simulationManagerStatusToCompare) {
	  if(this.getSimulationConfigurationId()!=simulationManagerStatusToCompare.getSimulationConfigurationId()) {
		  return -1;
	  } else {
		  return this.getCapabilities().compareTo(simulationManagerStatusToCompare.getCapabilities());
	  }  
  }
}
