package javasmmr.zoowsome.repositories;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public abstract class EntityRepository<T extends XML_Parsable> {

    private final String xmlFileName;
    private final String entityTag;

    public EntityRepository(String xmlFileName, String entityTag) {
        this.xmlFileName = xmlFileName;
        this.entityTag = entityTag;
    }

    public void save(ArrayList<T> entities) throws FileNotFoundException, XMLStreamException {
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(this.xmlFileName));
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        StartDocument startDocument = eventFactory.createStartDocument();
        eventWriter.add(startDocument);
        StartElement configStartElement = eventFactory.createStartElement("", "", "content");
        eventWriter.add(configStartElement);
        eventWriter.add(end);

        for (XML_Parsable animal : entities) {
            StartElement sElement = eventFactory.createStartElement("", "" , this.entityTag);
            eventWriter.add(sElement);
            eventWriter.add(end);

            animal.encodeToXml(eventWriter);

            EndElement eElement = eventFactory.createEndElement("", "", this.entityTag);
            eventWriter.add(eElement);
            eventWriter.add(end);
        }

        eventWriter.add(eventFactory.createEndElement("", "", "content"));
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }

    protected abstract T getEntityFromXmlElement(Element element);

    public ArrayList<T> load() throws ParserConfigurationException, SAXException, IOException {

        ArrayList<T> entities = new ArrayList<T>();

        File fXmlFile = new File(this.xmlFileName);

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(fXmlFile);
        document.getDocumentElement().normalize();

        NodeList nodeList = document.getElementsByTagName(this.entityTag);

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                entities.add(getEntityFromXmlElement(element));
            }
        }
        return entities;
    }

    public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");

        StartElement startElement = eventFactory.createStartElement("", "", name);

        eventWriter.add(tab);
        eventWriter.add(startElement);

        Characters characters = eventFactory.createCharacters(value);

        eventWriter.add(characters);

        EndElement endElement = eventFactory.createEndElement("", "", name);

        eventWriter.add(endElement);
        eventWriter.add(end);
    }
}
