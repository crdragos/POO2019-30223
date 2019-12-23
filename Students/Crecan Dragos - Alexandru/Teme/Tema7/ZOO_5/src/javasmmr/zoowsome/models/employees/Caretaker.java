package javasmmr.zoowsome.models.employees;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.interfaces.Caretaker_I;
import javasmmr.zoowsome.services.factories.Constants;
import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import java.math.BigDecimal;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

public class Caretaker extends Employee implements Caretaker_I {
    private Double workingHours;

    public Caretaker() {
        super();
        this.workingHours = 40.0;
    }

    public Caretaker(String name, BigDecimal salary, Double workingHours) {
        super(name, salary);
        this.workingHours = workingHours;
    }

    public Double getWorkingHours() {
        return this.workingHours;
    }

    public void setWorkingHours(Double workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String takeCareOf(Animal animal) {
        if (animal.kill()) {
            return Constants.Employees.Caretakers.TCO_KILLED;
        }

        if (this.workingHours < animal.getMaintenanceCost()) {
            return Constants.Employees.Caretakers.TCO_NO_TIME;
        }

        animal.setTakenCareOf(true);
        this.workingHours -= animal.getMaintenanceCost();
        return Constants.Employees.Caretakers.TCO_SUCCES;
    }

    @Override
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "workingHours", String.valueOf(this.workingHours));
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Employees.Caretaker);
    }

    @Override
    public void decodeFromXml(Element element) {
        setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
    }
}
