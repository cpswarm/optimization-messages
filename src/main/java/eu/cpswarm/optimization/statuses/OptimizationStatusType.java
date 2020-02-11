/**
 * File: OptimizationStatusType.java
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

public enum OptimizationStatusType {
  // No status, in reality should not occur
  @SerializedName("None")
  NONE,

  // task has started but no results available
  @SerializedName("Started")
  STARTED,

  // running for some time, with a progress
  @SerializedName("Running")
  RUNNING,

  // error occurs, optimization is not ongoing
  @SerializedName("ErrorOptimizationFailed")
  ERROR,

  // request from SOO to cancel it without error, stopped
  @SerializedName("Cancelled")
  CANCELLED,

  // completed
  @SerializedName("Complete")
  COMPLETE
}
