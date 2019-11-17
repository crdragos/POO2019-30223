package javasmmr.zoowsome.models.animals;

public class Hawk extends Bird {
	
	public Hawk(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName("soimulPacii");
		this.setAvgFlightAltitude(100);
		this.setMigrates(true);
		this.setNrOfLegs(2);
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
