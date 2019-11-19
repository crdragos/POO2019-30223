package javasmmr.zoowsome.models.animals;

public class Dinosaur extends Reptile {

	public Dinosaur(Integer nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, laysEggs, maintenanceCost, dangerPerc);
	}

	public Dinosaur() {
		super(2, "Tyrannosaurus Rex", true, 7.5, 0.99);
	}

}
