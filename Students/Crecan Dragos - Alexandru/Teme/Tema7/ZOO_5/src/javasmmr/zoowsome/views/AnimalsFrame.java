package javasmmr.zoowsome.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AnimalsFrame extends ZooFrame {

    private JButton aquaticsBtn;
    private JButton birdsBtn;
    private JButton insectsBtn;
    private JButton mammalsBtn;
    private JButton reptilesBtn;

    public AnimalsFrame(String title) {
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

        aquaticsBtn = new JButton("Aquatics");
        springLayout.putConstraint(SpringLayout.NORTH, aquaticsBtn, 75, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, aquaticsBtn, 75, SpringLayout.WEST, centralPanel);
        centralPanel.add(aquaticsBtn);

        birdsBtn = new JButton("Birds");
        springLayout.putConstraint(SpringLayout.NORTH, birdsBtn, 135, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, birdsBtn, 75, SpringLayout.WEST, centralPanel);
        centralPanel.add(birdsBtn);

        insectsBtn = new JButton("Insects");
        springLayout.putConstraint(SpringLayout.NORTH, insectsBtn, 195, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, insectsBtn, 75, SpringLayout.WEST, centralPanel);
        centralPanel.add(insectsBtn);

        mammalsBtn = new JButton("Mammals");
        springLayout.putConstraint(SpringLayout.NORTH, mammalsBtn, 255, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, mammalsBtn, 75, SpringLayout.WEST, centralPanel);
        centralPanel.add(mammalsBtn);

        reptilesBtn = new JButton("Reptiles");
        springLayout.putConstraint(SpringLayout.NORTH, reptilesBtn, 315, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, reptilesBtn, 75, SpringLayout.WEST, centralPanel);
        centralPanel.add(reptilesBtn);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.YELLOW);
        contentPanel.add(rightPanel);

        setVisible(true);
    }

    public void setAquaticsBtnActionListener(ActionListener aquaticsBtnActionListener) {
        aquaticsBtn.addActionListener(aquaticsBtnActionListener);
    }

    public void setBirdsBtnActionListener(ActionListener birdsBtnActionListener) {
        birdsBtn.addActionListener(birdsBtnActionListener);
    }

    public void setInsectsBtnActionListemer(ActionListener insectsBtnActionListemer) {
        insectsBtn.addActionListener(insectsBtnActionListemer);
    }

    public void setMammalsBtnActionListener(ActionListener mammalsBtnActionListener) {
        mammalsBtn.addActionListener(mammalsBtnActionListener);
    }

    public void setReptilesBtnActionListener(ActionListener reptilesBtnActionListener) {
        reptilesBtn.addActionListener(reptilesBtnActionListener);
    }
}
