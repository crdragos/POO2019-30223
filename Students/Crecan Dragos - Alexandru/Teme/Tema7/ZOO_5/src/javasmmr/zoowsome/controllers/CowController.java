package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.views.CowFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CowController extends AbstractController {
    public CowController(CowFrame frame, boolean hasBackButton) {
        super(frame, hasBackButton);
        //frame.setSubmitBtnActionListener(new SubmitBtnActionListener());
    }

   /* private class SubmitBtnActionListener implements ActionListener {

        //@Override
        public void actionPerformed(ActionEvent e, CowFrame frame) {
            String name = frame.getNameInput();
            Integer nrOfLegs = Integer.parseInt(frame.getNrOfLegsInput());
            Double
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }*/
}
