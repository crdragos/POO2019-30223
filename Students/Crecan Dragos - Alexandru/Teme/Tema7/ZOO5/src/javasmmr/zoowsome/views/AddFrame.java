package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddFrame extends ZooFrame {

	private JButton btnAnimal;
	private JButton btnEmployee;
	
	public AddFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnAnimal = new JButton("Animal");   
		slPanel.putConstraint(SpringLayout.NORTH, btnAnimal, 150, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnAnimal, 55, SpringLayout.WEST, pan);   
		pan.add(btnAnimal);
		
		btnEmployee = new JButton("Employee");   
		slPanel.putConstraint(SpringLayout.NORTH, btnEmployee, 200, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnEmployee, 55, SpringLayout.WEST, pan);   
		pan.add(btnEmployee); 
		 
		JPanel panel_2 = new JPanel();   
		contentPanel.add(panel_2);   
		setVisible(true);
	}
	
	public void setAnimalButtonActionListener(ActionListener a) {
		btnAnimal.addActionListener(a);
	}
	
	public void setEmployeeButtonActionListener(ActionListener a) {
		btnEmployee.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

}
