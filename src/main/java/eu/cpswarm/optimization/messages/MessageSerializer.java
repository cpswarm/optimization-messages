package eu.cpswarm.optimization.messages;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;

public class MessageSerializer {

	protected Gson gson;

	public MessageSerializer() {

		RuntimeTypeAdapterFactory<Message> typeFactory = RuntimeTypeAdapterFactory.of(Message.class)
				.registerSubtype(StartOptimizationMessage.class, CancelOptimizationMessage.TYPE_NAME)
				.registerSubtype(StartOptimizationMessage.class, GetOptimizationStateMessage.TYPE_NAME)
				.registerSubtype(StartOptimizationMessage.class, GetOptimizationStatusMessage.TYPE_NAME)
				.registerSubtype(StartOptimizationMessage.class, OptimizationStatusMessage.TYPE_NAME)
				.registerSubtype(StartOptimizationMessage.class, OptimizationToolConfiguredMessage.TYPE_NAME)
				.registerSubtype(RunSimulationMessage.class, RunSimulationMessage.TYPE_NAME)
				.registerSubtype(SimulationResultMessage.class, SimulationResultMessage.TYPE_NAME)
				.registerSubtype(SimulatorConfiguredMessage.class, SimulatorConfiguredMessage.TYPE_NAME)
				.registerSubtype(SimulatorConfiguredMessage.class, StartOptimizationMessage.TYPE_NAME);

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