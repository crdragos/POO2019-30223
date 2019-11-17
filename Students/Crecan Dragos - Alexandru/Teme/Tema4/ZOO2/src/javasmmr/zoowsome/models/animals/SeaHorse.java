package javasmmr.zoowsome.models.animals;

public class SeaHorse extends Aquatic {
	
	public SeaHorse(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName("Caltu");
		this.setAvgSwimDepth(50);
		this.setNrOfLegs(0);
		this.setWaterType(getWaterType());
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
