package javasmmr.zoowsome.views;

import javasmmr.zoowsome.models.interfaces.ZooFrame_I;
import javasmmr.zoowsome.services.factories.Constants;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class ZooFrame extends JFrame implements ZooFrame_I {

    protected JPanel contentPanel;

    public ZooFrame(String title) {
        FrameStack.getInstance().push(this);
        setTitle(title);
        setSize(Constants.Frames.WIDTH, Constants.Frames.HEIGHT);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPanel.setBackground(Color.RED);
        add(contentPanel, BorderLayout.CENTER);
    }

    public void setBackButtonActionListener(ActionListener actionListener) {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton backButton = new JButton("Back");
        buttonPanel.add(backButton);
        this.add(buttonPanel, BorderLayout.NORTH);
        backButton.addActionListener(actionListener);
    }

    @Override
    public void goBack() {

    }
}
