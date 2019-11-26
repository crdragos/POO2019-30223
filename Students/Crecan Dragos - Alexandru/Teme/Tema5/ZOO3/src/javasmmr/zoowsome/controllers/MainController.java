package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.services.factories.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;

public class MainController {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal[] animale = new Animal[5];
        
        SpeciesFactory speciesFactoryMamal = animalFactory.getSpeciesFactory(Constants.Species.Mamals);
        SpeciesFactory speciesFactoryInsect = animalFactory.getSpeciesFactory(Constants.Species.Insects);
        SpeciesFactory speciesFactoryAquatic = animalFactory.getSpeciesFactory(Constants.Species.Aquatics);
        SpeciesFactory speciesFactoryBird = animalFactory.getSpeciesFactory(Constants.Species.Birds);
        SpeciesFactory speciesFactoryReptile = animalFactory.getSpeciesFactory(Constants.Species.Reptiles);
        
        animale[0] = speciesFactoryMamal.getAnimal(Constants.Animals.Mamals.Monkey);
        animale[1] = speciesFactoryReptile.getAnimal(Constants.Animals.Reptiles.Snake);
        animale[2] = speciesFactoryAquatic.getAnimal(Constants.Animals.Aquatics.SeaHorse);
        animale[3] = speciesFactoryBird.getAnimal(Constants.Animals.Birds.Stork);        
        animale[4] = speciesFactoryInsect.getAnimal(Constants.Animals.Insects.Butterfly);
        
        printAnimals(animale);
        
        EmployeeFactory employeeFactory = new EmployeeFactory();
        
        Employee[] employees = new Caretaker[4];
        employees[0] = employeeFactory.getEmployee(Constants.Employees.Caretaker);
        employees[0].setName("Dragos");
        
        employees[1] = employeeFactory.getEmployee(Constants.Employees.Caretaker);
        employees[1].setName("Radu");

        employees[2] = employeeFactory.getEmployee(Constants.Employees.Caretaker);
        employees[2].setName("Andrei");
        
        employees[3] = employeeFactory.getEmployee(Constants.Employees.Caretaker);
        employees[3].setName("Razvan");
        
        setIDs(employees);
        
        printEmployees(employees);
        
        for (int i = 0; i < employees.length; i++ ) {
        	for (int j = 0; j < animale.length; j++) {
        		if (employees[i].getIsDead() == false && animale[j].getTakenCareOf() == false) {
        			String result = ((Caretaker) employees[i]).takeCareOf(animale[j]);
        			if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
        				employees[i].setIsDead(true);
        			} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
        				j++;
        			} else {
        				animale[j].setTakenCareOf(true);
        			}
        		}
        	}
        }
        
        printAnimals(animale);
        
        printEmployees(employees);
        
        
        AnimalRepository animalRepository = new AnimalRepository();
        
        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        try {
			animals = animalRepository.load();
		} catch (ParserConfigurationException | SAXException | IOException e1) {
			e1.printStackTrace();
		}
        
        try {
			animalRepository.save(animals);
		} catch (XMLStreamException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        
        try {
			animals = animalRepository.load();
		} catch (ParserConfigurationException | SAXException | IOException e1) {
			e1.printStackTrace();
		}
        
    }
    
    public static void printAnimals(Animal[] animale) {
    	System.out.println("Animalele sunt: ");
        for (int i = 0; i < animale.length; i++) {
        	if (animale[i].getTakenCareOf() == true) {
        		System.out.println("Animalul este: " + animale[i].getName() + " si s-a avut grija de el.");
        	} else {
        		System.out.println("Animalul este: " + animale[i].getName() + " si nu s-a avut grija de el.");
        	}
        }
        System.out.println();
    }
    
    public static void printEmployees(Employee[] employees) {
        System.out.println("Angajatii sunt: ");
        for (int i = 0; i < employees.length; i++) {
        	if (employees[i].getIsDead() == false) {
        		System.out.println(employees[i].getName() + " ID: " + employees[i].getId() + ", salariu: " + employees[i].getSalary() + ", ore de lucru: " + ((Caretaker) employees[i]).getWorkingHours() + " si este viu.");
        	} else {
        		System.out.println(employees[i].getName() + " ID: " + employees[i].getId() + ", salariu: " + employees[i].getSalary() + ", ore de lucru: " + ((Caretaker) employees[i]).getWorkingHours() + " si este mort...");
        	}
        }
        System.out.println();
    }
    
    public static void setIDs(Employee[] employees) {
    	for (int i = 0; i < employees.length; i++) {
    		employees[i].setId();
    	}
    	
    	for (int i = 0; i < employees.length - 1; i++) {
    		for (int j = i + 1; j < employees.length; j++) {
    			if (employees[i].getId() == employees[j].getId()) {
    				employees[j].setId();
    			}
    		}
    	}
    }
}
