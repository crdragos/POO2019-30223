package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {
	private Boolean migrates;
	private Integer avgFlightAltitude;
	
	public void setMigrates(Boolean migrates) {
		this.migrates = migrates;
	}
	
	public void setAvgFlightAltitude(Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
	public Boolean getMigrates() {
		return this.migrates;
	}
	
	public Integer getAvgFlightAltitude() {
		return this.avgFlightAltitude;
	}
	
}
