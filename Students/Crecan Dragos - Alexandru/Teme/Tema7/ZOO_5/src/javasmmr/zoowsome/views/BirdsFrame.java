package javasmmr.zoowsome.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BirdsFrame extends ZooFrame {

    private JButton hawkBtn;
    private JButton owlBtn;
    private JButton storkBtn;

    public BirdsFrame(String title) {
        super(title);

        contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.YELLOW);
        contentPanel.add(leftPanel);

        SpringLayout springLayout = new SpringLayout();

        JPanel centralPanel = new JPanel();
        centralPanel.setBackground(Color.YELLOW);
        centralPanel.setLayout(springLayout);

        hawkBtn = new JButton("Hawk");
        springLayout.putConstraint(SpringLayout.NORTH, hawkBtn, 140, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, hawkBtn,85, SpringLayout.WEST, centralPanel);
        centralPanel.add(hawkBtn);

        owlBtn = new JButton("Owl");
        springLayout.putConstraint(SpringLayout.NORTH, owlBtn, 190, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, owlBtn, 85, SpringLayout.WEST, centralPanel);
        centralPanel.add(owlBtn);

        storkBtn = new JButton("Stork");
        springLayout.putConstraint(SpringLayout.NORTH, storkBtn, 240, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, storkBtn, 85, SpringLayout.WEST, centralPanel);
        centralPanel.add(storkBtn);

        contentPanel.add(centralPanel);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.YELLOW);
        contentPanel.add(rightPanel);

        setVisible(true);
    }

    public void setHawkBtnActionListener(ActionListener hawkBtnActionListener) {
        hawkBtn.addActionListener(hawkBtnActionListener);
    }

    public void setOwlBtnActionListener(ActionListener owlBtnActionListener) {
        owlBtn.addActionListener(owlBtnActionListener);
    }

    public void setStorkBtnActionListener(ActionListener storkBtnActionListener) {
        storkBtn.addActionListener(storkBtnActionListener);
    }
}
