package javasmmr.zoowsome.models.animals;

enum Enum {
	saltWater,
	freshWater;
}

public abstract class Aquatic extends Animal {
	private Integer avgSwimDepth;
	private Enum waterType;
	
	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public void setWaterType(Enum waterType) {
		this.waterType = waterType;
	}
	
	public Integer getAvgSwimDepth() {
		return this.avgSwimDepth;
	}
	
	public Enum getWaterType() {
		return this.waterType;
	}
	
}
