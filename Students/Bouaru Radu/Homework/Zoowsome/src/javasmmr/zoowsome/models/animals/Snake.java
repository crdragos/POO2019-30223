package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {

	public Snake(Integer nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, laysEggs, maintenanceCost, dangerPerc);
	}

	public Snake() {
		super(0, "Snek", true, 4, 0.75);
	}

}
