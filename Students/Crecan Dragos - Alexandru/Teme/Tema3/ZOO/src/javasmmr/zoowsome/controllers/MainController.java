package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.animals.*;

public class MainController {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        
        SpeciesFactory speciesFactoryMamal = animalFactory.getSpeciesFactory(Constants.Species.Mamals);
        SpeciesFactory speciesFactoryInsect = animalFactory.getSpeciesFactory(Constants.Species.Insects);
        SpeciesFactory speciesFactoryAquatic = animalFactory.getSpeciesFactory(Constants.Species.Aquatics);
        SpeciesFactory speciesFactoryBird = animalFactory.getSpeciesFactory(Constants.Species.Birds);
        SpeciesFactory speciesFactoryReptile = animalFactory.getSpeciesFactory(Constants.Species.Reptiles);
        
        Animal maimuta = speciesFactoryMamal.getAnimal(Constants.Animals.Mamals.Monkey);
        System.out.println("Maimuta are numele " + maimuta.getName() + " si " + maimuta.getNrOfLegs() + " picioare.");
        
        Animal sarpe = speciesFactoryReptile.getAnimal(Constants.Animals.Reptiles.Snake);
        System.out.println("Sarpele are numele " + sarpe.getName() + " si " + sarpe.getNrOfLegs() + " picioare.");
        
        Animal calDeMare = speciesFactoryAquatic.getAnimal(Constants.Animals.Aquatics.SeaHorse);
        System.out.println("Calul are numele " + calDeMare.getName() + " si " + calDeMare.getNrOfLegs() + " picioare.");
        
        Animal barza = speciesFactoryBird.getAnimal(Constants.Animals.Birds.Stork);
        System.out.println("Barza are numele " + barza.getName() + " si " + barza.getNrOfLegs() + " picioare.");
        
        Animal fluture = speciesFactoryInsect.getAnimal(Constants.Animals.Insects.Butterfly);
        System.out.println("Fluturele are numele " + fluture.getName() + " si " + fluture.getNrOfLegs() + " picioare.");
    }
}