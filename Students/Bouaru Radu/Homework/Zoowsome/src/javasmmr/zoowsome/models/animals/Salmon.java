package javasmmr.zoowsome.models.animals;

public class Salmon extends Aquatic{

	public Salmon(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType water) {
		super(nrOfLegs, name, avgSwimDepth, water);
	}
	public Salmon()
	{
		super(0, "Bob", 37, waterType.freshwater);
	}

}
