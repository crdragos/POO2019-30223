package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Peacock extends Bird{

	public Peacock(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, migrates, avgFlightAltitude, maintenanceCost, dangerPerc);
	}
	public Peacock()
	{
		super(2, "Blanche", false, 2, 3, 0.1);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Peacock);
	}
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}

}
