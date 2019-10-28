package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	public boolean laysEggs;

	public Reptile(Integer nrOfLegs, String name, boolean laysEggs) {
		super(nrOfLegs, name);
		this.laysEggs = laysEggs;
	}

	public boolean isLayingEggs() {
		return this.laysEggs;
	}

	public void setEggsLayed(boolean newLays) {
		this.laysEggs = newLays;
	}
}
