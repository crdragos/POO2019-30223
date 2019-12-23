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

public class AnimalRepository extends EntityRepository<Animal> {

    public static final String XML_FILENAME = "Animals.xml";

    public AnimalRepository() {
        super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
    }

    public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException {
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        StartDocument startDocument = eventFactory.createStartDocument();
        eventWriter.add(startDocument);
        StartElement configStartElement = eventFactory.createStartElement("", "", "content");
        eventWriter.add(configStartElement);
        eventWriter.add(end);

        for (XML_Parsable animal : animals) {
            StartElement sElement = eventFactory.createStartElement("", "" , Constants.XML_TAGS.ANIMAL);
            eventWriter.add(sElement);
            eventWriter.add(end);

            animal.encodeToXml(eventWriter);

            EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);
            eventWriter.add(eElement);
            eventWriter.add(end);
        }

        eventWriter.add(eventFactory.createEndElement("", "", "content"));
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }

    public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException {

        ArrayList<Animal> animals = new ArrayList<Animal>();

        File fXmlFile = new File(XML_FILENAME);

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(fXmlFile);
        document.getDocumentElement().normalize();

        NodeList nodeList = document.getElementsByTagName(Constants.XML_TAGS.ANIMAL);

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
                switch (discriminant) {
                    case Constants.Animals.Insects.Butterfly:
                        Animal butterfly = new Butterfly();
                        butterfly.decodeFromXml(element);
                        animals.add(butterfly);
                        break;
                    case Constants.Animals.Insects.Cockroach:
                        Animal cockroach = new Cockroach();
                        cockroach.decodeFromXml(element);
                        animals.add(cockroach);
                        break;
                    case Constants.Animals.Insects.Spider:
                        Animal spider = new Spider();
                        spider.decodeFromXml(element);
                        animals.add(spider);
                        break;
                    case Constants.Animals.Mammals.Tiger:
                        Animal tiger = new Tiger();
                        tiger.decodeFromXml(element);
                        animals.add(tiger);
                        break;
                    case Constants.Animals.Mammals.Cow:
                        Animal cow = new Cow();
                        cow.decodeFromXml(element);
                        animals.add(cow);
                        break;
                    case Constants.Animals.Mammals.Monkey:
                        Animal monkey = new Monkey();
                        monkey.decodeFromXml(element);
                        animals.add(monkey);
                        break;
                    case Constants.Animals.Reptiles.Snake:
                        Animal snake = new Snake();
                        snake.decodeFromXml(element);
                        animals.add(snake);
                        break;
                    case Constants.Animals.Reptiles.Lizzard:
                        Animal lizzard = new Lizzard();
                        lizzard.decodeFromXml(element);
                        animals.add(lizzard);
                        break;
                    case Constants.Animals.Reptiles.Turtle:
                        Animal turtle = new Turtle();
                        turtle.decodeFromXml(element);
                        animals.add(turtle);
                        break;
                    case Constants.Animals.Aquatics.Cancer:
                        Animal cancer = new Cancer();
                        cancer.decodeFromXml(element);
                        animals.add(cancer);
                        break;
                    case Constants.Animals.Aquatics.SeaHorse:
                        Animal seaHorse = new SeaHorse();
                        seaHorse.decodeFromXml(element);
                        animals.add(seaHorse);
                        break;
                    case Constants.Animals.Aquatics.Shark:
                        Animal shark = new Shark();
                        shark.decodeFromXml(element);
                        animals.add(shark);
                        break;
                    case Constants.Animals.Birds.Hawk:
                        Animal hawk = new Hawk();
                        hawk.decodeFromXml(element);
                        animals.add(hawk);
                        break;
                    case Constants.Animals.Birds.Owl:
                        Animal owl = new Owl();
                        owl.decodeFromXml(element);
                        animals.add(owl);
                        break;
                    case  Constants.Animals.Birds.Strok:
                        Animal stork = new Stork();
                        stork.decodeFromXml(element);
                        animals.add(stork);
                        break;
                    default:
                        break;
                }
            }
        }
        return animals;
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

    @Override
    protected Animal getEntityFromXmlElement(Element element) {
        String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
        switch (discriminant) {
            case Constants.Animals.Insects.Butterfly:
                Animal butterfly = new Butterfly();
                butterfly.decodeFromXml(element);
                return butterfly;
            case Constants.Animals.Insects.Cockroach:
                Animal cockroach = new Cockroach();
                cockroach.decodeFromXml(element);
                return cockroach;
            case Constants.Animals.Insects.Spider:
                Animal spider = new Spider();
                spider.decodeFromXml(element);
                return spider;
            case Constants.Animals.Mammals.Tiger:
                Animal tiger = new Tiger();
                tiger.decodeFromXml(element);
                return tiger;
            case Constants.Animals.Mammals.Cow:
                Animal cow = new Cow();
                cow.decodeFromXml(element);
                return cow;
            case Constants.Animals.Mammals.Monkey:
                Animal monkey = new Monkey();
                monkey.decodeFromXml(element);
                return monkey;
            case Constants.Animals.Reptiles.Snake:
                Animal snake = new Snake();
                snake.decodeFromXml(element);
                return snake;
            case Constants.Animals.Reptiles.Lizzard:
                Animal lizzard = new Lizzard();
                lizzard.decodeFromXml(element);
                return lizzard;
            case Constants.Animals.Reptiles.Turtle:
                Animal turtle = new Turtle();
                turtle.decodeFromXml(element);
                return turtle;
            case Constants.Animals.Aquatics.Cancer:
                Animal cancer = new Cancer();
                cancer.decodeFromXml(element);
                return cancer;
            case Constants.Animals.Aquatics.SeaHorse:
                Animal seaHorse = new SeaHorse();
                seaHorse.decodeFromXml(element);
                return seaHorse;
            case Constants.Animals.Aquatics.Shark:
                Animal shark = new Shark();
                shark.decodeFromXml(element);
                return shark;
            case Constants.Animals.Birds.Hawk:
                Animal hawk = new Hawk();
                hawk.decodeFromXml(element);
                return hawk;
            case Constants.Animals.Birds.Owl:
                Animal owl = new Owl();
                owl.decodeFromXml(element);
                return owl;
            case  Constants.Animals.Birds.Strok:
                Animal stork = new Stork();
                stork.decodeFromXml(element);
                return stork;
            default:
                break;
        }
        return null;
    }
}
