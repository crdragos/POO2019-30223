package javasmmr.zoowsome.views;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;

public class ListFrame extends ZooFrame {

	private static final long serialVersionUID = 1L;

	public ListFrame(String title) throws ParserConfigurationException, SAXException, IOException {
		super(title);
		contentPanel.setLayout(new GridLayout(1,1));
		
		JPanel newPanel = new JPanel(new GridLayout(1, 1));
		JTable animals_table = new JTable();
		JTable employee_table = new JTable();
		JScrollPane animals_scroll = new JScrollPane(animals_table);
		JScrollPane employee_scroll = new JScrollPane(employee_table);

		DefaultTableModel animal_model = new DefaultTableModel();
		DefaultTableModel employee_model = new DefaultTableModel();

		String[] animal_headers = {"Type", "Name", "Danger%", "Hours/$", "# legs" };
		String[] employee_headers = { "Name", "Salary", "Status" };
		animal_model.setColumnIdentifiers(animal_headers);
		employee_model.setColumnIdentifiers(employee_headers);

		animals_table.setDefaultEditor(Object.class, null);
		employee_table.setDefaultEditor(Object.class, null);
		
		animals_table.getTableHeader().setFont(new Font("Verdana", Font.PLAIN, 15));
		employee_table.getTableHeader().setFont(new Font("Verdana", Font.PLAIN, 15));
		
		animals_table.setFont(new Font("Verdana", Font.PLAIN, 15));
		employee_table.setFont(new Font("Verdana", Font.PLAIN, 15));
	

		AnimalRepository animalRepository = new AnimalRepository();
		ArrayList<Animal> zooAnimals = animalRepository.load();
		Object rowData[] = new Object[5];
		for (int i = 0; i < zooAnimals.size(); i++) {
			rowData[0] = zooAnimals.get(i).getClass().getName().substring(33);
			rowData[1] = zooAnimals.get(i).getName();
			rowData[2] = zooAnimals.get(i).getDangerPerc();
			rowData[3] = zooAnimals.get(i).getMaintenanceCost();
			if(zooAnimals.get(i).getNumberOfLegs() == 0)
			rowData[4] = "No legs";
			else
				rowData[4] = zooAnimals.get(i).getNumberOfLegs();
			animal_model.addRow(rowData);
		}
		
		EmployeeRepository employeeRepository = new EmployeeRepository();
		ArrayList<Employee> zooEmployees = employeeRepository.load();
		Object employeeRowData[] = new Object[3];
		for (int i = 0; i < zooEmployees.size(); i++) {
			employeeRowData[0] = zooEmployees.get(i).getName();
			employeeRowData[1] = zooEmployees.get(i).getSalary();
			if (zooEmployees.get(i).isDead())
				employeeRowData[2] = "Dead";
			else
				employeeRowData[2] = "Alive";
			employee_model.addRow(employeeRowData);
		}
			
		animals_table.setModel(animal_model);
		employee_table.setModel(employee_model);
		newPanel.add(animals_scroll, BorderLayout.NORTH);
		newPanel.add(employee_scroll, BorderLayout.SOUTH);

		contentPanel.add(newPanel);

	}

}
