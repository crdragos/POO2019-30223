package javasmmr.zoowsome.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CancerFrame extends ZooFrame{

    private JTextField nameTF;
    private JTextField nrOfLegsTF;
    private JTextField avgSwimDeptgTF;
    private JButton submitBtn;

    public CancerFrame(String title) {
        super(title);

        contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.YELLOW);
        contentPanel.add(leftPanel);

        JPanel centralPanel = new JPanel();
        centralPanel.setLayout(new GridLayout(5, 0, 0, 0));

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
        centralPanel4.add(new JLabel("Swim depth (average) : "));
        avgSwimDeptgTF = new JTextField(5);
        centralPanel4.add(avgSwimDeptgTF);
        centralPanel.add(centralPanel4);


        JPanel centralPanel5 = new JPanel();
        centralPanel5.setBackground(Color.YELLOW);
        submitBtn = new JButton("Submit");
        centralPanel5.add(submitBtn);
        centralPanel.add(centralPanel5);

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

    public String getAvgSwimDepthInput() {
        return avgSwimDeptgTF.getText();
    }

    public void setSubmitBtnActionListener(ActionListener submitBtnActionListener) {
        submitBtn.addActionListener(submitBtnActionListener);
    }
}
