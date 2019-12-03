package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {
    public Animal getAnimal(String type) {
        if (Constants.Animals.Birds.Hawk.equals(type)) {
            return new Hawk(0.5, 0.2);
        } else if (Constants.Animals.Birds.Owl.equals(type)) {
            return new Owl(0.5, 0.1);
        } else if (Constants.Animals.Birds.Stork.equals(type)) {
            return new Stork(0.5, 0.0);
        } else {
            return null;
        }
    }
}