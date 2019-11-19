package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	public boolean laysEggs;

	public Reptile(Integer nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.laysEggs = laysEggs;
	}

	public boolean isLayingEggs() {
		return this.laysEggs;
	}

	public void setEggsLayed(boolean newLays) {
		this.laysEggs = newLays;
	}
}
