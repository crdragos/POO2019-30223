package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class MantaRay extends Aquatic{

	public MantaRay(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType water, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, avgSwimDepth, water, maintenanceCost, dangerPerc);
	}
	public MantaRay()
	{
		super(0, "Devil's Fish", 500, waterType.saltwater, 4, 0.6);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.MantaRay);
	}
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
	}

}
