/**
 * File: Parameter.java
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

public abstract class Parameter extends Base {

    public static final String TYPE_NAME = "Parameter";

    @SerializedName("name")
    protected String name;

    @SerializedName("meta")
    protected String meta;

    @SerializedName("value")
    protected float value;

  
    /**
     * Creates a new {@code Parameter} instance using the speicifed parameters.
     * 
     * @param name the name of the parameter
     * @param meta the meta information
     * @param value the value of the parameter
     */
    public Parameter(String name, String meta, float value) {
        super(TYPE_NAME);
        this.name = name;
        this.meta = meta;
        this.value = value;
    }

    /**
     * Creates a new {@code Parameter} instance.
     */
    public Parameter() {
        this(null, null, 0);
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
     * Gets the value.
     * 
     * @return the value
     */
    public float getValue() {
        return value;
    }
}
