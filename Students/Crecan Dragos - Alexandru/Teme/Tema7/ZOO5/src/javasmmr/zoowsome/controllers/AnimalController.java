package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.AnimalFrame;
import javasmmr.zoowsome.views.AquaticFrame;
import javasmmr.zoowsome.views.BirdFrame;
import javasmmr.zoowsome.views.InsectFrame;
import javasmmr.zoowsome.views.MammalFrame;
import javasmmr.zoowsome.views.ReptileFrame;
import javasmmr.zoowsome.views.ZooFrame;

public class AnimalController extends AbstractController {

	public AnimalController(AnimalFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setAquaticButtonActionListener(new AquaticButtonActionListener());
		frame.setBirdButtonActionListener(new BirdButtonActionListener());
		frame.setInsectButtonActionListener(new InsectButtonActionListener());
		frame.setMammalButtonActionListener(new MammalButtonActionListener());
		frame.setReptileButtonActionListener(new ReptileButtonActionListener());
	}
	
	private class AquaticButtonActionListener implements ActionListener {
		@Override 
		public void actionPerformed(ActionEvent e) {
			new AquaticController(new AquaticFrame("Aquatics"), true);
		}
	}
	
	private class BirdButtonActionListener implements ActionListener {
		@Override 
		public void actionPerformed(ActionEvent e) {
			new BirdController(new BirdFrame("Birds"), true);
		}
	}
	
	private class InsectButtonActionListener implements ActionListener {
		@Override 
		public void actionPerformed(ActionEvent e) {
			new InsectController(new InsectFrame("Insects"), true);
		}
	}
	
	private class MammalButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new MammalController(new MammalFrame("Mammals"), true);
		}
	}
	
	private class ReptileButtonActionListener implements ActionListener {
		@Override 
		public void actionPerformed(ActionEvent e) {
			new ReptileController(new ReptileFrame("Reptiles"), true);
		}
	}

}
