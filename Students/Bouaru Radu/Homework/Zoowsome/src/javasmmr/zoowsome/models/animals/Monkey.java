package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	
	public Monkey(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc)
	{
		super(nrOfLegs, name, normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc);
	}
	public Monkey()
	{
		super(2, "KingKong", 38.0f, 95.0f, 5, 0.4);
	}
}
