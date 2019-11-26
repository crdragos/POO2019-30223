package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {
    public Animal getAnimal(String type) {
        if (Constants.Animals.Insects.Butterfly.equals(type)) {
            return new Butterfly(0.1, 0.0);
        } else if (Constants.Animals.Insects.Cockroach.equals(type)) {
            return new Cockroach(0.1, 0.0);
        } else if (Constants.Animals.Insects.Spider.equals(type)) {
            return new Spider(0.1, 0.3);
        } else {
            return null;
        }
    }
}