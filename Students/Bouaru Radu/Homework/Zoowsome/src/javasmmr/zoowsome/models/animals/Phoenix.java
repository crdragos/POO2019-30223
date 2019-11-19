package javasmmr.zoowsome.models.animals;

public class Phoenix extends Bird{

	public Phoenix(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, migrates, avgFlightAltitude, maintenanceCost, dangerPerc);
	}
	public Phoenix()
	{
		super(2,"Helios", true, 5000, 8, 0.99);
	}

}
