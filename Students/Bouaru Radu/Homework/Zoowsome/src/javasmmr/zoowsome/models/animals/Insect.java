package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;

	public Insect(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}

	public boolean isFlying() {
		return this.canFly;
	}

	public void setFlying(boolean newFlightState) {
		this.canFly = newFlightState;
	}

	public boolean isDangerous() {
		return this.isDangerous;
	}

	public void setDangerLevel(boolean DangerState) {
		this.isDangerous = DangerState;
	}

}
