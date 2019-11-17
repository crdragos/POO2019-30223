package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I{
	private Double workingHours;
	
	public Caretaker() {
		this.name = "newCaretaker";
		this.id = (long) -1;
		this.salary = new BigDecimal(1000);
		this.isDead = false;
		this.workingHours = (double) 8;
	}
	
	public Double getWorkingHours() {
		return this.workingHours;
	}
	
	public void setWorkingHours(Double workingHours) {
		this.workingHours = workingHours;
	}
	
	public String takeCareOf(Animal animal) {
		if (animal.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		
		if (this.workingHours < animal.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		
		animal.setTakenCareOf(true);
		this.workingHours = this.workingHours - animal.getMaintenanceCost();
		
		return Constants.Employees.Caretakers.TCO_SUCCES;
	}

}
