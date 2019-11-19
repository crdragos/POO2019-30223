package javasmmr.zoowsome.models.animals;

public class Salmon extends Aquatic{

	public Salmon(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType water, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, avgSwimDepth, water, maintenanceCost, dangerPerc);
	}
	public Salmon()
	{
		super(0, "Bob", 37, waterType.freshwater, 1, 0);
	}

}
