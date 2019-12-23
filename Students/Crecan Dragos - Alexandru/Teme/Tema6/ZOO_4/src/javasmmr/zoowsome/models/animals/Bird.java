package javasmmr.zoowsome.models.animals;

import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

public abstract class Bird extends Animal {
    private Boolean migrates;
    private Integer avgFlightAltitude;

    public Bird(Double maintenanceCost, Double dangerPerc) {
        super(maintenanceCost, dangerPerc);
    }

    public void setMigrates(Boolean migrates) {
        this.migrates = migrates;
    }

    public Boolean getMigrates() {
        return this.migrates;
    }

    public void setAvgFlightAltitude(Integer avgFlightAltitude) {
        this.avgFlightAltitude =avgFlightAltitude;
    }

    public Integer getAvgFlightAltitude() {
        return this.avgFlightAltitude;
    }

    @Override
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "migrates", String.valueOf(this.migrates));
        createNode(eventWriter, "avgFlightAltitude", String.valueOf(this.avgFlightAltitude));
    }

    @Override
    public void decodeFromXml(Element element) {
        setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
        setAvgFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
    }
}
