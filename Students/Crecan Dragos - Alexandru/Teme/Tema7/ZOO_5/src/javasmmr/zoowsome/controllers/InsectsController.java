package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.views.ButterflyFrame;
import javasmmr.zoowsome.views.CockroachFrame;
import javasmmr.zoowsome.views.InsectsFrame;
import javasmmr.zoowsome.views.SpiderFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsectsController extends AbstractController {

    public InsectsController(InsectsFrame frame, boolean hasBackButton) {
        super(frame, hasBackButton);
        frame.setButterflyBtnActionListener(new ButterflyBtnActionListener());
        frame.setCockroachBtnActionListener(new CockroachBtnActionListener());
        frame.setSpiderBtnActionListener(new SpiderBtnActionListener());
    }

    private class ButterflyBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new ButterflyController(new ButterflyFrame("Butterfly"), true);
        }
    }

    private class CockroachBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new CockroachController(new CockroachFrame("Cockroach"), true);
        }
    }

    private class SpiderBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new SpiderController(new SpiderFrame("Spider"), true);
        }
    }
}
