package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.AnimalsFrame;
import javasmmr.zoowsome.views.EmployeesFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddController extends AbstractController {

    public AddController(AddFrame frame, boolean hasBackButton) {
        super(frame, hasBackButton);
        frame.setAnimalsBtnActionListener(new AnimlasBtnActionListener());
        frame.setEmployeesBtnActionListener(new EmployeesBtnActionListener());
    }

    private class AnimlasBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new AnimlasController(new AnimalsFrame("Animals"), true);
        }
    }

    public class EmployeesBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new EmployeesController(new EmployeesFrame("Employees"), true);
        }
    }

}
