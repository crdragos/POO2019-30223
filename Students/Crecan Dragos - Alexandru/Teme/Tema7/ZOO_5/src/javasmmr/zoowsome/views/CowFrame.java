package javasmmr.zoowsome.views;

import javasmmr.zoowsome.controllers.AbstractController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CowFrame extends ZooFrame {

    private JTextField nameFiled;
    private JTextField nrOfLegsFiled;
    private JTextField normalBodyTempFiled;
    private JTextField percBodyHairField;
    private JButton submitBtn;

    public CowFrame(String title) {
        super(title);

        contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.YELLOW);
        contentPanel.add(leftPanel);

        JPanel centralPanel = new JPanel();
        centralPanel.setLayout(new GridLayout(6, 0, 0, 0));

        JPanel centralPanel1 = new JPanel();
        centralPanel1.setBackground(Color.YELLOW);
        centralPanel.add(centralPanel1);

        JPanel centralPanel2 = new JPanel();
        centralPanel2.setBackground(Color.YELLOW);
        centralPanel2.setLayout(new FlowLayout());
        centralPanel2.add(new JLabel("Name : "));
        nameFiled = new JTextField(10);
        centralPanel2.add(nameFiled);
        centralPanel.add(centralPanel2);

        JPanel centralPanel3 = new JPanel();
        centralPanel3.setBackground(Color.YELLOW);
        centralPanel3.setLayout(new FlowLayout());
        centralPanel3.add(new JLabel("Number of legs : "));
        nrOfLegsFiled = new JTextField(5);
        centralPanel3.add(nrOfLegsFiled);
        centralPanel.add(centralPanel3);

        JPanel centralPanel4 = new JPanel();
        centralPanel4.setBackground(Color.YELLOW);
        centralPanel4.setLayout(new FlowLayout());
        centralPanel4.add(new JLabel("Normal body temperature : "));
        normalBodyTempFiled = new JTextField(5);
        centralPanel4.add(normalBodyTempFiled);
        centralPanel.add(centralPanel4);

        JPanel centralPanel5 = new JPanel();
        centralPanel5.setBackground(Color.YELLOW);
        centralPanel5.setLayout(new FlowLayout());
        centralPanel5.add(new JLabel("Body hair : "));
        percBodyHairField = new JTextField(10);
        centralPanel5.add(percBodyHairField);
        centralPanel.add(centralPanel5);

        JPanel centralPanel6 = new JPanel();
        centralPanel6.setBackground(Color.YELLOW);
        submitBtn = new JButton("Submit");
        centralPanel6.add(submitBtn);
        centralPanel.add(centralPanel6);

        contentPanel.add(centralPanel);

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.YELLOW);
        contentPanel.add(rightPanel);
    }

    public String getNameInput() {
        return this.nameFiled.getText();
    }

    public String getNrOfLegsInput() {
        return this.nrOfLegsFiled.getText();
    }

    public String getBodyTempInput() {
        return this.normalBodyTempFiled.getText();
    }

    public String getPercBodyHairInput() {
        return this.percBodyHairField.getText();
    }

    public void setSubmitBtnActionListener(ActionListener submitBtnActionListener) {
        submitBtn.addActionListener(submitBtnActionListener);
    }
}
