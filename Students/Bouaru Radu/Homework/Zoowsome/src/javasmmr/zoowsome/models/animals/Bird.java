package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Bird extends Animal {
	private boolean migrates;
	private Integer avgFlightAltitude;

	public Bird(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, double maintenanceCost,
			double dangerPerc) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public boolean isMigrating() {
		return this.migrates;
	}

	public void setMigrating(boolean newMigratingState) {
		this.migrates = newMigratingState;
	}

	public Integer getAverageFlightAltitude() {
		return this.avgFlightAltitude;
	}

	public void setAverageFlightAltitude(Integer newAverageFlightAltitude) {
		this.avgFlightAltitude = newAverageFlightAltitude;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(this.migrates));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(this.avgFlightAltitude));
	}
	public void decodeFromXml(Element element)
	{
		super.decodeFromXml(element);
		setMigrating(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setAverageFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}
}
