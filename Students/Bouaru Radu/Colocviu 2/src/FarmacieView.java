import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class FarmacieView extends JFrame{
	
	private JPanel contentPanel;

	public FarmacieView() {
		this.setTitle("Simulare farmacie");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(650, 650));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		contentPanel = new JPanel();
		SpringLayout slPanel = new SpringLayout();
		contentPanel.setLayout(slPanel);
		contentPanel.setBackground(new Color(230, 230, 250));

		this.add(contentPanel);
		JButton newButton = new JButton("Click me for sort!");
		slPanel.putConstraint(SpringLayout.VERTICAL_CENTER,newButton, -20, SpringLayout.VERTICAL_CENTER,
				contentPanel);
		slPanel.putConstraint(SpringLayout.HORIZONTAL_CENTER, newButton, 10, SpringLayout.HORIZONTAL_CENTER, contentPanel);
		
		newButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "When you try your best but you don't succeed \r\n" + 
						"When you get what you want but not what you need \r\n" + 
						"When you feel so tired but you can't sleep ");				
			}			
		});
		contentPanel.add(newButton, BorderLayout.NORTH);
		

	}
}
