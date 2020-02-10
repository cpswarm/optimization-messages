/**
 * File: Candidate.java
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

package eu.cpswarm.optimization.parameters;

import com.google.gson.annotations.SerializedName;

public class Candidate {

  @SerializedName("values")
  protected int[] values;

  @SerializedName("fitness")
  protected double fitness;


  /**
   * Creates a new {@code Candidate} instance using the speicifed parameters.
   * 
   * @param values  the values
   * @param fitness the fitness
   */
  public Candidate(int[] values, double fitness) {
    this.values = values;
    this.fitness = fitness;
  }

  /**
   * Creates a new {@code Candidate} instance.
   */
  public Candidate() {
    this(null, -1);
  }

  /**
   * @return the values
   */
  public int[] getValues() {
    return values;
  }

  /**
   * @return the fitness
   */
  public double getFitness() {
    return fitness;
  }
}
