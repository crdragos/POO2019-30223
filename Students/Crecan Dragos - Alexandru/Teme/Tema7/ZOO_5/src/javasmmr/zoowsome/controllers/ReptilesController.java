package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.views.LizzardFrame;
import javasmmr.zoowsome.views.ReptilesFrame;
import javasmmr.zoowsome.views.SnakeFrame;
import javasmmr.zoowsome.views.TurtleFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReptilesController extends AbstractController {

    public ReptilesController(ReptilesFrame frame, boolean hasBackButton) {
        super(frame, hasBackButton);
        frame.setLizzardBtnActionListener(new LizzardBtnActionListener());
        frame.setSnakeBtnActionListener(new SnakeBtnActionListener());
        frame.setTurtleBtnActionListener(new TurtleBtnActionListener());
    }

    private class LizzardBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new LizzardController(new LizzardFrame("Lizzard"), true);
        }
    }

    private class SnakeBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new SnakeController(new SnakeFrame("Snake"), true);
        }
    }

    private class TurtleBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new TurtleController(new TurtleFrame("Turtle"), true);
        }
    }
}
