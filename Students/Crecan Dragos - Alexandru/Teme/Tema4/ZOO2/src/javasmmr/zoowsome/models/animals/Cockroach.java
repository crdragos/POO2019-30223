package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	
	public Cockroach(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName("Gandacel");
		this.setNrOfLegs(8);
		this.setCanFly(false);
		this.setIsDangerous(false);
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
