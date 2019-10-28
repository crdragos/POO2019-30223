package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {

	private Integer avgSwimDepth;

	public enum waterType {
		saltwater, freshwater
	};

	private waterType swimmingWater;

	public Aquatic(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType water) {
		super(nrOfLegs, name);
		this.avgSwimDepth = avgSwimDepth;
		this.swimmingWater = water;
	}

	public Integer getAverageSwimDepth() {
		return this.avgSwimDepth;
	}

	public void setAverageSwimDepth(Integer newAverageSwimDepth) {
		this.avgSwimDepth = newAverageSwimDepth;
	}

	public waterType getWaterType() {
		return this.swimmingWater;
	}

	public void setWaterType(waterType newWaterType) {
		this.swimmingWater = newWaterType;
	}

}
