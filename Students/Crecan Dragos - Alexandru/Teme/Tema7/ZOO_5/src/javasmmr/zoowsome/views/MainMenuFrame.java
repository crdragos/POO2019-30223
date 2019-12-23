package javasmmr.zoowsome.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainMenuFrame extends ZooFrame {

    private JButton btnAdd;
    private JButton btnList;
    private JButton btnSaveAndExit;

    public MainMenuFrame(String title) {
        super(title);

        contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

        JPanel panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        contentPanel.add(panel);

        JPanel pan = new JPanel();
        pan.setBackground(Color.YELLOW);
        contentPanel.add(pan);

        SpringLayout springLayout = new SpringLayout();
        pan.setLayout(springLayout);

        btnAdd = new JButton("Add");
        springLayout.putConstraint(SpringLayout.NORTH, btnAdd, 65, SpringLayout.NORTH, pan);
        springLayout.putConstraint(SpringLayout.WEST, btnAdd, 93, SpringLayout.WEST, pan);
        pan.add(btnAdd);

        btnList = new JButton("List");
        springLayout.putConstraint(SpringLayout.NORTH, btnList, 150, SpringLayout.NORTH, pan);
        springLayout.putConstraint(SpringLayout.WEST, btnList, 94, SpringLayout.WEST, pan);
        pan.add(btnList);

        btnSaveAndExit = new JButton("Save and Exit");
        springLayout.putConstraint(SpringLayout.NORTH, btnSaveAndExit, 264, SpringLayout.NORTH, pan);
        springLayout.putConstraint(SpringLayout.WEST, btnSaveAndExit, 69, SpringLayout.WEST, pan);
        pan.add(btnSaveAndExit);

        JPanel paneel2 = new JPanel();
        paneel2.setBackground(Color.YELLOW);
        contentPanel.add(paneel2);

        setVisible(true);
    }

    public void setAddBtnActionListener(ActionListener a) {
        btnAdd.addActionListener(a);
    }

    public void setListBtnActionListener(ActionListener a) {
        btnList.addActionListener(a);
    }

    public void setSaveAndExitBtnActionListener(ActionListener a) {
        btnSaveAndExit.addActionListener(a);
    }
}
