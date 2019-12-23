package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

public class Cockroach extends Insect {

    public Cockroach() {
        super(0.1, 0.0);
        this.setName("Cockroach");
        this.setNrOfLegs(6);
        this.setCanFly(false);
        this.setIsDangerous(false);
    }

    public Cockroach(String name, Integer nrOfLegs, Boolean canFly, Boolean isDangerous, Double maintenaceCost, Double dangerPerc) {
        super(maintenaceCost, dangerPerc);
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setCanFly(canFly);
        this.setIsDangerous(isDangerous);
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
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Cockroach);
    }
}
