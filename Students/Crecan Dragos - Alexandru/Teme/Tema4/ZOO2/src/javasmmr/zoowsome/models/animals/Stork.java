package javasmmr.zoowsome.models.animals;

public class Stork extends Bird {
	
	public Stork(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName("nuVreauCopiiAcuma");
		this.setAvgFlightAltitude(100);
		this.setNrOfLegs(2);
		this.setMigrates(true);
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
