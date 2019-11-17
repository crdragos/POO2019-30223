package javasmmr.zoowsome.models.animals;

public class Cancer extends Aquatic {
	
	public Cancer(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setWaterType(getWaterType());
		this.setName("nimeniNuScapa");
		this.setAvgSwimDepth(50);
		this.setNrOfLegs(10);
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
