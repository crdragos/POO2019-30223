package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class ReptileFrame extends ZooFrame {
	
	private JButton btnLizard;
	private JButton btnSnake;
	private JButton btnTurtle;
	
	public ReptileFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnLizard = new JButton("Lizard");   
		slPanel.putConstraint(SpringLayout.NORTH, btnLizard, 120, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnLizard, 55, SpringLayout.WEST, pan);   
		pan.add(btnLizard);
		
		btnSnake = new JButton("Snake");   
		slPanel.putConstraint(SpringLayout.NORTH, btnSnake, 160, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnSnake, 55, SpringLayout.WEST, pan);   
		pan.add(btnSnake); 
		 
		btnTurtle = new JButton("Turtle");   
		slPanel.putConstraint(SpringLayout.NORTH, btnTurtle, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnTurtle, 55, SpringLayout.WEST, pan);   
		pan.add(btnTurtle); 
		 
		JPanel panel_2 = new JPanel();   
		contentPanel.add(panel_2);   
		setVisible(true);
	}
	
	public void setMammalButtonActionListener(ActionListener a) {
		btnLizard.addActionListener(a);
	}
	
	public void setAquaticButtonActionListener(ActionListener a) {
		btnSnake.addActionListener(a);
	}
	
	public void setInsectButtonActionListener(ActionListener a) {
		btnTurtle.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

}
