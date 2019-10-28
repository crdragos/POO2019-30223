package javasmmr.zoowsome.models.animals;

public class Peacock extends Bird{

	public Peacock(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name, migrates, avgFlightAltitude);
	}
	public Peacock()
	{
		super(2, "Blanche", false, 2);
	}

}
