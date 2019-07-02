package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public class RunSimulationMessage extends Message {
	public static final String TYPE_NAME = "RunSimulation";

	@SerializedName("SID")
	protected String sid;
	@SerializedName("configuration")
	protected String configuration;
	@SerializedName("candidate")
	protected String candidate;
	@SerializedName("candidateType")
	protected String candidateType;

	public RunSimulationMessage(String id, String description, String sid, String configuration, String candidate, String candidateType) {
		super(TYPE_NAME, id);
		this.sid = sid;
		this.configuration = configuration;
		this.candidate = candidate;
		this.candidateType = candidateType;
	}

	public String getSid() {
		return sid;
	}

	public String getConfiguration() {
		return configuration;
	}

	public String getCandidate() {
		return candidate;
	}
	
	public String getCandidateType() {
		return candidateType;
	}
}
