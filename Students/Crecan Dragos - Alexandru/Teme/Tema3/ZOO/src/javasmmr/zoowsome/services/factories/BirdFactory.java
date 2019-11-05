package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {
    public Animal getAnimal(String type) {
        if (Constants.Animals.Birds.Hawk.equals(type)) {
            return new Hawk();
        } else if (Constants.Animals.Birds.Owl.equals(type)) {
            return new Owl();
        } else if (Constants.Animals.Birds.Stork.equals(type)) {
            return new Stork();
        } else {
            return null;
        }
    }
}