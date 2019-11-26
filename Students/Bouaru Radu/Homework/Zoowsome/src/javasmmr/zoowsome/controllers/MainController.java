package javasmmr.zoowsome.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Aquatic;
import javasmmr.zoowsome.models.animals.Bird;
import javasmmr.zoowsome.models.animals.Insect;
import javasmmr.zoowsome.models.animals.Mammal;
import javasmmr.zoowsome.models.animals.Reptile;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.EmployeeFactory;
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

		/*
		 * for (int i = 0; i < insectCounter; i++) if (myInsects[i].getName() ==
		 * "Chris Evans") System.out.
		 * printf("%s - Wait, this is not SpiderMan, therefore not an insect!!\n",
		 * myInsects[i].getName()); // see InsectFactory class :) else
		 * System.out.printf("Hello! My name is %s. Do you ask if I am dangerous? %s\n",
		 * myInsects[i].getName(), myInsects[i].isDangerous());
		 */
		EmployeeFactory abstractEmployeeFactory = new EmployeeFactory();
		EmployeeAbstractFactory employeeFactory1 = abstractEmployeeFactory
				.getEmployeeFactory(Constants.EmployeeTypes.Caretaker);
		Caretaker myCaretakers[] = new Caretaker[100];

		for (int i = 0; i < myCaretakers.length; i++) {
			myCaretakers[i] = (Caretaker) employeeFactory1.getEmployeeFactory(Constants.EmployeeTypes.Caretaker);
		}
		for (int i = 0; i < 10; i++) {
			for (int m = 0; m < mammalCounter; m++) {
				if ((myCaretakers[i].isDead() == false) && myMammals[m].isTakenCareOf() == false) {
					String result = myCaretakers[i].takeCareOf(myMammals[m]);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						myCaretakers[i].setDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						m++;
					} else
						myMammals[m].setTakenCareOf(true);
				}
			}
			for (int m = 0; m < insectCounter; m++) {
				if ((myCaretakers[i].isDead() == false) && myInsects[m].isTakenCareOf() == false) {
					String result = myCaretakers[i].takeCareOf(myInsects[m]);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						myCaretakers[i].setDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						m++;
					} else
						myInsects[m].setTakenCareOf(true);
				}
			}
			for (int m = 0; m < aquaticCounter; m++) {
				if ((myCaretakers[i].isDead() == false) && myAquatics[m].isTakenCareOf() == false) {
					String result = myCaretakers[i].takeCareOf(myAquatics[m]);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						myCaretakers[i].setDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						m++;
					} else
						myAquatics[m].setTakenCareOf(true);
				}
			}
			for (int m = 0; m < birdCounter; m++) {
				if ((myCaretakers[i].isDead() == false) && myBirds[m].isTakenCareOf() == false) {
					String result = myCaretakers[i].takeCareOf(myBirds[m]);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						myCaretakers[i].setDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						m++;
					} else
						myBirds[m].setTakenCareOf(true);
				}
			}
			for (int m = 0; m < reptileCounter; m++) {
				if ((myCaretakers[i].isDead() == false) && myReptiles[m].isTakenCareOf() == false) {
					String result = myCaretakers[i].takeCareOf(myReptiles[m]);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						myCaretakers[i].setDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						m++;
					} else
						myReptiles[m].setTakenCareOf(true);
				}
			}
		}

		/*
		 * for (int i = 0; i < mammalCounter; i++)
		 * 
		 * if (myMammals[i].isTakenCareOf() == true)
		 * System.out.println("It has been taken care of animal #" + i + ", " +
		 * myMammals[i].getName()); else
		 * System.out.println("It has NOT been taken care of animal #" + i + ", " +
		 * myMammals[i].getName());
		 * 
		 * 
		 * System.out.println();
		 * 
		 * for (int i = 0; i < myCaretakers.length; i++) if (myCaretakers[i].isDead() ==
		 * true) System.out.println("Oh no! " + myCaretakers[i].getName() +
		 * " is dead!"); else System.out.println(myCaretakers[i].getName() +
		 * " is still alive.");
		 */

		AnimalRepository AnimalRepository = new AnimalRepository();
		ArrayList<Animal> animalsToSave = new ArrayList<Animal>();

		for (int i = 0; i < mammalCounter; i++)
			animalsToSave.add(myMammals[i]);
		for (int i = 0; i < birdCounter; i++)
			animalsToSave.add(myBirds[i]);
		for (int i = 0; i < reptileCounter; i++)
			animalsToSave.add(myReptiles[i]);
		for (int i = 0; i < aquaticCounter; i++)
			animalsToSave.add(myAquatics[i]);
		for (int i = 0; i < insectCounter; i++)
			animalsToSave.add(myInsects[i]);

		AnimalRepository.save(animalsToSave);

		ArrayList<Animal> animalsToLoad = new ArrayList<Animal>();
		animalsToLoad = AnimalRepository.load();

		EmployeeRepository EmployeeRepository = new EmployeeRepository();
		ArrayList<Employee> employeesToSave = new ArrayList<Employee>();

		for (int i = 0; i < myCaretakers.length; i++)
			employeesToSave.add(myCaretakers[i]);

		EmployeeRepository.save(employeesToSave);

		ArrayList<Employee> employeesToLoad = new ArrayList<Employee>();
		employeesToLoad = EmployeeRepository.load();

		System.out.println(employeesToLoad.size());
	}

}
