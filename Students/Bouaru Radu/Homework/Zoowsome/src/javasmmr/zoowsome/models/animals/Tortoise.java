package javasmmr.zoowsome.models.animals;

public class Tortoise extends Reptile {

	public Tortoise(Integer nrOfLegs, String name, boolean laysEggs) {
		super(nrOfLegs, name, laysEggs);
	}

	public Tortoise() {
		super(4, "Galapagos", true);
	}

}
