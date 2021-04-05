package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {

	private Integer avgSwimDepth;

	public enum waterType {
		saltwater, freshwater
	};

	private waterType swimmingWater;

	public Aquatic(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType water, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.avgSwimDepth = avgSwimDepth;
		this.swimmingWater = water;
	}

	public Integer getAverageSwimDepth() {
		return this.avgSwimDepth;
	}

	public void setAverageSwimDepth(Integer newAverageSwimDepth) {
		this.avgSwimDepth = newAverageSwimDepth;
	}

	public waterType getWaterType() {
		return this.swimmingWater;
	}

	public void setWaterType(waterType newWaterType) {
		this.swimmingWater = newWaterType;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(this.avgSwimDepth));
		createNode(eventWriter, "waterType", String.valueOf(this.swimmingWater));
	}
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
		setAverageSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(waterType.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
		
	}
}
