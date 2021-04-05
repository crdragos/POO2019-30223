package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;

	public Insect(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}

	public boolean isFlying() {
		return this.canFly;
	}

	public void setFlying(boolean newFlightState) {
		this.canFly = newFlightState;
	}

	public boolean isDangerous() {
		return this.isDangerous;
	}

	public void setDangerLevel(boolean DangerState) {
		this.isDangerous = DangerState;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(this.canFly));
		createNode(eventWriter, "isDangerous", String.valueOf(this.isDangerous));
	}
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
		setFlying(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setDangerLevel(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}

}
