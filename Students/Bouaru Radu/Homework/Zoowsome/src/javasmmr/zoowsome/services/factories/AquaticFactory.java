package javasmmr.zoowsome.services.factories;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Aquatic;
import javasmmr.zoowsome.models.animals.MantaRay;
import javasmmr.zoowsome.models.animals.Salmon;
import javasmmr.zoowsome.models.animals.Whale;

public class AquaticFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {

		String[] aquaticNames = new String[] { "Aquatic1", "Aquatic2", "Aquatic3", "Aquatic4", "Aquatic5", "Aquatic6",
				"Aquatic7", "Aquatic8", "Aquatic9", "Aquatic10" };

		Random randomizer = new Random();

		int chooseName = randomizer.nextInt(aquaticNames.length);
		int chooseAverageSwimDepth = randomizer.nextInt(7000);

		double chooseMaintenanceCost = 8 * randomizer.nextDouble();
		double chooseDangerPerc = randomizer.nextDouble();

		Aquatic.waterType waterType[] = { Aquatic.waterType.freshwater, Aquatic.waterType.saltwater };
		int chooseWaterType = randomizer.nextInt(2);

		if (Constants.Animals.Aquatics.MantaRay.equals(type)) {
			return new MantaRay(0, aquaticNames[chooseName], chooseAverageSwimDepth, waterType[chooseWaterType], chooseMaintenanceCost, chooseDangerPerc);
		} else if (Constants.Animals.Aquatics.Salmon.equals(type)) {
			return new Salmon(0, aquaticNames[chooseName], chooseAverageSwimDepth, waterType[chooseWaterType], chooseMaintenanceCost, chooseDangerPerc);
		} else if (Constants.Animals.Aquatics.Whale.equals(type)) {
			return new Whale(0, aquaticNames[chooseName], chooseAverageSwimDepth, waterType[chooseWaterType], chooseMaintenanceCost, chooseDangerPerc);
		} else
			throw new Exception("Invalid animal exception!");
	}

}
