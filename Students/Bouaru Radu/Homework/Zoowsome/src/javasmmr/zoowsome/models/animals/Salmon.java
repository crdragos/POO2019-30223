package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Salmon extends Aquatic{

	public Salmon(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType water, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, avgSwimDepth, water, maintenanceCost, dangerPerc);
	}
	public Salmon()
	{
		super(0, "Bob", 37, waterType.freshwater, 1, 0);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Salmon);
	}
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}

}
