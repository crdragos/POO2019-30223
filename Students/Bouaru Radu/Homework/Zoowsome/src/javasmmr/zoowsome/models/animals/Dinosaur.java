package javasmmr.zoowsome.models.animals;

public class Dinosaur extends Reptile {

	public Dinosaur(Integer nrOfLegs, String name, boolean laysEggs) {
		super(nrOfLegs, name, laysEggs);
	}

	public Dinosaur() {
		super(2, "Tyrannosaurus Rex", true);
	}

}
