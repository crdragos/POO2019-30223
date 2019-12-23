package javasmmr.zoowsome.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AddFrame extends ZooFrame {

    private JButton animalsBtn;
    private JButton employeesBtn;

    public AddFrame(String title) {
        super(title);

        contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

        JPanel panelStanga = new JPanel();
        panelStanga.setBackground(Color.yellow);
        contentPanel.add(panelStanga);

        JPanel panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        contentPanel.add(panel);

        SpringLayout springLayout = new SpringLayout();
        panel.setLayout(springLayout);

        animalsBtn = new JButton("Animals");
        springLayout.putConstraint(SpringLayout.NORTH, animalsBtn, 150, SpringLayout.NORTH, panel);
        springLayout.putConstraint(SpringLayout.WEST, animalsBtn, 75, SpringLayout.WEST, panel);
        panel.add(animalsBtn);

        employeesBtn = new JButton("Employees");
        springLayout.putConstraint(SpringLayout.NORTH, employeesBtn, 225, SpringLayout.NORTH, panel);
        springLayout.putConstraint(SpringLayout.WEST, employeesBtn, 75, SpringLayout.WEST, panel);
        panel.add(employeesBtn);

        JPanel panelDreapta = new JPanel();
        panelDreapta.setBackground(Color.yellow);
        contentPanel.add(panelDreapta);

        setVisible(true);
    }

    public void setAnimalsBtnActionListener(ActionListener animalsBtnActionListener) {
        animalsBtn.addActionListener(animalsBtnActionListener);
    }

    public void setEmployeesBtnActionListener(ActionListener employeesBtnActionListener) {
        employeesBtn.addActionListener(employeesBtnActionListener);
    }
}
