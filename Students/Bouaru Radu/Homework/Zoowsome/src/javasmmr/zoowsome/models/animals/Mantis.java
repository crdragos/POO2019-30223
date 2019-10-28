package javasmmr.zoowsome.models.animals;

public class Mantis extends Insect{

	public Mantis(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name, canFly, isDangerous);
	}
	public Mantis()
	{
		super(4, "Shredder", true, false);
	}

}
