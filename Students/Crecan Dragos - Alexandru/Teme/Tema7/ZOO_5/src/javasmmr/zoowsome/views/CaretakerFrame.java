package javasmmr.zoowsome.views;

import javax.swing.*;
import java.awt.*;

public class CaretakerFrame extends ZooFrame {

    private JTextField nameTF;
    private JTextField idTF;
    private JTextField salaryTF;
    private JTextField isDeadTF;
    private JTextField workingHoursTF;
    private JButton submitBtn;

    public CaretakerFrame(String title) {
        super(title);

        contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.YELLOW);
        leftPanel.setPreferredSize(new Dimension(50, 500));
        contentPanel.add(leftPanel);

        SpringLayout springLayout = new SpringLayout();

        JPanel centralPanel = new JPanel();
        centralPanel.setBackground(Color.YELLOW);
        centralPanel.setPreferredSize(new Dimension(600, 500));
        centralPanel.setLayout(springLayout);

        JLabel titleLB = new JLabel("New Caretaker");
        springLayout.putConstraint(SpringLayout.NORTH, titleLB, 60, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, titleLB, 100, SpringLayout.WEST, centralPanel);
        centralPanel.add(titleLB);

        JLabel nameLb = new JLabel("Name : ");
        springLayout.putConstraint(SpringLayout.NORTH, nameLb,  100, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, nameLb, 5, SpringLayout.WEST, centralPanel);
        centralPanel.add(nameLb);

        nameTF = new JTextField(20);
        springLayout.putConstraint(SpringLayout.NORTH, nameTF, 100, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, nameTF, 60, SpringLayout.WEST, centralPanel);
        centralPanel.add(nameTF);

        JLabel idLb = new JLabel("ID :");
        springLayout.putConstraint(SpringLayout.NORTH, idLb, 140, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, idLb, 5, SpringLayout.WEST, centralPanel);
        centralPanel.add(idLb);

        idTF = new JTextField(14);
        springLayout.putConstraint(SpringLayout.NORTH, idTF, 140, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, idTF, 60, SpringLayout.WEST, centralPanel);
        centralPanel.add(idTF);

        JLabel salaryLb = new JLabel("Salary : ");
        springLayout.putConstraint(SpringLayout.NORTH, salaryLb, 180, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, salaryLb, 5, SpringLayout.WEST, centralPanel);
        centralPanel.add(salaryLb);

        salaryTF = new JTextField(7);
        springLayout.putConstraint(SpringLayout.NORTH, salaryTF, 180, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, salaryTF, 60, SpringLayout.WEST, centralPanel);
        centralPanel.add(salaryTF);

        JLabel isDeadLb = new JLabel("Is dead : ");
        springLayout.putConstraint(SpringLayout.NORTH, isDeadLb, 220, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, isDeadLb, 5, SpringLayout.WEST, centralPanel);
        centralPanel.add(isDeadLb);

        isDeadTF = new JTextField(7);
        springLayout.putConstraint(SpringLayout.NORTH, isDeadTF, 220, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, isDeadTF, 60, SpringLayout.WEST, centralPanel);
        centralPanel.add(isDeadTF);

        JLabel workingHoursLb = new JLabel("Working hours : ");
        springLayout.putConstraint(SpringLayout.NORTH, workingHoursLb, 260, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, workingHoursLb, 5, SpringLayout.WEST, centralPanel);
        centralPanel.add(workingHoursLb);

        workingHoursTF = new JTextField(3);
        springLayout.putConstraint(SpringLayout.NORTH, workingHoursTF, 260, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, workingHoursTF, 110, SpringLayout.WEST, centralPanel);
        centralPanel.add(workingHoursTF);

        submitBtn = new JButton("Submit");
        springLayout.putConstraint(SpringLayout.NORTH, submitBtn, 300, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, submitBtn, 100, SpringLayout.WEST, centralPanel);
        centralPanel.add(submitBtn);

        contentPanel.add(centralPanel);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.YELLOW);
        rightPanel.setPreferredSize(new Dimension(50, 500));
        contentPanel.add(rightPanel);

        setVisible(true);
    }
}
