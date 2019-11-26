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
import javax.xml.stream.events.Characters;
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

public class AnimalRepository {
	
	private static final String XML_FILENAME = "Animals.xml";
	
	public AnimalRepository() {
		
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
				case Constants.Animals.Aquatics.Cancer:
					Animal cancer = new Cancer(1.25, 0.3);
					cancer.decodeFromXml(element);
					animals.add(cancer);
				case Constants.Animals.Insects.Cockroach:
					Animal cockroach = new Cockroach(0.0, 0.0);
					cockroach.decodeFromXml(element);
					animals.add(cockroach);
				case Constants.Animals.Mamals.Cow:
					Animal cow = new Cow(4.5, 0.1);
					cow.decodeFromXml(element);
					animals.add(cow);
				case Constants.Animals.Birds.Hawk:
					Animal hawk = new Hawk(2.5, 0.25);
					hawk.decodeFromXml(element);
					animals.add(hawk);
				case Constants.Animals.Reptiles.Lizard:
					Animal lizard = new Lizard(1.25, 0.05);
					lizard.decodeFromXml(element);
					animals.add(lizard);
				case Constants.Animals.Mamals.Monkey:
					Animal monkey = new Monkey(2.5, 0.35);
					monkey.decodeFromXml(element);
					animals.add(monkey);
				case Constants.Animals.Birds.Owl:
					Animal owl = new Owl(0.5, 0.1);
					owl.decodeFromXml(element);
					animals.add(owl);
				case Constants.Animals.Aquatics.SeaHorse:
					Animal seaHorse = new SeaHorse(1, 0.01);
					seaHorse.decodeFromXml(element);
					animals.add(seaHorse);
				case Constants.Animals.Aquatics.Shark:
					Animal shark = new Shark(1, 0.7);
					shark.decodeFromXml(element);
					animals.add(shark);
				case Constants.Animals.Reptiles.Snake:
					Animal snake = new Snake(2, 0.5);
					snake.decodeFromXml(element);
					animals.add(snake);
				case Constants.Animals.Insects.Spider:
					Animal spider = new Spider(0.5, 0.5);
					spider.decodeFromXml(element);
					animals.add(spider);
				case Constants.Animals.Birds.Stork:
					Animal stork = new Stork(2, 0.02);
					stork.decodeFromXml(element);
					animals.add(stork);
				case Constants.Animals.Mamals.Tiger:
					Animal tiger = new Tiger(2.5, 0.7);
					tiger.decodeFromXml(element);
					animals.add(tiger);
				case Constants.Animals.Reptiles.Turtle:
					Animal turtle = new Turtle(1, 0.1);
					turtle.decodeFromXml(element);
					animals.add(turtle);
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
		
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
	

}
