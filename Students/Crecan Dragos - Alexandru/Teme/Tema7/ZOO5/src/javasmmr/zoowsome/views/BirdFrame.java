package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class BirdFrame extends ZooFrame{
	
	private JButton btnHawk;
	private JButton btnOwl;
	private JButton btnStork;
	
	public BirdFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnHawk = new JButton("Hawk");   
		slPanel.putConstraint(SpringLayout.NORTH, btnHawk, 120, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnHawk, 55, SpringLayout.WEST, pan);   
		pan.add(btnHawk);
		
		btnOwl = new JButton("Owl");   
		slPanel.putConstraint(SpringLayout.NORTH, btnOwl, 160, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnOwl, 55, SpringLayout.WEST, pan);   
		pan.add(btnOwl); 
		 
		btnStork = new JButton("Stork");   
		slPanel.putConstraint(SpringLayout.NORTH, btnStork, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnStork, 55, SpringLayout.WEST, pan);   
		pan.add(btnStork); 
		 
		JPanel panel_2 = new JPanel();   
		contentPanel.add(panel_2);   
		setVisible(true);
	}
	
	public void setMammalButtonActionListener(ActionListener a) {
		btnHawk.addActionListener(a);
	}
	
	public void setAquaticButtonActionListener(ActionListener a) {
		btnOwl.addActionListener(a);
	}
	
	public void setInsectButtonActionListener(ActionListener a) {
		btnStork.addActionListener(a);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

}
