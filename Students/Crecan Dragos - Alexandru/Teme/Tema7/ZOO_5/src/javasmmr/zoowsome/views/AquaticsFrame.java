package javasmmr.zoowsome.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AquaticsFrame extends ZooFrame {

    private JButton cancerBtn;
    private JButton seaHorseBtn;
    private JButton sharkBtn;

    public AquaticsFrame(String title) {
        super(title);

        contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.YELLOW);
        contentPanel.add(leftPanel);

        SpringLayout springLayout = new SpringLayout();

        JPanel centralPanel = new JPanel();
        centralPanel.setBackground(Color.YELLOW);
        centralPanel.setLayout(springLayout);

        cancerBtn = new JButton("Cancer");
        springLayout.putConstraint(SpringLayout.NORTH, cancerBtn, 180, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, cancerBtn, 80, SpringLayout.WEST, centralPanel);
        centralPanel.add(cancerBtn);

        seaHorseBtn = new JButton("Seahorse");
        springLayout.putConstraint(SpringLayout.NORTH, seaHorseBtn, 230, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, seaHorseBtn, 80, SpringLayout.WEST, centralPanel);
        centralPanel.add(seaHorseBtn);

        sharkBtn = new JButton("Shark");
        springLayout.putConstraint(SpringLayout.NORTH, sharkBtn, 280, SpringLayout.WEST, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, sharkBtn, 80, SpringLayout.WEST, centralPanel);
        centralPanel.add(sharkBtn);

        contentPanel.add(centralPanel);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.YELLOW);
        contentPanel.add(rightPanel);

        setVisible(true);
    }

    public void setCancerBtnActionListener(ActionListener cancerBtnActionListener) {
        cancerBtn.addActionListener(cancerBtnActionListener);
    }

    public void setSeaHorseBtnActionListener(ActionListener seaHorseBtnActionListener) {
        seaHorseBtn.addActionListener(seaHorseBtnActionListener);
    }

    public void setSharkBtnActionListener(ActionListener sharkBtnActionListener) {
        sharkBtn.addActionListener(sharkBtnActionListener);
    }

}
