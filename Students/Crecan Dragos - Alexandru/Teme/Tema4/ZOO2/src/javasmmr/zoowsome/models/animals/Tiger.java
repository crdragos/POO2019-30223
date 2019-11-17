package javasmmr.zoowsome.models.animals;

public class Tiger extends Mamal {
	public Integer lungimeColti;
	
	public Tiger(double maintenanceCost, double dangerPerc) {
		super(8, 0.9);
		this.setName("Tigrisor");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp(36);
		this.setPercBodyHair(99);
		this.lungimeColti = 2;
	}
	
	public void setLungimeColti(Integer lungimeColti) {
		this.lungimeColti = lungimeColti;
	}
	
	public Integer getLungimeColti() {
		return this.lungimeColti;
	}
	
	public boolean kill() {
		double randomNr = Math.random();
		if (randomNr < this.getDangerPerc()) {
			return true;
		} else {
			return false;
		}
	}
	
}
