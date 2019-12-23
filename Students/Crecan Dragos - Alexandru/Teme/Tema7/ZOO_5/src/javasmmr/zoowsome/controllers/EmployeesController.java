package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.views.CaretakerFrame;
import javasmmr.zoowsome.views.EmployeesFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeesController extends AbstractController {

    public EmployeesController(EmployeesFrame frame, boolean hasBackButton) {
        super(frame, hasBackButton);
        frame.setCaretakerBtnActionListener(new CaretakerBtnActionListener());
    }

    private class CaretakerBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new CaretakerController(new CaretakerFrame("Caretaker"), true);
        }
    }
}
