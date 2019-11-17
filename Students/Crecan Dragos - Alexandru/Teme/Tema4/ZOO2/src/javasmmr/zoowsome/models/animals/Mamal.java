package javasmmr.zoowsome.models.animals;

public abstract class Mamal extends Animal {
	private float normalBodyTemp;
	private float percBodyHair;
	
	public Mamal(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	
	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}
	
	public void setPercBodyHair(float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}
	
	public float getNormalBodyTemp() {
		return this.normalBodyTemp;
	}
	
	public float getPercBodyHair() {
		return this.percBodyHair;
	}
	
}
