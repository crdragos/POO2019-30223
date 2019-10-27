import javax.swing.*;
import java.awt.*;

public class Cell extends JButton {

	 private static final long serialVersionUID = 1L;

	public boolean discovered = false;
	public boolean mine = false;
	public int neighborCount = 0;
	public int gridSize = 0;
	public int i, j;
	
	Color customBlue1 = new Color(26, 131, 247);
	Color customBlue2 = new Color(106, 168, 247);
	Color customYellow1 = new Color(255, 247, 230);
	Color customYellow2 = new Color(255, 231, 179);
	Color bombColor = new Color(255, 121, 77);
	
	public Cell(int i, int j, int size) {
		this.gridSize = size;
		this.i = i;
		this.j = j;
		
		if (this.discovered == false)
			if((i+j)%2 == 0)
				this.setBackground(customBlue1);
			else
				this.setBackground(customBlue2);
	} 
	public void cover(Cell[][] grid)
	{
		for(int i=0; i<gridSize;  i++)
			for(int j=0; j<gridSize; j++)
			{
				grid[i][j].discovered = false;
				grid[i][j].mine = false;
				grid[i][j].setText(" ");
				if((i+j)%2 == 0)
					this.setBackground(customBlue1);
				else
					this.setBackground(customBlue2);
			}
			
				
	}

	public void discover(Cell[][] grid) {
		if(this.mine == false)
		{
			grid[i][j].setForeground(Color.black);
			grid[i][j].setMargin(new Insets(0, 0, 0, 0));
			grid[i][j].setFont(new Font("Times New Roman", Font.PLAIN, 30));
			grid[i][j].setPreferredSize(new Dimension(25, 25));
			if (grid[i][j].neighborCount != 0)
				grid[i][j].setText(Integer.toString(grid[i][j].neighborCount));
			else
				grid[i][j].setText("");
		}
		
		this.discovered = true;
		
		if(this.neighborCount == 0)
			this.floodFill(grid);
		
		if (this.discovered == true)
			if (this.mine == true)	
				this.setBackground(bombColor);
				
			else
				if((i+j)%2 == 0)
					this.setBackground(customYellow1);
				else
					this.setBackground(customYellow2);

	}

	public void countNeighbours(Cell[][] grid) {
		
		int total = 0;
		for (int x_offset = -1; x_offset <= 1; x_offset++)
			for (int y_offset = -1; y_offset <= 1; y_offset++)
				if ((this.i + x_offset >= 0) && (this.j + y_offset >= 0) && (this.i + x_offset) < gridSize
						&& (this.j + y_offset < gridSize)) {
					var neighbor = grid[this.i + x_offset][this.j + y_offset];
					if (neighbor.mine == true)
						total++;
				}

		this.neighborCount = total;
	}
	public void floodFill(Cell[][] grid)
	{
		for (int x_offset = -1; x_offset <= 1; x_offset++)
			for (int y_offset = -1; y_offset <= 1; y_offset++)
				if ((this.i + x_offset >= 0) && (this.j + y_offset >= 0) && (this.i + x_offset) < gridSize
						&& (this.j + y_offset < gridSize)) {
					var neighbor = grid[this.i + x_offset][this.j + y_offset];
					if (neighbor.mine == false && neighbor.discovered == false)
						neighbor.discover(grid);
				}
		
	}

}
