package javasmmr.zoowsome.models.animals;

public class Cancer extends Aquatic {
	
	public Cancer() {
		this.setName("nimeniNuScapa");
		this.setAvgSwimDepth(50);
		this.setNrOfLegs(10);
		super.setWaterType(getWaterType());
	}

}
