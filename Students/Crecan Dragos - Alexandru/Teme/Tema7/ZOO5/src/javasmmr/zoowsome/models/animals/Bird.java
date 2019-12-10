package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Bird extends Animal {
	private Boolean migrates;
	private Integer avgFlightAltitude;
	
	public Bird(double maintenanceCost, double dangerPerc) { 
		super(maintenanceCost, dangerPerc);
	}
	
	public void setMigrates(Boolean migrates) {
		this.migrates = migrates;
	}
	
	public void setAvgFlightAltitude(Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
	public Boolean getMigrates() {
		return this.migrates;
	}
	
	public Integer getAvgFlightAltitude() {
		return this.avgFlightAltitude;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(this.getMigrates()));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(this.getAvgFlightAltitude()));
	}
	
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setAvgFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}
	
}
