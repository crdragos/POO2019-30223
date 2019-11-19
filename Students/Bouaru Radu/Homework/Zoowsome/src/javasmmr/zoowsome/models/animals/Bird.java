package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {
	private boolean migrates;
	private Integer avgFlightAltitude;

	public Bird(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public boolean isMigrating() {
		return this.migrates;
	}

	public void setMigrating(boolean newMigratingState) {
		this.migrates = newMigratingState;
	}

	public Integer getAverageFlightAltitude() {
		return this.avgFlightAltitude;
	}

	public void setAverageFlightAltitude(Integer newAverageFlightAltitude) {
		this.avgFlightAltitude = newAverageFlightAltitude;
	}
}
