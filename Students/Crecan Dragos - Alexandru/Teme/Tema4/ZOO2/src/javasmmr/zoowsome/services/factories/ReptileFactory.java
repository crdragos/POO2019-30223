package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {
    public Animal getAnimal(String type) {
        if (Constants.Animals.Reptiles.Lizard.equals(type)) {
            return new Lizard(0, 0.0);
        } else if (Constants.Animals.Reptiles.Snake.equals(type)) {
            return new Snake(1, 0.7);
        } else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
            return new Turtle(1, 0.1);
        } else {
            return null;
        }
    }
}