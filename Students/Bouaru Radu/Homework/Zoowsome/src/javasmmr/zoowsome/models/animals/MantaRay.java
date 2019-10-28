package javasmmr.zoowsome.models.animals;

public class MantaRay extends Aquatic{

	public MantaRay(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType water) {
		super(nrOfLegs, name, avgSwimDepth, water);
	}
	public MantaRay()
	{
		super(0, "Devil's Fish", 500, waterType.saltwater);
	}

}
