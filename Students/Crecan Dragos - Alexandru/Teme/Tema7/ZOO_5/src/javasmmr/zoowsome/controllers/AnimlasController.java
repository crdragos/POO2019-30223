package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.views.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimlasController extends AbstractController {

    public AnimlasController(AnimalsFrame frame, boolean hasBackButton) {
        super(frame, hasBackButton);
        frame.setAquaticsBtnActionListener(new AquaticsBtnActionListener());
        frame.setBirdsBtnActionListener(new BirdsBtnActionListener());
        frame.setInsectsBtnActionListemer(new InsectsBtnActionListener());
        frame.setMammalsBtnActionListener(new MammalsBtnActionListener());
        frame.setReptilesBtnActionListener(new ReptilesBtnActionListener());
    }

    private class AquaticsBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new AquaticsController(new AquaticsFrame("Aquatics"), true);
        }
    }

    private class BirdsBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new BirdsController(new BirdsFrame("Birds"), true);
        }
    }

    private class InsectsBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new InsectsController(new InsectsFrame("Insects"), true);
        }
    }

    private class MammalsBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new MammalsController(new MammalsFrame("Mammals"), true);
        }
    }

    private class ReptilesBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new ReptilesController(new ReptilesFrame("Reptiles"), true);
        }
    }
}
