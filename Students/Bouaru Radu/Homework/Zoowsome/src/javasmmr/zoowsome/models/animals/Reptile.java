package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Reptile extends Animal {
	public boolean laysEggs;

	public Reptile(Integer nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.laysEggs = laysEggs;
	}

	public boolean isLayingEggs() {
		return this.laysEggs;
	}

	public void setEggsLayed(boolean newLays) {
		this.laysEggs = newLays;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(this.laysEggs));		
	}
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
		setEggsLayed(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	
	}
}
