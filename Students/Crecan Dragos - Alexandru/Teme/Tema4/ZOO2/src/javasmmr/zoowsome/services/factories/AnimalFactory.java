package javasmmr.zoowsome.services.factories;

public class AnimalFactory {
	
	public SpeciesFactory getSpeciesFactory(String type) {
		if (Constants.Species.Mamals.equals(type)) {
			return new MamalFactory();
		} else if (Constants.Species.Reptiles.equals(type)) {
			return new ReptileFactory();
		} else if (Constants.Species.Birds.equals(type)) {
			return new BirdFactory();
		} else if (Constants.Species.Insects.equals(type)) {
			return new InsectFactory();
		} else if (Constants.Species.Aquatics.equals(type)) {
			return new AquaticFactory();
		} else 
			// throw new Exception("Invalid species exception");  
			//UNHANDELED EXCEPTION TYPE Exception
			return null;
	}
}
