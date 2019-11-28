/**
 * File: ParameterSet.java
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

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public abstract class ParameterSet extends Base {

    public static final String TYPE_NAME = "ParameterSet";

    @SerializedName("parameters")
    protected List<Parameter> parameters;


    /**
     * Creates a new {@code ParameterSet} instance using the specified parameters.
     * 
     * @param parameters the parameters to use
     */
    public ParameterSet(List<Parameter> parameters) {
        super(TYPE_NAME);
        this.parameters = parameters;
    }

    /**
     * Creates a new {@code ParameterSet} instance.
     */
    public ParameterSet() {
        this(new ArrayList<>());
    }

    /**
     * Gets the parameters.
     * 
     * @return the parameters
     */
    public List<Parameter> getParameters() {
        return parameters;
    }
}
