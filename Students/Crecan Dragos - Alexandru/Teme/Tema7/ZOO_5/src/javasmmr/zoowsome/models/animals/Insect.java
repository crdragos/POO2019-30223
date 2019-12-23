package javasmmr.zoowsome.models.animals;

import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

public abstract class Insect extends Animal {
    private Boolean canFly;
    private Boolean isDangerous;

    public Insect(Double maintenanceCost, Double dangerPerc) {
        super(maintenanceCost, dangerPerc);
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }

    public Boolean getCanFly() {
        return this.canFly;
    }

    public void setIsDangerous(Boolean isDangerous) {
        this.isDangerous = isDangerous;
    }

    public Boolean getIsDangerous() {
        return this.isDangerous;
    }

    @Override
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "canFly", String.valueOf(this.canFly));
        createNode(eventWriter, "isDangerous", String.valueOf(this.isDangerous));
    }

    @Override
    public void decodeFromXml(Element element) {
        setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
        setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
    }
}
