package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {
    public Animal getAnimal(String type) {
        if (Constants.Animals.Reptiles.Lizard.equals(type)) {
            return new Lizard(0, 0.0);
        } else if (Constants.Animals.Reptiles.Snake.equals(type)) {
            return new Snake(0.5, 0.5);
        } else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
            return new Turtle(0.5, 0.0);
        } else {
            return null;
        }
    }
}