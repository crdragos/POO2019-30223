package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Mammal extends Animal {

	private float normalBodyTemp;
	private float percBodyHair;

	public Mammal(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair = percBodyHair;
	}

	public float getBodyTemperature() {
		return this.normalBodyTemp;
	}

	public void setBodyTemperature(float newBodyTemp) {
		this.normalBodyTemp = newBodyTemp;
	}

	public float getBodyHairPercent() {
		return this.percBodyHair;
	}

	public void setBodyHairPercent(float newBodyHairPerc) {
		this.normalBodyTemp = newBodyHairPerc;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(this.normalBodyTemp));
		createNode(eventWriter, "percBodyHair", String.valueOf(this.percBodyHair));
	}
	@Override
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
		setBodyTemperature(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setBodyHairPercent(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}	
}
