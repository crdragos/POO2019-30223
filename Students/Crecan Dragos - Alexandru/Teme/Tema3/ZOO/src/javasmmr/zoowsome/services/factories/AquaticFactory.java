package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {
    public Animal getAnimal(String type) {
        if (Constants.Animals.Aquatics.Shark.equals(type)) {
            return new Shark();
        } else if (Constants.Animals.Aquatics.SeaHorse.equals(type)) {
            return new SeaHorse();
        } else if (Constants.Animals.Aquatics.Cancer.equals(type)) {
            return new Cancer();
        } else {
            return null;
        }
    }
}