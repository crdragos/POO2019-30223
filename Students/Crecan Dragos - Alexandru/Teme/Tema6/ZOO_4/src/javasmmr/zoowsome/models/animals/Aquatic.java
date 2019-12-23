package javasmmr.zoowsome.models.animals;

import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

public abstract class Aquatic extends Animal {
    private Integer avgSwimDepth;

    public Aquatic(Double maintenaceCost, double dangerPerc) {
        super(maintenaceCost, dangerPerc);
    }

    public void setAvgSwimDepth(Integer avgSwimDepth) {
        this.avgSwimDepth = avgSwimDepth;
    }

    public Integer getAvgSwimDepth() {
        return this.avgSwimDepth;
    }

    @Override
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "avgSwimDepth", String.valueOf(this.avgSwimDepth));
    }

    @Override
    public void decodeFromXml(Element element) {
        setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
    }
}
