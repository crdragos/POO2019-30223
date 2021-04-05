package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Gryphon;
import javasmmr.zoowsome.models.animals.Peacock;
import javasmmr.zoowsome.models.animals.Phoenix;

public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {

		String[] birdNames = new String[] { "Bird1", "Bird2", "Bird3", "Bird4", "Bird5", "Bird6", "Bird7", "Bird8",
				"Bird9", "Bird10" };

		Random randomizer = new Random();

		int chooseName = randomizer.nextInt(birdNames.length);
		boolean chooseMigratingState = randomizer.nextBoolean();
		int chooseFlightAltitude = randomizer.nextInt(10000);
		
		double chooseMaintenanceCost = Math.floor(8 * randomizer.nextDouble() * 100) / 100;
		double chooseDangerPerc = Math.floor(randomizer.nextDouble() * 100) / 100;
		
		
		if (Constants.Animals.Birds.Gryphon.equals(type)) {
			return new Gryphon(4, birdNames[chooseName], chooseMigratingState, chooseFlightAltitude, chooseMaintenanceCost, chooseDangerPerc);
		} else if (Constants.Animals.Birds.Peacock.equals(type)) {
			return new Peacock(2, birdNames[chooseName], chooseMigratingState, chooseFlightAltitude, chooseMaintenanceCost, chooseDangerPerc);
		} else if (Constants.Animals.Birds.Phoenix.equals(type)) {
			return new Phoenix(2, birdNames[chooseName], chooseMigratingState, chooseFlightAltitude, chooseMaintenanceCost, chooseDangerPerc);
		} else
			throw new Exception("Invalid animal exception!");
	}

}
