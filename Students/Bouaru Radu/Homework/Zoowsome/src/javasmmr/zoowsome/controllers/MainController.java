package javasmmr.zoowsome.controllers;

import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Aquatic;
import javasmmr.zoowsome.models.animals.Bird;
import javasmmr.zoowsome.models.animals.Insect;
import javasmmr.zoowsome.models.animals.Mammal;
import javasmmr.zoowsome.models.animals.Reptile;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {

	public static void main(String[] args) throws Exception {

		AnimalFactory abstractFactory = new AnimalFactory();

		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory speciesFactory5 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);

		Mammal[] myMammals = new Mammal[50];
		Bird[] myBirds = new Bird[50];
		Aquatic[] myAquatics = new Aquatic[50];
		Reptile[] myReptiles = new Reptile[50];
		Insect[] myInsects = new Insect[50];

		int animalCounter = 50;

		int mammalCounter = 0;
		int birdCounter = 0;
		int aquaticCounter = 0;
		int reptileCounter = 0;
		int insectCounter = 0;

		for (int i = 0; i < animalCounter; i++) {
			Random speciesRandomiser = new Random();
			Random animalTypeRandomiser = new Random();
			int chooseSpecies = speciesRandomiser.nextInt(5);
			int chooseAnimal = animalTypeRandomiser.nextInt(3);

			if (chooseSpecies == 0) {
				if (chooseAnimal == 0) {
					myMammals[mammalCounter++] = (Mammal) speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
				} else if (chooseAnimal == 1) {
					myMammals[mammalCounter++] = (Mammal) speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
				} else if (chooseAnimal == 2) {
					myMammals[mammalCounter++] = (Mammal) speciesFactory1.getAnimal(Constants.Animals.Mammals.Monkey);
				}
			} else if (chooseSpecies == 1) {
				if (chooseAnimal == 0) {
					myBirds[birdCounter++] = (Bird) speciesFactory2.getAnimal(Constants.Animals.Birds.Gryphon);
				} else if (chooseAnimal == 1) {
					myBirds[birdCounter++] = (Bird) speciesFactory2.getAnimal(Constants.Animals.Birds.Peacock);
				} else if (chooseAnimal == 2) {
					myBirds[birdCounter++] = (Bird) speciesFactory2.getAnimal(Constants.Animals.Birds.Phoenix);
				}
			} else if (chooseSpecies == 2) {
				if (chooseAnimal == 0) {
					myAquatics[aquaticCounter++] = (Aquatic) speciesFactory3
							.getAnimal(Constants.Animals.Aquatics.MantaRay);
				} else if (chooseAnimal == 1) {
					myAquatics[aquaticCounter++] = (Aquatic) speciesFactory3
							.getAnimal(Constants.Animals.Aquatics.Salmon);
				} else if (chooseAnimal == 2) {
					myAquatics[aquaticCounter++] = (Aquatic) speciesFactory3
							.getAnimal(Constants.Animals.Aquatics.Whale);
				}
			} else if (chooseSpecies == 3) {
				if (chooseAnimal == 0) {
					myReptiles[reptileCounter++] = (Reptile) speciesFactory4
							.getAnimal(Constants.Animals.Reptiles.Dinosaur);
				} else if (chooseAnimal == 1) {
					myReptiles[reptileCounter++] = (Reptile) speciesFactory4
							.getAnimal(Constants.Animals.Reptiles.Snake);
				} else if (chooseAnimal == 2) {
					myReptiles[reptileCounter++] = (Reptile) speciesFactory4
							.getAnimal(Constants.Animals.Reptiles.Tortoise);
				}
			} else if (chooseSpecies == 4) {
				if (chooseAnimal == 0) {
					myInsects[insectCounter++] = (Insect) speciesFactory5.getAnimal(Constants.Animals.Insects.Mantis);
				} else if (chooseAnimal == 1) {
					myInsects[insectCounter++] = (Insect) speciesFactory5
							.getAnimal(Constants.Animals.Insects.SpiderMan);
				} else if (chooseAnimal == 2) {
					myInsects[insectCounter++] = (Insect) speciesFactory5.getAnimal(Constants.Animals.Insects.Wasp);
				}
			}

		}

		for (int i = 0; i < insectCounter; i++)
			if (myInsects[i].getName() == "Chris Evans")
				System.out.printf("%s - Wait, this is not SpiderMan, therefore not an insect!!\n",
						myInsects[i].getName()); // see InsectFactory class :)
			else
				System.out.printf("Hello! My name is %s. Do you ask if I am dangerous? %s\n", myInsects[i].getName(),
						myInsects[i].isDangerous());

	}

}
