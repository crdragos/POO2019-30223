package javasmmr.zoowsome.models.animals;

public class Spiderman extends Insect {

	public Spiderman(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name, canFly, isDangerous);
	}

	public Spiderman() {
		super(2, "Tom Holland", true, true);
	}

}
