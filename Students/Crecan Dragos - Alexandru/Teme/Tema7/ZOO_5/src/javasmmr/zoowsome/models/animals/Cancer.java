package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

public class Cancer extends Aquatic {

    public Cancer() {
        super(0.3, 0.3);
        this.setName("Cancer");
        this.setNrOfLegs(4);
        this.setAvgSwimDepth(5);
    }

    public Cancer(String name, Integer nrOfLegs, Integer avgSwimDepth, Double maintenanceCost, Double dangerPerc) {
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
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Cancer);
    }
}
