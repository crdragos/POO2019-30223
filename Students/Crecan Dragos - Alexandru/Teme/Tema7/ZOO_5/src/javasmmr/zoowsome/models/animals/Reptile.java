package javasmmr.zoowsome.models.animals;

import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

public abstract class Reptile extends Animal {
    private boolean laysEggs;

    public Reptile(Double maintenaceCost, Double dangerPerc) {
        super(maintenaceCost, dangerPerc);
    }

    public void setLaysEggs(boolean laysEggs) {
        this.laysEggs = laysEggs;
    }

    public boolean getLaysEggs() {
        return this.laysEggs;
    }

    @Override
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "laysEggs", String.valueOf(this.laysEggs));
    }

    @Override
    public void decodeFromXml(Element element) {
        setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
    }
}
