package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.interfaces.Killer;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;

import org.w3c.dom.Element;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

public abstract class Animal implements Killer, XML_Parsable {
    private Integer nrOfLegs;
    private String name;
    private Boolean takenCareOf;
    private final Double maintenanceCost;
    private final Double dangerPerc;

    public Animal(Double maintenanceCost, double dangerPerc) {
        this.maintenanceCost = maintenanceCost;
        this.dangerPerc = dangerPerc;
        this.takenCareOf = false;
    }

    public Integer getNrOfLegs() {
        return this.nrOfLegs;
    }

    public void setNrOfLegs(Integer nrOfLegs) {
        this.nrOfLegs = nrOfLegs;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMaintenanceCost() {
        return this.maintenanceCost;
    }

    public Double getDangerPerc() {
        return this.dangerPerc;
    }

    public Boolean getTakenCareOf() {
        return this.takenCareOf;
    }

    public void setTakenCareOf(Boolean takenCareOf) {
        this.takenCareOf = takenCareOf;
    }

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
        createNode(eventWriter, "name", String.valueOf(this.name));
        createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
        createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
        createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
    }

    public void decodeFromXml(Element element) {
        setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
        setName(element.getElementsByTagName("name").item(0).getTextContent());
        setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takeCareOf").item(0).getTextContent()));
    }
}
