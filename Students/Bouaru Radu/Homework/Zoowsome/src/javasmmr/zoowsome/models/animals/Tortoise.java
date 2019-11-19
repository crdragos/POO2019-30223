package javasmmr.zoowsome.models.animals;

public class Tortoise extends Reptile {

	public Tortoise(Integer nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, laysEggs, maintenanceCost, dangerPerc);
	}

	public Tortoise() {
		super(4, "Galapagos", true, 4, 0);
	}

}
