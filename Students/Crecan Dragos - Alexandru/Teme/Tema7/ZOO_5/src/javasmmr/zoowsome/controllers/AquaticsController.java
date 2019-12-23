package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.views.AquaticsFrame;
import javasmmr.zoowsome.views.CancerFrame;
import javasmmr.zoowsome.views.SeahorseFrame;
import javasmmr.zoowsome.views.SharkFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AquaticsController extends AbstractController {

    public AquaticsController(AquaticsFrame frame, boolean hasBackButton) {
        super(frame, hasBackButton);
        frame.setCancerBtnActionListener(new CancerBtnActionListener());
        frame.setSeaHorseBtnActionListener(new SeahorseBtnActionListener());
        frame.setSharkBtnActionListener(new SharkBtnActionListener());
    }

    private class CancerBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new CancerController(new CancerFrame("Cancer"), true);
        }
    }

    private class SeahorseBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new SeahorseController(new SeahorseFrame("Seahorse"), true);
        }
    }

    private class SharkBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new SharkController(new SharkFrame("Shark"), true);
        }
    }
}
