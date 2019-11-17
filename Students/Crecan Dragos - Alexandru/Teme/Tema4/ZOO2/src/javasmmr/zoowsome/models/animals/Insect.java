package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {
	private Boolean canFly;
	private Boolean isDangerous;
	
	public Insect(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	
	public void setCanFly(Boolean canFly) {
		this.canFly = canFly;
	}
	
	public void setIsDangerous(Boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	
	public Boolean getCanFly() {
		return this.canFly;
	}
	
	public Boolean getIsDangerous() {
		return this.isDangerous;
	}
	
}
