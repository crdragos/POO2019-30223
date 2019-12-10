package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {

		String[] mammalNames = new String[] { "Mammal1", "Mammal2", "Mammal3", "Mammal4", "Mammal5", "Mammal6",
				"Mammal7", "Mammal8", "Mammal9", "Mammal10" };
		Random randomizer = new Random();
		int chooseName = randomizer.nextInt(mammalNames.length);
		float chooseBodyTemperature = 100 * randomizer.nextFloat();
		float chooseBodyHairPercent = 100 * randomizer.nextFloat();
		
		double chooseMaintenanceCost = Math.floor(8 * randomizer.nextDouble() * 100) / 100;
		double chooseDangerPerc = Math.floor(randomizer.nextDouble() * 100) / 100;
		
		if (Constants.Animals.Mammals.Cow.equals(type)) {
			return new Cow(4, mammalNames[chooseName], chooseBodyTemperature, chooseBodyHairPercent, chooseMaintenanceCost, chooseDangerPerc);
		} else if (Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey(2, mammalNames[chooseName], chooseBodyTemperature, chooseBodyHairPercent, chooseMaintenanceCost, chooseDangerPerc);
		} else if (Constants.Animals.Mammals.Tiger.contentEquals(type)) {
			return new Tiger(4, mammalNames[chooseName], chooseBodyTemperature, chooseBodyHairPercent, chooseMaintenanceCost, chooseDangerPerc);
		} else
			throw new Exception("Invalid animal exception!");
	}
}
