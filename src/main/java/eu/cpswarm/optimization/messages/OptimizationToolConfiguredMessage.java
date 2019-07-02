package eu.cpswarm.optimization.messages;

public class OptimizationToolConfiguredMessage extends ReplyMessage {

	public static final String TYPE_NAME = "OptimizationToolConfigured";

	public OptimizationToolConfiguredMessage(String oid, Boolean success) {
		super(TYPE_NAME, oid, success);
	}
}