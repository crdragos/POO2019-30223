package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.interfaces.Caretaker_I;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I{

	private double workingHours;

	public Caretaker(String name, BigDecimal salary, boolean isDead, double workingHours) {
		super(name, salary, isDead);
		this.workingHours = workingHours;
	}

	public Caretaker() {
		super("Thor Odinsson", new BigDecimal("5000"), false);
		this.workingHours = 10;
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	public String takeCareOf(Animal a) {
		if (a.kill() == true)
			return Constants.Employees.Caretakers.TCO_KILLED;
		 if (this.workingHours < a.getMaintenanceCost())
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		else {
			a.setTakenCareOf(true);
			this.workingHours -= a.getMaintenanceCost();
			return Constants.Employees.Caretakers.TCO_SUCCESS;
		}
		
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "workingHours", String.valueOf(this.workingHours));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.EmployeeTypes.Caretaker);
		
	}

	@Override
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
		
	}
}
