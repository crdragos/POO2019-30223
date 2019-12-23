package javasmmr.zoowsome.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InsectsFrame extends ZooFrame {

    private JButton butterflyBtn;
    private JButton cockroachBtn;
    private JButton spiderBtn;

    public InsectsFrame(String title) {
        super(title);

        contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.YELLOW);
        contentPanel.add(leftPanel);

        SpringLayout springLayout = new SpringLayout();

        JPanel centralPanel = new JPanel();
        centralPanel.setBackground(Color.YELLOW);
        centralPanel.setLayout(springLayout);

        butterflyBtn = new JButton("Butterfly");
        springLayout.putConstraint(SpringLayout.NORTH, butterflyBtn, 140, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, butterflyBtn, 85, SpringLayout.WEST, centralPanel);
        centralPanel.add(butterflyBtn);

        cockroachBtn = new JButton("Cockroach");
        springLayout.putConstraint(SpringLayout.NORTH, cockroachBtn, 190, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, cockroachBtn, 85, SpringLayout.WEST, centralPanel);
        centralPanel.add(cockroachBtn);

        spiderBtn = new JButton("Spider");
        springLayout.putConstraint(SpringLayout.NORTH, spiderBtn, 240, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, spiderBtn, 85, SpringLayout.WEST, centralPanel);
        centralPanel.add(spiderBtn);

        contentPanel.add(centralPanel);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.YELLOW);
        contentPanel.add(rightPanel);

        setVisible(true);
    }

    public void setButterflyBtnActionListener(ActionListener butterflyBtnActionListener) {
        butterflyBtn.addActionListener(butterflyBtnActionListener);
    }

    public void setCockroachBtnActionListener(ActionListener cockroachBtnActionListener) {
        cockroachBtn.addActionListener(cockroachBtnActionListener);
    }

    public void setSpiderBtnActionListener(ActionListener spiderBtnActionListener) {
        spiderBtn.addActionListener(spiderBtnActionListener);
    }
}
