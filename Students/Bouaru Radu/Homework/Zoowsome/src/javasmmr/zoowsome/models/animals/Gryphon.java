package javasmmr.zoowsome.models.animals;

public class Gryphon extends Bird{

	public Gryphon(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name, migrates, avgFlightAltitude);
	}
	public Gryphon()
	{
		super(2, "Falstad", true, 5000);
	}

}
