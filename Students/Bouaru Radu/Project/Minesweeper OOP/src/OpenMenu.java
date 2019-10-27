import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OpenMenu extends JFrame {

	private JPanel contentPane;
	private JButton[] options = new JButton[3];
	private JPanel buttonPanel = new JPanel();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpenMenu frame = new OpenMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public OpenMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 500);
		
		contentPane = new JPanel();
		contentPane.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		
		for(int i=0; i<3; i++)
		{
			options[i] = new JButton();
			options[i].setMargin(new Insets(30, 30, 30, 30));
			options[i].setText("Level " + i);
			contentPane.add(options[i], gbc);
		}
		setContentPane(contentPane);
		MainForm f = new MainForm();
		if(options[0].isSelected())
		{
			MainForm.maxBombs = 10;
			MainForm.gridSize  = 9;
			this.setVisible(false);
			f.setVisible(true);
		}
		if(options[1].isSelected())
		{
			MainForm.maxBombs = 40;
			MainForm.gridSize = 16;
			this.setVisible(false);
			f.setVisible(true);
		}
		if(options[2].isSelected())
		{
			MainForm.maxBombs = 99;
			MainForm.gridSize = 30;
			this.setVisible(false);
			f.setVisible(true);
		}
		
	}


}
