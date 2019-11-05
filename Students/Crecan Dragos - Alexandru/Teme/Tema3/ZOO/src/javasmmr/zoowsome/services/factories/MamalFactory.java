package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class MamalFactory extends SpeciesFactory {
    public Animal getAnimal(String type) {
        if (Constants.Animals.Mamals.Tiger.equals(type)) {
            return new Tiger();
        } else if (Constants.Animals.Mamals.Monkey.equals(type)) {
            return new Monkey();
        } else if (Constants.Animals.Mamals.Cow.equals(type)) {
            return new Cow();
        } else {
            return null;
        }
    }
}