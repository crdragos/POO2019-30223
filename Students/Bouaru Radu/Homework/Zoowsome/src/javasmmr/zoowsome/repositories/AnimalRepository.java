package javasmmr.zoowsome.repositories;

import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Dinosaur;
import javasmmr.zoowsome.models.animals.Gryphon;
import javasmmr.zoowsome.models.animals.MantaRay;
import javasmmr.zoowsome.models.animals.Mantis;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Peacock;
import javasmmr.zoowsome.models.animals.Phoenix;
import javasmmr.zoowsome.models.animals.Salmon;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Spiderman;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Tortoise;
import javasmmr.zoowsome.models.animals.Wasp;
import javasmmr.zoowsome.models.animals.Whale;
import javasmmr.zoowsome.services.factories.Constants;

public class AnimalRepository extends EntityRepository<Animal> {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() throws ParserConfigurationException {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}

	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Animals.Mammals.Cow:
			Animal newCow = new Cow();
			newCow.decodeFromXml(element);
			return newCow;
		case Constants.Animals.Mammals.Monkey:
			Animal newMonkey = new Monkey();
			newMonkey.decodeFromXml(element);
			return newMonkey;
		case Constants.Animals.Mammals.Tiger:
			Animal newTiger = new Tiger();
			newTiger.decodeFromXml(element);
			return newTiger;
		case Constants.Animals.Birds.Gryphon:
			Animal newGryphon = new Gryphon();
			newGryphon.decodeFromXml(element);
			return newGryphon;
		case Constants.Animals.Birds.Peacock:
			Animal newPeacock = new Peacock();
			newPeacock.decodeFromXml(element);
			return newPeacock;
		case Constants.Animals.Birds.Phoenix:
			Animal newPhoenix = new Phoenix();
			newPhoenix.decodeFromXml(element);
			return newPhoenix;
		case Constants.Animals.Insects.Mantis:
			Animal newMantis = new Mantis();
			newMantis.decodeFromXml(element);
			return newMantis;
		case Constants.Animals.Insects.SpiderMan:
			Animal newSpiderMan = new Spiderman();
			newSpiderMan.decodeFromXml(element);
			return newSpiderMan;
		case Constants.Animals.Insects.Wasp:
			Animal newWasp = new Wasp();
			newWasp.decodeFromXml(element);
			return newWasp;
		case Constants.Animals.Aquatics.MantaRay:
			Animal newMantaRay = new MantaRay();
			newMantaRay.decodeFromXml(element);
			return newMantaRay;
		case Constants.Animals.Aquatics.Salmon:
			Animal newSalmon = new Salmon();
			newSalmon.decodeFromXml(element);
			return newSalmon;
		case Constants.Animals.Aquatics.Whale:
			Animal newWhale = new Whale();
			newWhale.decodeFromXml(element);
			return newWhale;
		case Constants.Animals.Reptiles.Dinosaur:
			Animal newDinosaur = new Dinosaur();
			newDinosaur.decodeFromXml(element);
			return newDinosaur;
		case Constants.Animals.Reptiles.Snake:
			Animal newSnake = new Snake();
			newSnake.decodeFromXml(element);
			return newSnake;
		case Constants.Animals.Reptiles.Tortoise:
			Animal newTortoise = new Tortoise();
			newTortoise.decodeFromXml(element);
			return newTortoise;
		default:
			break;
		}
		return null;
	}

}
