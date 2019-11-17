package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	
	public Spider(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName("Paianjen");
		this.setNrOfLegs(8);
		this.setCanFly(false);
		this.setIsDangerous(true);
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
