package eu.cpswarm.optimization.messages;

public class CancelOptimizationMessage extends Message {
	public static final String TYPE_NAME = "CancelOptimization";
	
	public CancelOptimizationMessage(String id) {
		super(TYPE_NAME, id);
	}
}
