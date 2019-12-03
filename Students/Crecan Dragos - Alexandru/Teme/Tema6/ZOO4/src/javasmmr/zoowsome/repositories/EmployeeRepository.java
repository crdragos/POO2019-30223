package javasmmr.zoowsome.repositories;

import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.models.employees.Investors;
import javasmmr.zoowsome.models.employees.Manager;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
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

public class EmployeeRepository extends EntityRepository<Employee> {
    public static final String XML_FILENAME = "Employee.xml";

    public EmployeeRepository() {
    	super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
    }

    public void save(ArrayList<Employee> employees) throws FileNotFoundException, XMLStreamException {
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
        
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        
        XMLEvent end = eventFactory.createDTD("\n");
        
        StartDocument startDocument = eventFactory.createStartDocument();
        eventWriter.add(startDocument);
        
        StartElement configStartElement = eventFactory.createStartElement("", "", "content");
        eventWriter.add(configStartElement);
        eventWriter.add(end);

        for(XML_Parsable employee : employees) {
            StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.EMPLOYEE);
            eventWriter.add(sElement);
            eventWriter.add(end);

            employee.encodeToXml(eventWriter);

            EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.EMPLOYEE);
            eventWriter.add(eElement);
            eventWriter.add(end);
        }

        eventWriter.add(eventFactory.createEndElement("", "", "content"));
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }
    public ArrayList<Employee> load() throws ParserConfigurationException, SAXException, IOException {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        File fXmlFile = new File(XML_FILENAME);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();

        NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.EMPLOYEE);

        for (int i = 0; i < nodeList.getLength(); i++){
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) node;
                String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();

                switch (discriminant){
                    case Constants.Employees.Caretaker:
                        Employee caretaker = new Caretaker();
                        caretaker.decodeFromXml(element);
                        employees.add(caretaker);
                        break;
                    case Constants.Employees.Investor:
                    	Employee investor = new Investors();
                    	investor.decodeFromXml(element);
                    	employees.add(investor);
                    	break;
                    case Constants.Employees.Manager:
                    	Employee manager = new Manager();
                    	manager.decodeFromXml(element);
                    	employees.add(manager);
                    default:
                        break;
                }
            }
        }
        
        return employees;
    }

	@Override
	public Employee getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Employees.Caretaker:
			Employee caretaker = new Caretaker();
			caretaker.decodeFromXml(element);
			return caretaker;
		case Constants.Employees.Investor:
			Employee investor = new Investors();
			investor.decodeFromXml(element);
			return investor;
		case Constants.Employees.Manager:
			Employee manager = new Manager();
			manager.decodeFromXml(element);
			return manager;
		default:
			break;
		}
		
		return null;
	}
}