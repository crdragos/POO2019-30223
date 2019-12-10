package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.AnimalFrame;
import javasmmr.zoowsome.views.EmployeeFrame;
import javasmmr.zoowsome.views.AddFrame;

public class AddController extends AbstractController {

	public AddController(AddFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setAnimalButtonActionListener(new AnimalButtonActionListener());
		frame.setEmployeeButtonActionListener(new EmployeeButtonActionListener());
	}
	
	private class AnimalButtonActionListener implements ActionListener {
		@Override 
		public void actionPerformed(ActionEvent e) {
			new AnimalController(new AnimalFrame("Animals"), true);
		}
	}
	
	private class EmployeeButtonActionListener implements ActionListener {
		@Override 
		public void actionPerformed(ActionEvent e) {
			new EmployeeController(new EmployeeFrame("Employees"), true);
		}
	}
}
