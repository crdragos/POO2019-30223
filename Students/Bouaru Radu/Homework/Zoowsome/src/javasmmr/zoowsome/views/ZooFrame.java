package javasmmr.zoowsome.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javasmmr.zoowsome.services.factories.Constants.FRAMES;
import javasmmr.zoowsome.views.utilities.FrameStack;

public abstract class ZooFrame extends JFrame implements ZooFrame_I {

	private static final long serialVersionUID = 1L;
	protected JPanel contentPanel;

	public ZooFrame(String title) {
		FrameStack.getInstance().push(this);
		setTitle(title);
		setSize(FRAMES.WIDTH, FRAMES.HEIGHT);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(new Color(168, 248, 180));
		add(contentPanel, BorderLayout.CENTER);
	}

	public void getTime(JLabel clockLabel) {
		Thread clock = new Thread() {
			public void run() {
				while (true) {
					try {
						Calendar newCalendar = new GregorianCalendar();
						SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
						clockLabel.setText(sdf.format(newCalendar.getTime()));
						sleep(1000);
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				}
			}
		};
		clock.start();
	}

	public void setBackButtonActionListener(ActionListener a) {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(new Color(0, 157, 0));
		buttonPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
		JButton backButton = new JButton("Back");
		backButton.setBackground(Color.white);
		backButton.setFont(new Font("Arial", Font.BOLD, 20));
		buttonPanel.add(backButton);
		backButton.addActionListener(a);

		JLabel clockLabel = new JLabel();
		clockLabel.setFont(new Font("Arial", Font.BOLD, 20));
		clockLabel.setForeground(new Color(168, 248, 180));
		getTime(clockLabel);
		buttonPanel.add(clockLabel);

		this.add(buttonPanel, BorderLayout.NORTH);
	}

	@Override
	public void goBack() {

	}
}
