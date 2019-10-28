package javasmmr.zoowsome.models.animals;

public class Phoenix extends Bird{

	public Phoenix(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name, migrates, avgFlightAltitude);
	}
	public Phoenix()
	{
		super(2,"Helios", true, 5000);
	}

}
