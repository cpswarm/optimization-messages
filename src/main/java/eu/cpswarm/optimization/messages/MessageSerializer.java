/**
 * File: MessageSerializer.java
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;

public class MessageSerializer {

  protected Gson gson;


  public MessageSerializer() {
    RuntimeTypeAdapterFactory<Message> typeFactory = RuntimeTypeAdapterFactory.of(Message.class)
        .registerSubtype(CancelOptimizationMessage.class, CancelOptimizationMessage.TYPE_NAME)
        .registerSubtype(GetOptimizationStatusMessage.class, GetOptimizationStatusMessage.TYPE_NAME)
        .registerSubtype(OptimizationStatusMessage.class, OptimizationStatusMessage.TYPE_NAME)
        .registerSubtype(RunSimulationMessage.class, RunSimulationMessage.TYPE_NAME)
        .registerSubtype(SimulationResultMessage.class, SimulationResultMessage.TYPE_NAME)
        .registerSubtype(SimulatorConfiguredMessage.class, SimulatorConfiguredMessage.TYPE_NAME)
        .registerSubtype(StartOptimizationMessage.class, StartOptimizationMessage.TYPE_NAME);

    gson = new GsonBuilder().registerTypeAdapterFactory(typeFactory).create();
  }

  @SuppressWarnings("unchecked")
  public <T extends Message> T fromJson(String json) {
    return (T) gson.fromJson(json, Message.class);
  }

  public String toJson(Message message) {
    return gson.toJson(message);
  }
}
