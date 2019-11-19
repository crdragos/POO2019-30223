package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{
	
	public Tiger(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc)
	{
		super(nrOfLegs, name, normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc);
	}
	public Tiger()
	{
		super(4, "Florin", 38.0f, 97.0f, 6, 0.9);
	}

}
