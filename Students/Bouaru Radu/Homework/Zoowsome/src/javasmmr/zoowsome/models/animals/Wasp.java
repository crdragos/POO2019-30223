package javasmmr.zoowsome.models.animals;

public class Wasp extends Insect{

	public Wasp(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name, canFly, isDangerous);
	}
	public Wasp()
	{
		super(6, "Devil", true, true);
	}
}
