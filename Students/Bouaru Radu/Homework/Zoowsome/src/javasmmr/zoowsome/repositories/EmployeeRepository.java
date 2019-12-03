package javasmmr.zoowsome.repositories;

import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.Constants;

public class EmployeeRepository extends EntityRepository<Employee> {
	private static final String XML_FILENAME = "Employees.xml";

	public EmployeeRepository() throws ParserConfigurationException {
		super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
	}
	@Override
	protected Employee getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();

		switch (discriminant) {
		case Constants.EmployeeTypes.Caretaker:
			Employee newCaretaker = new Caretaker();
			newCaretaker.decodeFromXml(element);
			return newCaretaker;
		default:
			break;
		}
		return null;
	}
}
