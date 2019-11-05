package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

	public Butterfly() {
		this.setCanFly(true);
		this.setIsDangerous(false);
		this.setName("Fluturel");
		this.setNrOfLegs(6);
	}
	
	public Butterfly(String name, Integer nrOfLegs, Boolean canFly, Boolean isDangerous) {
		super.setName(name);
		super.setNrOfLegs(nrOfLegs);
		super.setCanFly(canFly);
		super.setIsDangerous(isDangerous);
	}
	
}
