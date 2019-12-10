package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AquaticFrame extends ZooFrame {

	private JButton btnCancer;
	private JButton btnSeaHorse;
	private JButton btnShark;
	
	public AquaticFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnCancer = new JButton("Cancer");   
		slPanel.putConstraint(SpringLayout.NORTH, btnCancer, 120, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnCancer, 55, SpringLayout.WEST, pan);   
		pan.add(btnCancer);
		
		btnSeaHorse = new JButton("SeaHorse");   
		slPanel.putConstraint(SpringLayout.NORTH, btnSeaHorse, 160, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnSeaHorse, 55, SpringLayout.WEST, pan);   
		pan.add(btnSeaHorse); 
		 
		btnShark = new JButton("Shark");   
		slPanel.putConstraint(SpringLayout.NORTH, btnShark, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnShark, 55, SpringLayout.WEST, pan);   
		pan.add(btnShark); 
		 
		JPanel panel_2 = new JPanel();   
		contentPanel.add(panel_2);   
		setVisible(true);
	}
	
	public void setMammalButtonActionListener(ActionListener a) {
		btnCancer.addActionListener(a);
	}
	
	public void setAquaticButtonActionListener(ActionListener a) {
		btnSeaHorse.addActionListener(a);
	}
	
	public void setInsectButtonActionListener(ActionListener a) {
		btnShark.addActionListener(a);
	}
	
	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

}
