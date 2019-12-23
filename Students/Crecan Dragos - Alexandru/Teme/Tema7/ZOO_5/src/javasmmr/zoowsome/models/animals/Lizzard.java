package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

public class Lizzard extends Reptile {

    public Lizzard() {
        super(0.2, 0.1);
        this.setName("Lizzard");
        this.setNrOfLegs(4);
        this.setLaysEggs(false);
    }

    public Lizzard(String name, Integer nrOfLegs, Boolean laysEggs, Double maintenanceCost, Double dangerPerc) {
        super(maintenanceCost, dangerPerc);
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setLaysEggs(laysEggs);
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
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Lizzard);
    }
}
