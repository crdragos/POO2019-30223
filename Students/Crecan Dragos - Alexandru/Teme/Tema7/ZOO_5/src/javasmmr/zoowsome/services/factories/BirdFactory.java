package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Hawk;
import javasmmr.zoowsome.models.animals.Owl;
import javasmmr.zoowsome.models.animals.Stork;

public class BirdFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) throws Exception {
        if (Constants.Animals.Birds.Hawk.equals(type)) {
            return new Hawk();
        } else if (Constants.Animals.Birds.Owl.equals(type)) {
            return new Owl();
        } else if (Constants.Animals.Birds.Strok.equals(type)) {
            return new Stork();
        } else {
            throw new Exception("Invalid animal format!");
        }
    }
}
