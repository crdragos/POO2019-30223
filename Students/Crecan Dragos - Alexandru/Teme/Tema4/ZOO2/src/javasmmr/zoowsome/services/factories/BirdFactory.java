package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {
    public Animal getAnimal(String type) {
        if (Constants.Animals.Birds.Hawk.equals(type)) {
            return new Hawk(1, 0.3);
        } else if (Constants.Animals.Birds.Owl.equals(type)) {
            return new Owl(1, 0.1);
        } else if (Constants.Animals.Birds.Stork.equals(type)) {
            return new Stork(1, 0.0);
        } else {
            return null;
        }
    }
}