package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	
	public Shark(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName("mareleAlb");
		this.setAvgSwimDepth(80);
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
