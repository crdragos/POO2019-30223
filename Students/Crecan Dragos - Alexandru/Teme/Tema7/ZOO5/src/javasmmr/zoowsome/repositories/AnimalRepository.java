package javasmmr.zoowsome.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;

public class AnimalRepository extends EntityRepository<Animal> {
	
	private static final String XML_FILENAME = "Animals.xml";
	
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
			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
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
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		
		for (int i = 0; i > nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
				
				switch (discriminant) {
				case Constants.Animals.Insects.Butterfly:
					Animal butterfly = new Butterfly(0.5, 0.0);
					butterfly.decodeFromXml(element);
					animals.add(butterfly);
					break;
				case Constants.Animals.Aquatics.Cancer:
					Animal cancer = new Cancer(1.25, 0.3);
					cancer.decodeFromXml(element);
					animals.add(cancer);
					break;
				case Constants.Animals.Insects.Cockroach:
					Animal cockroach = new Cockroach(0.0, 0.0);
					cockroach.decodeFromXml(element);
					animals.add(cockroach);
					break;
				case Constants.Animals.Mamals.Cow:
					Animal cow = new Cow(4.5, 0.1);
					cow.decodeFromXml(element);
					animals.add(cow);
					break;
				case Constants.Animals.Birds.Hawk:
					Animal hawk = new Hawk(2.5, 0.25);
					hawk.decodeFromXml(element);
					animals.add(hawk);
					break;
				case Constants.Animals.Reptiles.Lizard:
					Animal lizard = new Lizard(1.25, 0.05);
					lizard.decodeFromXml(element);
					animals.add(lizard);
					break;
				case Constants.Animals.Mamals.Monkey:
					Animal monkey = new Monkey(2.5, 0.35);
					monkey.decodeFromXml(element);
					animals.add(monkey);
					break;
				case Constants.Animals.Birds.Owl:
					Animal owl = new Owl(0.5, 0.1);
					owl.decodeFromXml(element);
					animals.add(owl);
					break;
				case Constants.Animals.Aquatics.SeaHorse:
					Animal seaHorse = new SeaHorse(1, 0.01);
					seaHorse.decodeFromXml(element);
					animals.add(seaHorse);
					break;
				case Constants.Animals.Aquatics.Shark:
					Animal shark = new Shark(1, 0.7);
					shark.decodeFromXml(element);
					animals.add(shark);
					break;
				case Constants.Animals.Reptiles.Snake:
					Animal snake = new Snake(2, 0.5);
					snake.decodeFromXml(element);
					animals.add(snake);
					break;
				case Constants.Animals.Insects.Spider:
					Animal spider = new Spider(0.5, 0.5);
					spider.decodeFromXml(element);
					animals.add(spider);
					break;
				case Constants.Animals.Birds.Stork:
					Animal stork = new Stork(2, 0.02);
					stork.decodeFromXml(element);
					animals.add(stork);
					break;
				case Constants.Animals.Mamals.Tiger:
					Animal tiger = new Tiger(2.5, 0.7);
					tiger.decodeFromXml(element);
					animals.add(tiger);
					break;
				case Constants.Animals.Reptiles.Turtle:
					Animal turtle = new Turtle(1, 0.1);
					turtle.decodeFromXml(element);
					animals.add(turtle);
					break;
				default: 
					break;
				}
			}
		}
		
		return animals;
		
	}

	@Override
	public Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Animals.Insects.Butterfly:
			Animal butterfly = new Butterfly(0.5, 0.0);
			butterfly.decodeFromXml(element);
			return butterfly;
		case Constants.Animals.Aquatics.Cancer:
			Animal cancer = new Cancer(1.25, 0.3);
			cancer.decodeFromXml(element);
			return cancer;
		case Constants.Animals.Insects.Cockroach:
			Animal cockroach = new Cockroach(0.0, 0.0);
			cockroach.decodeFromXml(element);
			return cockroach;
		case Constants.Animals.Mamals.Cow:
			Animal cow = new Cow(4.5, 0.1);
			cow.decodeFromXml(element);
			return cow;
		case Constants.Animals.Birds.Hawk:
			Animal hawk = new Hawk(2.5, 0.25);
			hawk.decodeFromXml(element);
			return hawk;
		case Constants.Animals.Reptiles.Lizard:
			Animal lizard = new Lizard(1.25, 0.05);
			lizard.decodeFromXml(element);
			return lizard;
		case Constants.Animals.Mamals.Monkey:
			Animal monkey = new Monkey(2.5, 0.35);
			monkey.decodeFromXml(element);
			return monkey;
		case Constants.Animals.Birds.Owl:
			Animal owl = new Owl(0.5, 0.1);
			owl.decodeFromXml(element);
			return owl;
		case Constants.Animals.Aquatics.SeaHorse:
			Animal seaHorse = new SeaHorse(1, 0.01);
			seaHorse.decodeFromXml(element);
			return seaHorse;
		case Constants.Animals.Aquatics.Shark:
			Animal shark = new Shark(1, 0.7);
			shark.decodeFromXml(element);
			return shark;
		case Constants.Animals.Reptiles.Snake:
			Animal snake = new Snake(2, 0.5);
			snake.decodeFromXml(element);
			return snake;
		case Constants.Animals.Insects.Spider:
			Animal spider = new Spider(0.5, 0.5);
			spider.decodeFromXml(element);
			return spider;
		case Constants.Animals.Birds.Stork:
			Animal stork = new Stork(2, 0.02);
			stork.decodeFromXml(element);
			return stork;
		case Constants.Animals.Mamals.Tiger:
			Animal tiger = new Tiger(2.5, 0.7);
			tiger.decodeFromXml(element);
			return tiger;
		case Constants.Animals.Reptiles.Turtle:
			Animal turtle = new Turtle(1, 0.1);
			turtle.decodeFromXml(element);
			return turtle;
		default: 
			break;
		}
		
		return null;
	}
	

}
