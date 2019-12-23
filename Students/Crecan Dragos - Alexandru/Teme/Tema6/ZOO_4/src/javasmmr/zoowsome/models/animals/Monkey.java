package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

public class Monkey extends Mammal {

    public Monkey() {
        super(0.4, 0.2);
        this.setName("Monkey");
        this.setNrOfLegs(4);
        this.setNormalBodyTemp((float) 36.5);
        this.setPercBodyHair((float) 100.0);
    }

    public Monkey(String name, Integer nrOfLegs, float normalBodyTemp, float percBodyHair, Double maintenanceCost, Double dangerPerc) {
        super(maintenanceCost, dangerPerc);
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setNormalBodyTemp(normalBodyTemp);
        this.setPercBodyHair(percBodyHair);
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
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Monkey);
    }
}
