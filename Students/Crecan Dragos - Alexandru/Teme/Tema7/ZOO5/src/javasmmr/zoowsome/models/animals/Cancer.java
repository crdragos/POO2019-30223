package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cancer extends Aquatic {
	
	public Cancer(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		super.setWaterType(getWaterType());
		this.setName("Rac");
		this.setAvgSwimDepth(50);
		this.setNrOfLegs(10);
	}
	
	public boolean kill() {
		double randomNr = Math.random();
		if (randomNr < this.getDangerPerc()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Cancer);
	}

}
