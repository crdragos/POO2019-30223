package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

public class Tiger extends Mammal {

    public Tiger() {
        super(0.3, 0.7);
        this.setName("Tiger");
        this.setNrOfLegs(4);
        this.setNormalBodyTemp((float) 36.5);
        this.setPercBodyHair((float) 99.5);
    }

    public Tiger(String name, Integer nrOfLegs, float normalBodyTemp, float percBodyHair, Double maintenanceCost, Double dangerPerc) {
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
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Tiger);
    }
}
