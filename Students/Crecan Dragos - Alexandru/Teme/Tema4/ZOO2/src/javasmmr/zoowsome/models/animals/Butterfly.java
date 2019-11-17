package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {

	public Butterfly(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setCanFly(true);
		this.setIsDangerous(false);
		this.setName("Fluturel");
		this.setNrOfLegs(6);
	}
	
	public boolean kill() {
		double randomNr = Math.random();
		if (randomNr < this.getDangerPerc()) {
			return true;
		} else {
			return false;
		}
	}
	
}
