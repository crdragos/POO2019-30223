package javasmmr.zoowsome.controllers;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Aquatic;
import javasmmr.zoowsome.models.animals.Bird;
import javasmmr.zoowsome.models.animals.Insect;
import javasmmr.zoowsome.models.animals.Mammal;
import javasmmr.zoowsome.models.animals.Reptile;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.views.AddFrame;

public class AddController extends AbstractController {

	private JPanel contentPanel = AddFrame.getContentPanel();
	private JPanel subtypePanel = AddFrame.getSubtypePanel();
	private JPanel jp = AddFrame.getCreationPanel();
	private Map<Integer, JTextField> fieldMap = AddFrame.getMap();
	
	public AddController(AddFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setAddAnimalActionListener(new addAnimalActionListener());
		frame.setAddEmployeeActionListener(new addEmployeeActionListener());
		frame.setAddToXMLActionListener(new addToXMLActionListener());

	}

	private class addAnimalActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			contentPanel.remove(jp);
			contentPanel.revalidate();
			contentPanel.repaint();

			subtypePanel.setLayout(new GridBagLayout());

			GridBagConstraints gbc = new GridBagConstraints();
			gbc.gridwidth = GridBagConstraints.REMAINDER;
			gbc.insets = new Insets(10, 10, 10, 10);

			String[] buttonText = { "Add mammal", "Add aquatic", "Add bird", "Add insect", "Add reptile" };

			subtypePanel.removeAll();

			for (int i = 0; i < buttonText.length; i++) {
				JButton newButton = new JButton(buttonText[i]);
				newButton.addActionListener(new dynamicButtonActionEvent());
				subtypePanel.add(newButton, gbc);
				contentPanel.add(subtypePanel);
			}

			subtypePanel.revalidate();
			subtypePanel.repaint();
		}
	}

	private class addEmployeeActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			contentPanel.remove(jp);
			contentPanel.revalidate();
			contentPanel.repaint();

			subtypePanel.setLayout(new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.gridwidth = GridBagConstraints.REMAINDER;
			gbc.insets = new Insets(10, 10, 10, 10);

			String[] buttonText = { "Add caretaker" };

			subtypePanel.removeAll();

			for (int i = 0; i < buttonText.length; i++) {
				JButton newButton = new JButton(buttonText[i]);
				newButton.addActionListener(new dynamicButtonActionEvent());
				subtypePanel.add(newButton, gbc);
				contentPanel.add(subtypePanel);
			}

			subtypePanel.revalidate();
			subtypePanel.repaint();

		}
	}

	private class dynamicButtonActionEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Object source = e.getSource();
			if (source instanceof JButton) {
				JButton clicked = (JButton) source;
				switch (clicked.getText()) {
				case "Add mammal":
					AddFrame.getContentPanel().add(AddFrame.makeBPanel(JTextField.class, Mammal.class));
					break;
				case "Add aquatic":
					AddFrame.getContentPanel().add(AddFrame.makeBPanel(JTextField.class, Aquatic.class));
					break;
				case "Add bird":
					AddFrame.getContentPanel().add(AddFrame.makeBPanel(JTextField.class, Bird.class));
					break;
				case "Add insect":
					AddFrame.getContentPanel().add(AddFrame.makeBPanel(JTextField.class, Insect.class));
					break;
				case "Add reptile":
					AddFrame.getContentPanel().add(AddFrame.makeBPanel(JTextField.class, Reptile.class));
					break;
				case "Add caretaker":
					AddFrame.getContentPanel().add(AddFrame.makeBPanel(JTextField.class, Caretaker.class));
					break;
				}
			}
		}
	}

	private class addToXMLActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				AnimalRepository newAnimalRepository = new AnimalRepository();
				ArrayList<Animal> newInsertion = new ArrayList<Animal>();
				newInsertion = newAnimalRepository.load();
				for (int i = 0; i < fieldMap.size(); i++) {
					JTextField dummy = fieldMap.get(i);
					if (dummy.getText() == "") {
						JOptionPane.showMessageDialog(null, "Empty field, cannot add");
						return;
					}
				}

				String animalType = AddFrame.getAnimalClass();
				Class<?> newClass = Class.forName("javasmmr.zoowsome.models.animals." + animalType);
				Constructor<?> newClassConstructor = newClass.getConstructor();
				Object object = newClassConstructor.newInstance();
				newInsertion.add((Animal) object);

				newAnimalRepository.save(newInsertion);

			} catch (ParserConfigurationException | XMLStreamException | SAXException | IOException
					| ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
					| IllegalAccessException | IllegalArgumentException | InvocationTargetException e1) {

				e1.printStackTrace();
			}
		}

	}
}
