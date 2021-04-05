package javasmmr.zoowsome.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class MainMenuFrame extends ZooFrame {

	private static final long serialVersionUID = 1L;

	private JButton btnAdd;
	private JButton btnList;
	private JButton btnSaveAndExit;

	public MainMenuFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(168, 248, 180));
		contentPanel.add(panel);

		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		pan.setBackground(new Color(168, 248, 180));
		
		JLabel headText = new JLabel("Zoowsome");
		headText.setFont(new Font("Comic Sans MS", Font.BOLD, 70));
		slPanel.putConstraint(SpringLayout.VERTICAL_CENTER, headText, -300, SpringLayout.VERTICAL_CENTER, pan);
		slPanel.putConstraint(SpringLayout.HORIZONTAL_CENTER, headText, 0, SpringLayout.HORIZONTAL_CENTER, pan);
		pan.add(headText);

		btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		btnAdd.setBackground(new Color(168, 248, 180));
		btnAdd.setForeground(Color.LIGHT_GRAY);
		ImageIcon addImage = new ImageIcon("icons/add.png");
		Image img = addImage.getImage();
		Image newImg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		addImage = new ImageIcon(newImg);
		btnAdd.setIcon(addImage);
		slPanel.putConstraint(SpringLayout.VERTICAL_CENTER, btnAdd, -100, SpringLayout.VERTICAL_CENTER, pan);
		slPanel.putConstraint(SpringLayout.HORIZONTAL_CENTER, btnAdd, 0, SpringLayout.HORIZONTAL_CENTER, pan);
		pan.add(btnAdd);

		btnList = new JButton("List");
		btnList.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		btnList.setBackground(new Color(168, 248, 180));
		btnList.setForeground(Color.LIGHT_GRAY);
		addImage = new ImageIcon("icons/list.png");
		img = addImage.getImage();
		newImg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		addImage = new ImageIcon(newImg);
		btnList.setIcon(addImage);
		slPanel.putConstraint(SpringLayout.VERTICAL_CENTER, btnList, 0, SpringLayout.VERTICAL_CENTER, pan);
		slPanel.putConstraint(SpringLayout.HORIZONTAL_CENTER, btnList, 0, SpringLayout.HORIZONTAL_CENTER, pan);
		pan.add(btnList);

		btnSaveAndExit = new JButton("Save and Exit");
		btnSaveAndExit.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
		btnSaveAndExit.setBackground(new Color(168, 248, 180));
		btnSaveAndExit.setForeground(Color.LIGHT_GRAY);
		addImage = new ImageIcon("icons/exit.png");
		img = addImage.getImage();
		newImg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		addImage = new ImageIcon(newImg);
		btnSaveAndExit.setIcon(addImage);
		slPanel.putConstraint(SpringLayout.VERTICAL_CENTER, btnSaveAndExit, 100, SpringLayout.VERTICAL_CENTER, pan);
		slPanel.putConstraint(SpringLayout.HORIZONTAL_CENTER, btnSaveAndExit, 0, SpringLayout.HORIZONTAL_CENTER, pan);
		pan.add(btnSaveAndExit);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(168, 248, 180));
		contentPanel.add(panel_2);
		setVisible(true);
	}

	public void setAddButtonActionListener(ActionListener a) {
		btnAdd.addActionListener(a);
	}

	public void setListButtonActionListener(ActionListener a) {
		btnList.addActionListener(a);
	}

	public void setSaveAndExitButtonActionListener(ActionListener a) {
		btnSaveAndExit.addActionListener(a);
	}

}
