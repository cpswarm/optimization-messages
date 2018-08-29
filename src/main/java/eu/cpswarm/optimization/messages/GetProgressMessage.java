package eu.cpswarm.optimization.messages;

public class GetProgressMessage extends Message {
	public GetProgressMessage() {
		super();
		super.setType("GetProgress");
	}
}
