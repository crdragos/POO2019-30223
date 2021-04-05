package dragball;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DragBallPanel extends JPanel implements MouseListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;
	private static final int BALL_DIAMETER = 70;
	private int _ballX = 0;
	private int _ballY = 45;
	private int _dragFromX = 0;
	private int _dragFromY = 0;
	private int _moveX = 4;
	private int _moveY = -3;
	private boolean _canDrag = false;

	DragBallPanel() {
		setPreferredSize(new Dimension(600, 600));
		setBackground(new Color(230, 230, 250));
		setForeground(new Color(147, 112, 219));
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(_ballX, _ballY, BALL_DIAMETER, BALL_DIAMETER);
		g.drawLine(0, 45, 600, 45);
		g.setFont(new Font("Arial", Font.BOLD, 15));
		g.setColor(Color.black);
		g.drawString("X: ", 10, 20);
		g.drawString("Start ball movement: click on it", 250, 20);
		g.drawString("Stop ball movement: click anywhere else", 250, 40);
		g.drawString(String.valueOf(_ballX), 40, 20);
		g.drawString("Y: ", 10, 40);
		g.drawString(String.valueOf(_ballY), 40, 40);

	}

	public void mousePressed(MouseEvent e) {

		int x = e.getX();
		int y = e.getY();
		if (x >= _ballX && x <= (_ballX + BALL_DIAMETER) && y >= _ballY && y <= (_ballY + BALL_DIAMETER)) {
			_canDrag = true;
			_dragFromX = x - _ballX;
			_dragFromY = y - _ballY;
		} else {
			_canDrag = false;
		}
	}

	public void mouseDragged(MouseEvent e) {

		if (_canDrag) {
			_ballX = e.getX() - _dragFromX;
			_ballY = e.getY() - _dragFromY;
			_ballX = Math.max(_ballX, 0);
			_ballX = Math.min(_ballX, getWidth() - BALL_DIAMETER);
			_ballY = Math.max(_ballY, 0);
			_ballY = Math.min(_ballY, getHeight() - BALL_DIAMETER);
			this.repaint();
		}
	}

	public void mouseExited(MouseEvent e) {
		_canDrag = false;
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public Timer timer = new Timer(20, new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {

			_ballX += _moveX;
			_ballY += _moveY;
			if (_ballX > 530) {
				_ballX = 530;
				_moveX = -_moveX;
			}
			if (_ballX < 0) {
				_ballX = 0;
				_moveX = -_moveX;
			}
			if (_ballY > 530) {
				_ballY = 530;
				_moveY = -_moveY;
			}
			if (_ballY < 45) {
				_ballY = 45;
				_moveY = -_moveY;
			}
			repaint();

		}
	});

	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		if (x >= _ballX && x <= (_ballX + BALL_DIAMETER) && y >= _ballY && y <= (_ballY + BALL_DIAMETER)) {
			timer.start();
		} else {
			timer.stop();
		}
	}

	public void mouseReleased(MouseEvent e) {
	}
}