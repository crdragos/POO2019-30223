package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AnimalFrame extends ZooFrame {
	
	private JButton btnMammal;
	private JButton btnAquatic;
	private JButton btnInsect;
	private JButton btnReptile;
	private JButton btnBird;
	
	public AnimalFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnMammal = new JButton("Mammal");   
		slPanel.putConstraint(SpringLayout.NORTH, btnMammal, 40, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnMammal, 90, SpringLayout.WEST, pan);   
		pan.add(btnMammal);
		
		btnAquatic = new JButton("Aquatic");   
		slPanel.putConstraint(SpringLayout.NORTH, btnAquatic, 80, SpringLayout.NORTH, pan);   
		slPanel.putConstraint(SpringLayout.WEST, btnAquatic, 90, SpringLayout.WEST, pan);   
		pan.add(btnAquatic); 
		 
		btnInsect = new JButton("Insect");   
		slPanel.putConstraint(SpringLayout.NORTH, btnInsect, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnInsect, 90, SpringLayout.WEST, pan);   
		pan.add(btnInsect); 
		
		btnReptile = new JButton("Reptile");   
		slPanel.putConstraint(SpringLayout.NORTH, btnReptile, 160, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnReptile, 90, SpringLayout.WEST, pan);   
		pan.add(btnReptile); 
		
		btnBird = new JButton("Bird");   
		slPanel.putConstraint(SpringLayout.NORTH, btnBird, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnBird, 90, SpringLayout.WEST, pan);   
		pan.add(btnBird); 
		 
		JPanel panel_2 = new JPanel();   
		contentPanel.add(panel_2);   
		setVisible(true);
	}
	
	public void setMammalButtonActionListener(ActionListener a) {
		btnMammal.addActionListener(a);
	}
	
	public void setAquaticButtonActionListener(ActionListener a) {
		btnAquatic.addActionListener(a);
	}
	
	public void setInsectButtonActionListener(ActionListener a) {
		btnInsect.addActionListener(a);
	}
	
	public void setReptileButtonActionListener(ActionListener a) {
		btnReptile.addActionListener(a);
	}
	
	public void setBirdButtonActionListener(ActionListener a) {
		btnBird.addActionListener(a);
	}

	@Override
	public void goBack() {
	}

}
