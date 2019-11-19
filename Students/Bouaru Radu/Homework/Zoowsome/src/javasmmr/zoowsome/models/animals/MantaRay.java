package javasmmr.zoowsome.models.animals;

public class MantaRay extends Aquatic{

	public MantaRay(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType water, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, avgSwimDepth, water, maintenanceCost, dangerPerc);
	}
	public MantaRay()
	{
		super(0, "Devil's Fish", 500, waterType.saltwater, 4, 0.6);
	}

}
