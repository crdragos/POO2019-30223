package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic{

	public Whale(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType water, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, avgSwimDepth, water, maintenanceCost, dangerPerc);
	}
	public Whale()
	{
		super(0, "Spermie", 5000, waterType.saltwater, 7, 0.5);
	}

}
