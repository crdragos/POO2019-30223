package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {
	
	public Lizard(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName("Soparlita");
		this.setNrOfLegs(4);
		this.setLaysEggs(true);
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
