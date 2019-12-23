package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

public class SeaHorse extends Aquatic {

    public SeaHorse() {
        super(0.1, 0.0);
        this.setName("SeaHorse");
        this.setNrOfLegs(0);
        this.setAvgSwimDepth(5);
    }

    public SeaHorse(String name, Integer nrOfLegs, Integer avgSwimDepth, Double maintenanceCost, Double dangerPerc) {
        super(maintenanceCost, dangerPerc);
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setAvgSwimDepth(avgSwimDepth);
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
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.SeaHorse);
    }
}
