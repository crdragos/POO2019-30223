package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.views.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BirdsController extends AbstractController {

    public BirdsController(BirdsFrame frame, boolean hasBackButton) {
        super(frame, hasBackButton);
        frame.setHawkBtnActionListener(new HawkBtnActionListener());
        frame.setOwlBtnActionListener(new OwlBtnActionListener());
        frame.setStorkBtnActionListener(new StorkBtnActionListener());
    }

    private class HawkBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new HawkController(new HawkFrame("Hawk"), true);
        }
    }

    private class OwlBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new OwlController(new OwlFrame("Owl"), true);
        }
    }

    private class StorkBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new StorkController(new StorkFrame("Stork"), true);
        }
    }
}
