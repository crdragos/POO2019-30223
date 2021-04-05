package javasmmr.zoowsome.views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.lang.reflect.*;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;

import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals.Aquatics;
import javasmmr.zoowsome.services.factories.Constants.Animals.Birds;
import javasmmr.zoowsome.services.factories.Constants.Animals.Insects;
import javasmmr.zoowsome.services.factories.Constants.Animals.Mammals;
import javasmmr.zoowsome.services.factories.Constants.Animals.Reptiles;

public class AddFrame extends ZooFrame {

	private static final long serialVersionUID = 1L;

	private static JPanel creationPanel;
	private static JPanel subtypePanel;
	private static JPanel jp;
	private JButton addAnimal;
	private JButton addEmployee;
	private static JButton addToXML;
	private static JComboBox<String> animalTypeSelection;

	private static Map<Integer, JTextField> fieldMap = new HashMap<Integer, JTextField>();

	public AddFrame(String title) {
		super(title);

		contentPanel.setLayout(new GridLayout(0, 3));

		creationPanel = new JPanel();
		subtypePanel = new JPanel();

		jp = new JPanel();
		animalTypeSelection = new JComboBox<String>();
		addToXML = new JButton("Add");

		contentPanel.add(creationPanel);

		SpringLayout slPanel = new SpringLayout();
		creationPanel.setLayout(slPanel);

		JLabel chooseText = new JLabel("Choose what do you want to add:");

		slPanel.putConstraint(SpringLayout.VERTICAL_CENTER, chooseText, -100, SpringLayout.VERTICAL_CENTER,
				creationPanel);
		slPanel.putConstraint(SpringLayout.HORIZONTAL_CENTER, chooseText, 0, SpringLayout.HORIZONTAL_CENTER,
				creationPanel);
		creationPanel.add(chooseText);

		addAnimal = new JButton("Add animal");

		slPanel.putConstraint(SpringLayout.VERTICAL_CENTER, addAnimal, -50, SpringLayout.VERTICAL_CENTER,
				creationPanel);
		slPanel.putConstraint(SpringLayout.HORIZONTAL_CENTER, addAnimal, 0, SpringLayout.HORIZONTAL_CENTER,
				creationPanel);
		creationPanel.add(addAnimal);

		addEmployee = new JButton("Add Employee");

		slPanel.putConstraint(SpringLayout.VERTICAL_CENTER, addEmployee, 50, SpringLayout.VERTICAL_CENTER,
				creationPanel);
		slPanel.putConstraint(SpringLayout.HORIZONTAL_CENTER, addEmployee, 0, SpringLayout.HORIZONTAL_CENTER,
				creationPanel);
		creationPanel.add(addEmployee);

	}

	public static JPanel makeBPanel(Class<JTextField> clazz, Class<?> klass) {
		jp.removeAll();
		jp.revalidate();
		jp.repaint();

		jp.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.insets = new Insets(10, 10, 10, 10);

		String title = klass.getName();
		title = title.substring(title.lastIndexOf('.') + 1);

		Field[] fields = null;
		animalTypeSelection.removeAllItems();

		switch (title) {
		case "Mammal":
			Class<Mammals> mammals = Constants.Animals.Mammals.class;
			fields = mammals.getFields();
			break;
		case "Bird":
			Class<Birds> birds = Constants.Animals.Birds.class;
			fields = birds.getFields();
			break;
		case "Insect":
			Class<Insects> insects = Constants.Animals.Insects.class;
			fields = insects.getFields();
			break;
		case "Reptile":
			Class<Reptiles> reptiles = Constants.Animals.Reptiles.class;
			fields = reptiles.getFields();
			break;
		case "Aquatic":
			Class<Aquatics> aquatics = Constants.Animals.Aquatics.class;
			fields = aquatics.getFields();
			break;
		default:
			break;
		}

		for (Field nameField : fields)
			animalTypeSelection.addItem(nameField.getName());
		jp.add(animalTypeSelection, gbc);

		jp.setBorder(new TitledBorder(title));

		int index = 0;
		try {

			Field[] localFields = klass.getDeclaredFields();
			Field[] superFields = klass.getSuperclass().getDeclaredFields();
			for (int i = 0; i < superFields.length; i++) {
				final JTextField ab = new JTextField(20);
				JLabel description = new JLabel(superFields[i].getName());
				jp.add(description, gbc);
				jp.add(ab, gbc);
				fieldMap.put(index++, ab);
			}
			for (int i = 0; i < localFields.length; i++) {
				final JTextField ab = new JTextField(20);
				JLabel description = new JLabel(localFields[i].getName());
				jp.add(description, gbc);
				jp.add(ab, gbc);
				fieldMap.put(index++, ab);
			}

			jp.add(addToXML);

		} catch (Exception ex) {
			System.err.println("Can't create " + clazz);
		}

		return jp;
	}

	public void setAddAnimalActionListener(ActionListener al) {
		this.addAnimal.addActionListener(al);
	}

	public void setAddEmployeeActionListener(ActionListener al) {
		this.addEmployee.addActionListener(al);
	}

	public void setAddToXMLActionListener(ActionListener al) {
		addToXML.addActionListener(al);
	}

	public static JPanel getContentPanel() {
		return contentPanel;
	}

	public static JPanel getSubtypePanel() {
		return subtypePanel;
	}

	public static JPanel getCreationPanel() {
		return jp;
	}

	public static Map<Integer, JTextField> getMap() {
		return fieldMap;
	}

	public static String getAnimalClass() {
		return animalTypeSelection.getSelectedItem().toString();
	}
}
