package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {

	private float normalBodyTemp;
	private float percBodyHair;

	public Mammal(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		super(nrOfLegs, name);
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair = percBodyHair;
	}

	public float getBodyTemperature() {
		return this.normalBodyTemp;
	}

	public void setBodyTemperature(float newBodyTemp) {
		this.normalBodyTemp = newBodyTemp;
	}

	public float getBodyHairPercent() {
		return this.percBodyHair;
	}

	public void setBodyHairPercent(float newBodyHairPerc) {
		this.normalBodyTemp = newBodyHairPerc;
	}
}
