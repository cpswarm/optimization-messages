/**
 * File: ParameterDefinition.java
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

public class ParameterDefinition {

  @SerializedName("name")
  protected String name;

  @SerializedName("meta")
  protected String meta;

  @SerializedName("minimum")
  protected int minimum;

  @SerializedName("maximum")
  protected int maximum;

  @SerializedName("scale")
  protected float scale;


  /**
   * Creates a new {@code ParameterDefinition} instance using the speicifed parameters.
   * 
   * @param name  the name of the parameter
   * @param meta  the meta information
   * @param value the value of the parameter
   */
  public ParameterDefinition(String name, String meta, int minimum, int maximum, float scale) {
    this.name = name;
    this.meta = meta;
    this.minimum = minimum;
    this.maximum = maximum;
    this.scale = scale;
  }

  /**
   * Creates a new {@code ParameterDefinition} instance.
   */
  public ParameterDefinition() {
    this(null, null, 0, 0, 0);
  }

  /**
   * Gets the name.
   * 
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the meta information.
   * 
   * @return the meta information
   */
  public String getMeta() {
    return meta;
  }

  /**
   * @return the minimum
   */
  public int getMinimum() {
    return minimum;
  }

  /**
   * @return the maximum
   */
  public int getMaximum() {
    return maximum;
  }

  /**
   * @return the scale
   */
  public float getScale() {
    return scale;
  }
}
