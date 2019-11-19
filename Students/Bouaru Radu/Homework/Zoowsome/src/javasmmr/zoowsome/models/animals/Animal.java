package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animal implements Killer {
	private Integer nrOfLegs;
	private String name;
	private final double maintenanceCost;
	private final double dangerPerc;
	private boolean takenCareOf = false;

	public Animal(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}

	public Integer getNumberOfLegs() {
		return this.nrOfLegs;
	}

	public void setNumberOfLegs(Integer legs) {
		this.nrOfLegs = legs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public boolean kill() {
		Random randomizer = new Random();
		double animalInteraction = randomizer.nextDouble();
		if (animalInteraction < this.dangerPerc)
			return true;
		else
			return false;
	}

	public boolean isTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public double getMaintenanceCost() {
		return this.maintenanceCost;
	}
	public double getDangerPerc()
	{
		return this.dangerPerc;
	}

}
