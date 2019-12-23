package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cancer;
import javasmmr.zoowsome.models.animals.SeaHorse;
import javasmmr.zoowsome.models.animals.Shark;

public class AquaticFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) throws Exception {
        if (Constants.Animals.Aquatics.Cancer.equals(type)) {
            return new Cancer();
        } else if (Constants.Animals.Aquatics.Shark.equals(type)) {
            return new Shark();
        } else if (Constants.Animals.Aquatics.SeaHorse.equals(type)) {
            return new SeaHorse();
        } else {
            throw new Exception("Invalid animal format!");
        }
    }
}
