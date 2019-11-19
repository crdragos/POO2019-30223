package javasmmr.zoowsome.models.animals;

public class Wasp extends Insect{

	public Wasp(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, canFly, isDangerous, maintenanceCost, dangerPerc);
	}
	public Wasp()
	{
		super(6, "Devil", true, true, 0, 0.1);
	}
}
