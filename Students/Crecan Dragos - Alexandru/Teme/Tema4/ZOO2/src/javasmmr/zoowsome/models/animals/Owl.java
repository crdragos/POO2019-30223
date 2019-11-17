package javasmmr.zoowsome.models.animals;

public class Owl extends Bird {
	
	public Owl(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName("Buha");
		this.setMigrates(false);
		this.setNrOfLegs(2);
		this.setAvgFlightAltitude(15);
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
