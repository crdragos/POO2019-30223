package javasmmr.zoowsome.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class EmployeesFrame extends ZooFrame {

    private JButton caretakerBtn;
    private JButton investorBtn;
    private JButton managerBtn;

    public EmployeesFrame(String title) {
        super(title);

        contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.YELLOW);
        contentPanel.add(leftPanel);

        SpringLayout springLayout = new SpringLayout();

        JPanel centralPanel = new JPanel();
        centralPanel.setBackground(Color.YELLOW);
        centralPanel.setLayout(springLayout);

        caretakerBtn = new JButton("Caretaker");
        springLayout.putConstraint(SpringLayout.NORTH, caretakerBtn, 140, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, caretakerBtn, 85, SpringLayout.WEST, centralPanel);
        centralPanel.add(caretakerBtn);

        investorBtn = new JButton("Investor");
        springLayout.putConstraint(SpringLayout.NORTH, investorBtn, 190, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, investorBtn, 85, SpringLayout.WEST, centralPanel);
        centralPanel.add(investorBtn);

        managerBtn = new JButton("Manager");
        springLayout.putConstraint(SpringLayout.NORTH, managerBtn, 240, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, managerBtn, 85, SpringLayout.WEST, centralPanel);
        centralPanel.add(managerBtn);

        contentPanel.add(centralPanel);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.YELLOW);
        contentPanel.add(rightPanel);

        setVisible(true);
    }

    public void setCaretakerBtnActionListener(ActionListener caretakerBtnActionListener) {
        caretakerBtn.addActionListener(caretakerBtnActionListener);
    }
}
