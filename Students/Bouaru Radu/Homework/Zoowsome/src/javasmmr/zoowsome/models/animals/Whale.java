package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic{

	public Whale(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType water) {
		super(nrOfLegs, name, avgSwimDepth, water);
	}
	public Whale()
	{
		super(0, "Spermie", 5000, waterType.saltwater);
	}

}
