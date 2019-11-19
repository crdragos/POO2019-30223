package javasmmr.zoowsome.models.animals;

public class Peacock extends Bird{

	public Peacock(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, migrates, avgFlightAltitude, maintenanceCost, dangerPerc);
	}
	public Peacock()
	{
		super(2, "Blanche", false, 2, 3, 0.1);
	}

}
