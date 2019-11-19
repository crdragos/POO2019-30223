package javasmmr.zoowsome.models.animals;

public class Gryphon extends Bird{

	public Gryphon(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, migrates, avgFlightAltitude, maintenanceCost, dangerPerc);
	}
	public Gryphon()
	{
		super(2, "Falstad", true, 5000, 8, 0.75);
	}

}
