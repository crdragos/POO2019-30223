package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {
	
	public Turtle(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName("Broscuta Testoasa");
		this.setLaysEggs(true);
		this.setNrOfLegs(4);
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
