package javasmmr.zoowsome.models.employees;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import java.math.BigDecimal;
import java.util.ArrayList;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

public abstract class Employee implements XML_Parsable {
    private String name;
    private Long ID;
    private BigDecimal salary;
    private Boolean isDead;
    private ArrayList<Long> employeesID = new ArrayList<Long>();

    public Employee() {
        this.name = "Angajat nou";
        this.ID = (long) (Math.random() * 10000000 * 1000000);
        this.salary = new BigDecimal(1987);
        this.isDead = false;
    }

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.ID = (long) (Math.random() * 10000000 * 1000000);
        this.salary = new BigDecimal(1987);
        this.isDead = false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getID() {
        return this.ID;
    }

    public void setID() {
        this.ID = (long) (Math.random() * 10000000 * 1000000);
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Boolean getIsDead() {
        return this.isDead;
    }

    public void setIsDead(Boolean isDead) {
        this.isDead = isDead;
    }

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        createNode(eventWriter, "name", String.valueOf(this.name));
        createNode(eventWriter, "ID", String.valueOf(this.ID));
        createNode(eventWriter, "salary", String.valueOf(this.salary));
        createNode(eventWriter, "isDead", String.valueOf(this.isDead));
    }

    public void decodeFromXml(Element element) {
        setName(element.getElementsByTagName("name").item(0).getTextContent());
        //setID(Long.valueOf(element.getElementsByTagName("ID").item(0).getTextContent()));
        setSalary(BigDecimal.valueOf(Long.parseLong(element.getElementsByTagName("salary").item(0).getTextContent())));
        setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
    }

}
