package eu.cpswarm.optimization.messages;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;

public class MessageSerializer {

	protected Gson gson;
	
	public MessageSerializer() {

		RuntimeTypeAdapterFactory<Message> typeFactory = RuntimeTypeAdapterFactory.of(Message.class, "type")
				.registerSubtype(StartOptimizationMessage.class, "StartOptimization")
				.registerSubtype(GetProgressMessage.class, "GetProgress")
				.registerSubtype(CancelSimulationMessage.class, "CancelSimulation")
				.registerSubtype(SimulationResultMessage.class, "SimulationResult")
				.registerSubtype(OptimizationStartedMessage.class, "OptimizationStarted")
				.registerSubtype(OptimizationCancelledMessage.class, "OptimizationCancelled")
				.registerSubtype(OptimizationProgressMessage.class, "OptimizationProgress")
				.registerSubtype(OptimizationCompleteMessage.class, "OptimizationComplete")
				.registerSubtype(OptimizationReplyMessage.class, "OptimizationReply")
				.registerSubtype(RunSimulationMessage.class, "RunSimulation");

		gson = new GsonBuilder().registerTypeAdapterFactory(typeFactory).create();
	}
	
	public <T extends Message> T fromJson(String json) {
		return (T) gson.fromJson(json, Message.class);
	}
	
	public String toString(Message message) {
		return gson.toJson(message);
	}
}