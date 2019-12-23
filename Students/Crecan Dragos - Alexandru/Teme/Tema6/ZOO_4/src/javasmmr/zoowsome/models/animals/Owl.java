package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

public class Owl extends Bird {

    public Owl() {
        super(0.2, 0.1);
        this.setName("Owl");
        this.setNrOfLegs(2);
        this.setMigrates(true);
        this.setAvgFlightAltitude(10);
    }

    public Owl(String name, Integer nrOfLegs, Boolean migrates, Integer avgFlightAltitude, Double maintenanceCost, Double dangerPerc) {
        super(maintenanceCost, dangerPerc);
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setMigrates(migrates);
        this.setAvgFlightAltitude(avgFlightAltitude);
    }

    @Override
    public boolean kill() {
        double randomValue = Math.random();
        if (randomValue < this.getDangerPerc()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Owl);
    }
}
