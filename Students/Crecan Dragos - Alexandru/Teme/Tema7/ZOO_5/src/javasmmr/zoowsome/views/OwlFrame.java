package javasmmr.zoowsome.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class OwlFrame extends ZooFrame {

    private JTextField nameTF;
    private JTextField nrOfLegsTF;
    private JTextField migratesTF;
    private JTextField avgFlightAltitudeTF;
    private JButton submitBtn;

    public OwlFrame(String title) {
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
        nameTF = new JTextField(10);
        centralPanel2.add(nameTF);
        centralPanel.add(centralPanel2);

        JPanel centralPanel3 = new JPanel();
        centralPanel3.setBackground(Color.YELLOW);
        centralPanel3.setLayout(new FlowLayout());
        centralPanel3.add(new JLabel("Number of legs : "));
        nrOfLegsTF = new JTextField(5);
        centralPanel3.add(nrOfLegsTF);
        centralPanel.add(centralPanel3);

        JPanel centralPanel4 = new JPanel();
        centralPanel4.setBackground(Color.YELLOW);
        centralPanel4.setLayout(new FlowLayout());
        centralPanel4.add(new JLabel("Migrates : "));
        migratesTF = new JTextField(7);
        centralPanel4.add(migratesTF);
        centralPanel.add(centralPanel4);

        JPanel centralPanel5 = new JPanel();
        centralPanel5.setBackground(Color.YELLOW);
        centralPanel5.setLayout(new FlowLayout());
        centralPanel5.add(new JLabel("Flight altitude (average) : "));
        avgFlightAltitudeTF = new JTextField(5);
        centralPanel5.add(avgFlightAltitudeTF);
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
        return nameTF.getText();
    }

    public String getNrOfLegsInput() {
        return nrOfLegsTF.getText();
    }

    public String getMigratesInput() {
        return migratesTF.getText();
    }

    public String getAvgFlightAltitudeInput() {
        return avgFlightAltitudeTF.getText();
    }

    public void setSubmitBtnActionListener(ActionListener submitBtnActionListener) {
        submitBtn.addActionListener(submitBtnActionListener);
    }
}
