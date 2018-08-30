package eu.cpswarm.optimization.messages;

public class GetProgressMessage extends Message {
	public static final String TYPE_NAME = "GetProgress";
	
	public GetProgressMessage(String id) {
		super(TYPE_NAME, id);
	}
}
