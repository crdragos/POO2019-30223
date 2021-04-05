import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.*;

public class MainForm extends JFrame {

	private static final long serialVersionUID = 1L;
	public static JFrame frame;

	static JPanel content = new JPanel();
	static JPanel matrix = new JPanel();
	boolean state = false;
	private static Cell[][] grid;
	static int gridSize = 20;
	static int maxBombs = 99;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setTitle("Minesweeper 2.0");

	}

	public static Cell[][] newGrid(int n) {
		Cell[][] grid = new Cell[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				grid[i][j] = new Cell(i, j, gridSize);

		return grid;
	}

	public static void createGrid(int n) {

		content.setLayout(new BorderLayout());
		matrix.setLayout(new GridLayout(n, n));
		grid = newGrid(n);

		ButtonHandler buttonHandler = new ButtonHandler(grid, gridSize);

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				
				grid[i][j].addActionListener(buttonHandler);
				matrix.add(grid[i][j]);
			}
	
		content.add(matrix, BorderLayout.CENTER);
		frame.setContentPane(content);
	}

	public static void generateRandomMines() {
		boolean[] marked = new boolean[gridSize * gridSize];
		int[][] mines = new int[maxBombs][2];
		for (int bombsCount = 0; bombsCount < maxBombs; bombsCount++) {
			Random r = new Random();
			int rand = r.nextInt(gridSize * gridSize);
			int x = rand / gridSize;
			int y = rand % gridSize;
			if (marked[rand] == false) {
				mines[bombsCount][0] = x;
				mines[bombsCount][1] = y;
				grid[mines[bombsCount][0]][mines[bombsCount][1]].mine = true;
				marked[rand] = true;
			}

		}
	}
	public static void play()
	{
		for (int i = 0; i < gridSize; i++)
			for (int j = 0; j < gridSize; j++)
				grid[i][j].countNeighbours(grid);
	}
	public MainForm() {
		initialize();
		createGrid(gridSize);
		generateRandomMines();
		play();
			
	}

}
