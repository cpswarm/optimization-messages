package eu.cpswarm.optimization.messages;

public class GetOptimizationStatusMessage extends Message {
	public static final String TYPE_NAME = "GetOptimizationStatus";

	public GetOptimizationStatusMessage(String oid) {
		super(TYPE_NAME, oid);
	}
}
