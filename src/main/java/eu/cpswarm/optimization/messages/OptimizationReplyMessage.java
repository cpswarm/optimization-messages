package eu.cpswarm.optimization.messages;

public class OptimizationReplyMessage extends Message {
	protected String operationStatus;

	public String getOperationStatus() {
		return operationStatus;
	}

	public void setOperationStatus(String operationStatus) {
		this.operationStatus = operationStatus;
	}
}
