package javasmmr.zoowsome.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ReptilesFrame extends ZooFrame {

    private JButton lizzardBtn;
    private JButton snakeBtn;
    private JButton turtleBtn;

    public ReptilesFrame(String title) {
        super(title);

        contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.YELLOW);
        contentPanel.add(leftPanel);

        SpringLayout springLayout = new SpringLayout();

        JPanel centralPanel = new JPanel();
        centralPanel.setBackground(Color.YELLOW);
        centralPanel.setLayout(springLayout);

        lizzardBtn = new JButton("Lizzard");
        springLayout.putConstraint(SpringLayout.NORTH, lizzardBtn, 140, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, lizzardBtn, 85, SpringLayout.WEST, centralPanel);
        centralPanel.add(lizzardBtn);

        snakeBtn = new JButton("Snake");
        springLayout.putConstraint(SpringLayout.NORTH, snakeBtn, 190, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, snakeBtn, 85, SpringLayout.WEST, centralPanel);
        centralPanel.add(snakeBtn);

        turtleBtn = new JButton("Turtle");
        springLayout.putConstraint(SpringLayout.NORTH, turtleBtn, 240, SpringLayout.NORTH, centralPanel);
        springLayout.putConstraint(SpringLayout.WEST, turtleBtn, 85, SpringLayout.WEST, centralPanel);
        centralPanel.add(turtleBtn);

        contentPanel.add(centralPanel);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.YELLOW);
        contentPanel.add(rightPanel);

        setVisible(true);
    }

    public void setLizzardBtnActionListener(ActionListener lizzardBtnActionListener) {
        lizzardBtn.addActionListener(lizzardBtnActionListener);
    }

    public void setSnakeBtnActionListener(ActionListener snakeBtnActionListener) {
        snakeBtn.addActionListener(snakeBtnActionListener);
    }

    public void setTurtleBtnActionListener(ActionListener turtleBtnActionListener) {
        turtleBtn.addActionListener(turtleBtnActionListener);
    }
}
