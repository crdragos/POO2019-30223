import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.AbstractDocument.Content;

class ButtonHandler extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private Cell[][] grid;
	private int gridSize;
	public ButtonHandler(Cell[][] grid, int gridSize) {

		this.grid = grid;
		this.gridSize = gridSize;
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		for (int i = 0; i < gridSize; i++)
			for (int j = 0; j < gridSize; j++)
				if (source == grid[i][j]) {
					processClick(i, j);
					return;
				}
	}

	public void processClick(int i, int j) {
		grid[i][j].discover(grid);
		
		if(grid[i][j].mine == true)
			gameOver();
	}

	
	public static void setEnabledAll(Container container, boolean enabled) {
		   Component[] components = container.getComponents();
		   if (components.length > 0) {
		      for (Component component : components) {
		         component.setEnabled(enabled);
		         if (component instanceof Container) { 
		            setEnabledAll((Container)component, enabled);
		         }
		      }
		   }
		}
	public void gameOver()
	{
		
		for(int i=0; i<gridSize;  i++)
			for(int j=0; j<gridSize; j++)
				grid[i][j].discover(grid);
		setEnabledAll(MainForm.content, false);
		
		 int dialogButton = JOptionPane.YES_NO_OPTION;
		    JOptionPane.showConfirmDialog (null, "Try again? ","You lost! Better luck next time!", dialogButton);
		    if(dialogButton == JOptionPane.YES_OPTION)
		    {
		    	for(int i=0; i<gridSize;  i++)
					for(int j=0; j<gridSize; j++)
						grid[i][j].cover(grid);
		    	
		    	MainForm.newGrid(gridSize);
		    	MainForm.generateRandomMines();
		    	MainForm.play();
		    	
		    	setEnabledAll(MainForm.content, true);	    		
		    }
		    else
		    	if(dialogButton == JOptionPane.NO_OPTION)
		    {
		    		System.exit(0);
		    }
		    	
	}
}
