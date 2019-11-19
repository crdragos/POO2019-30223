package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal{
	
	public Cow(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc)
	{
		super(nrOfLegs, name, normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc);
	}
	public Cow()
	{
		super(4, "Florica", 38.0f, 90.0f, 3.5, 0.2);
	}
}
