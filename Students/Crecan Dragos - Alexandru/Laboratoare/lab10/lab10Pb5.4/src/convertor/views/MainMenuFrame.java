package convertor.views;

import convertor.models.Moneda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainMenuFrame extends JFrame {
    private JTextField userInput = new JTextField(10);
    private String[] valute = {"USD", "EUR", "RON"};
    private JComboBox valuta1 = new JComboBox(valute);
    private JButton convertTo = new JButton(">>");
    private JComboBox valuta2 = new JComboBox(valute);
    private JTextField result = new JTextField(20);
    
    private Moneda m_moneda;
    
    public MainMenuFrame(Moneda moneda) {
        m_moneda = moneda;
        valuta1.setSelectedItem("EUR");
        valuta2.setSelectedItem("RON");

        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.CYAN);
        contentPanel.setLayout(new GridLayout(3,0));
        
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.CYAN);
        panel1.setLayout(new FlowLayout());
        panel1.add(new JLabel("Suma : "));
        panel1.add(userInput);
        panel1.add(valuta1);
        panel1.add(convertTo);
        panel1.add(valuta2);
        
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.CYAN);
        panel2.setLayout(new FlowLayout());
        panel2.add(new JLabel("Rezultat :"));
        panel2.add(result);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.CYAN);
        panel3.setLayout(new FlowLayout());
        panel3.add(new JLabel("1 "));
        panel3.add(new JLabel((String) valuta2.getSelectedItem()));
        panel3.add(new JLabel(" =  4.78"));
        panel3.add(new JLabel((String) valuta1.getSelectedItem()));

        contentPanel.add(panel3);
        contentPanel.add(panel1);
        contentPanel.add(panel2);
        
        this.setContentPane(contentPanel);
        this.pack();
        
        this.setTitle("Convertor Valutar");
        this.setSize(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String getUserInput() {
        return userInput.getText();
    }

    public String getValuta1Input() {
        return (String) valuta1.getSelectedItem();
    }

    public String getValuta2Input() {
        return (String) valuta2.getSelectedItem();
    }

    public void setResult(String newResult) {
        result.setText(newResult);
    }

    public void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }

    public void addConvertActionListener(ActionListener convertAL) {
        convertTo.addActionListener(convertAL);
    }
}
