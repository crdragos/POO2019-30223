package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Mantis;
import javasmmr.zoowsome.models.animals.Spiderman;
import javasmmr.zoowsome.models.animals.Wasp;

public class InsectFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {

		String[] insectNames = new String[] { "Insect1", "Insect2", "Insect3", "Insect4", "Insect5", "Insect6",
				"Insect7", "Insect8", "Insect9", "Insect10" };
		String[] spiderManNames = new String[] { "Tom Holland", "Tobey Maguire", "Andrew Garfield", "Chris Evans" };
		Random randomizer = new Random();
		int chooseName = randomizer.nextInt(insectNames.length);
		int chooseSpiderName = randomizer.nextInt(spiderManNames.length);
		boolean chooseFlightState = randomizer.nextBoolean();
		boolean chooseDangerState = randomizer.nextBoolean();
		
		double chooseMaintenanceCost = 8 * randomizer.nextDouble();
		double chooseDangerPerc = randomizer.nextDouble();

		if (Constants.Animals.Insects.Mantis.equals(type)) {
			return new Mantis(4, insectNames[chooseName], chooseFlightState, chooseDangerState, chooseMaintenanceCost, chooseDangerPerc);
		} else if (Constants.Animals.Insects.SpiderMan.equals(type)) {
			return new Spiderman(2, spiderManNames[chooseSpiderName], true, true, chooseMaintenanceCost, chooseDangerPerc);
		} else if (Constants.Animals.Insects.Wasp.contentEquals(type)) {
			return new Wasp(4, insectNames[chooseName], chooseFlightState, chooseDangerState, chooseMaintenanceCost, chooseDangerPerc);
		} else
			throw new Exception("Invalid animal exception!");
	}

}
