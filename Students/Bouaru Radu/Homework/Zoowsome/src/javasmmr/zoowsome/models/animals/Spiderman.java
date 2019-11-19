package javasmmr.zoowsome.models.animals;

public class Spiderman extends Insect {

	public Spiderman(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, canFly, isDangerous, maintenanceCost, dangerPerc);
	}

	public Spiderman() {
		super(2, "Tom Holland", true, true, 0, 0);
	}

}
