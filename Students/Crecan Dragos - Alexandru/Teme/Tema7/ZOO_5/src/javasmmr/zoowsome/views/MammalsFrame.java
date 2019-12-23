package javasmmr.zoowsome.views;

import javasmmr.zoowsome.controllers.AbstractController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MammalsFrame extends ZooFrame {

    private JButton cowBtn;
    private JButton monkeyBtn;
    private JButton tigerBtn;

    public MammalsFrame(String title) {
        super(title);

        contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.YELLOW);
        contentPanel.add(leftPanel);

        JPanel centralPanel = new JPanel();
        centralPanel.setBackground(Color.YELLOW);
        contentPanel.add(centralPanel);

        SpringLayout springLayout = new SpringLayout();
        centralPanel.setLayout(springLayout);

        cowBtn = new JButton("Cow");
        springLayout.putConstraint(SpringLayout.NORTH, cowBtn, 150, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, cowBtn, 85, SpringLayout.WEST, centralPanel);
        centralPanel.add(cowBtn);

        monkeyBtn = new JButton("Monkey");
        springLayout.putConstraint(SpringLayout.NORTH, monkeyBtn, 220, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, monkeyBtn, 85, SpringLayout.WEST, centralPanel);
        centralPanel.add(monkeyBtn);

        tigerBtn = new JButton("Tiger");
        springLayout.putConstraint(SpringLayout.NORTH, tigerBtn, 290, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, tigerBtn, 85, SpringLayout.WEST, centralPanel);
        centralPanel.add(tigerBtn);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.YELLOW);
        contentPanel.add(rightPanel);

        setVisible(true);
    }

    public void setCowBtnActionListener(ActionListener cowBtnActionListener) {
        cowBtn.addActionListener(cowBtnActionListener);
    }

    public void setMonkeyBtnActionListener(ActionListener monkeyBtnActionListener) {
        monkeyBtn.addActionListener(monkeyBtnActionListener);
    }

    public void setTigerBtnActionListener(ActionListener tigerBtnActionListener) {
        tigerBtn.addActionListener(tigerBtnActionListener);
    }
}
