package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {
    public Animal getAnimal(String type) {
        if (Constants.Animals.Aquatics.Shark.equals(type)) {
            return new Shark(5, 0.6);
        } else if (Constants.Animals.Aquatics.SeaHorse.equals(type)) {
            return new SeaHorse(1, 0.0);
        } else if (Constants.Animals.Aquatics.Cancer.equals(type)) {
            return new Cancer(1, 0.2);
        } else {
            return null;
        }
    }
}