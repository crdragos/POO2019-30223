package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class MamalFactory extends SpeciesFactory {
    public Animal getAnimal(String type) {
        if (Constants.Animals.Mamals.Tiger.equals(type)) {
            return new Tiger(2, 0.9);
        } else if (Constants.Animals.Mamals.Monkey.equals(type)) {
            return new Monkey(2, 0.5);
        } else if (Constants.Animals.Mamals.Cow.equals(type)) {
            return new Cow(2, 0.2);
        } else {
            return null;
        }
    }
}