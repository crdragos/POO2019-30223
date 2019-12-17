package dragball;
import javax.swing.*;

public class DragDemo
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		JFrame window = new JFrame();
		window.setTitle("Drag Demo");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setContentPane(new DragBallPanel());
		window.show();
		window.pack();
	}
}