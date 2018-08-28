package eu.cpswarm.optimization.messages;

public class OptimizationProgressMessage extends OptimizationReplyMessage {
	protected double progress;
	protected double fitnessValue;
	protected String uom;
	
	public double getProgress() {
		return progress;
	}
	
	public void setProgress(double progress) {
		this.progress = progress;
	}
	
	public double getFitnessValue() {
		return fitnessValue;
	}
	
	public void setFitnessValue(double fitnessValue) {
		this.fitnessValue = fitnessValue;
	}
	
	public String getUom() {
		return uom;
	}
	
	public void setUom(String uom) {
		this.uom = uom;
	}
	
	
}
