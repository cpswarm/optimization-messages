/**
 * File: StatusSerializer.java
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;

public class StatusSerializer {

  protected Gson gson;


  public StatusSerializer() {
    RuntimeTypeAdapterFactory<BaseStatus> typeFactory =
        RuntimeTypeAdapterFactory.of(BaseStatus.class)
            .registerSubtype(OptimizationToolStatus.class, OptimizationToolStatus.TYPE_NAME)
            .registerSubtype(SimulationManagerStatus.class, SimulationManagerStatus.TYPE_NAME)
            .registerSubtype(SOOStatus.class, SOOStatus.TYPE_NAME);

    gson = new GsonBuilder().registerTypeAdapterFactory(typeFactory).create();
  }

  @SuppressWarnings("unchecked")
  public <T extends BaseStatus> T fromJson(String json) {
    return (T) gson.fromJson(json, BaseStatus.class);
  }

  public String toJson(BaseStatus o) {
    return gson.toJson(o);
  }
}
