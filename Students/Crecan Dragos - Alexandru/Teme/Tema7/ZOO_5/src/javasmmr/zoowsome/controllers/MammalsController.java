package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.views.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MammalsController extends AbstractController {

    public MammalsController(MammalsFrame frame, boolean hasBackButton) {
        super(frame, hasBackButton);
        frame.setCowBtnActionListener(new CowBtnActionListener());
        frame.setMonkeyBtnActionListener(new MonkeyBtnActionListener());
        frame.setTigerBtnActionListener(new TigerBtnActionListener());
    }

    private class CowBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new CowController(new CowFrame("Cow"), true);
        }
    }

    private class MonkeyBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new MonkeyController(new MonkeyFrame("Monkey"), true);
        }
    }

    private class TigerBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new TigerController(new TigerFrame("Tiger"), true);
        }
    }
}
