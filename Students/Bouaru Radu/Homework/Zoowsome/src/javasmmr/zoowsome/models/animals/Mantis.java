package javasmmr.zoowsome.models.animals;

public class Mantis extends Insect{

	public Mantis(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, canFly, isDangerous, maintenanceCost, dangerPerc);
	}
	public Mantis()
	{
		super(4, "Shredder", true, false, 0.5, 0);
	}

}
