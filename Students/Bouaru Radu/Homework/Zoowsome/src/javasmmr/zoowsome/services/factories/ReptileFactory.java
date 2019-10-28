package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Dinosaur;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Tortoise;

public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {

		String[] reptileNames = new String[] { "Reptile1", "Reptile2", "Reptile3", "Reptile4", "Reptile5", "Reptile6",
				"Reptile7", "Reptile8", "Reptile9", "Reptile10" };
		Random randomizer = new Random();
		int chooseName = randomizer.nextInt(reptileNames.length);
		boolean chooseEggsLayed = randomizer.nextBoolean();

		if (Constants.Animals.Reptiles.Dinosaur.equals(type)) {
			return new Dinosaur(4, reptileNames[chooseName], chooseEggsLayed);
		} else if (Constants.Animals.Reptiles.Snake.equals(type)) {
			return new Snake(0, reptileNames[chooseName], chooseEggsLayed);
		} else if (Constants.Animals.Reptiles.Tortoise.contentEquals(type)) {
			return new Tortoise(4, reptileNames[chooseName], chooseEggsLayed);
		} else
			throw new Exception("Invalid animal exception!");
	}

}
