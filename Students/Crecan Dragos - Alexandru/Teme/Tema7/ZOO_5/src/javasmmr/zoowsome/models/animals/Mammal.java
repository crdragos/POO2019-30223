package javasmmr.zoowsome.models.animals;

import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

public abstract class Mammal extends Animal{
    private float normalBodyTemp;
    private float percBodyHair;

    public Mammal(Double maintenaceCost, Double dangerPerc) {
        super(maintenaceCost, dangerPerc);
    }

    public void setNormalBodyTemp(float normalBodyTemp) {
        this.normalBodyTemp = normalBodyTemp;
    }

    public float getNormalBodyTemp() {
        return this.normalBodyTemp;
    }

    public void setPercBodyHair(float percBodyHair) {
        this.percBodyHair = percBodyHair;
    }

    public float getPercBodyHair() {
        return this.percBodyHair;
    }

    @Override
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "normalBodyTemp", String.valueOf(this.normalBodyTemp));
        createNode(eventWriter, "percBodyHair", String.valueOf(this.percBodyHair));
    }

    @Override
    public void decodeFromXml(Element element) {
        setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
        setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
    }
}
