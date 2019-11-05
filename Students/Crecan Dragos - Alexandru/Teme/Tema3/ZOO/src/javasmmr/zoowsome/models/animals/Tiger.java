package javasmmr.zoowsome.models.animals;

public class Tiger extends Mamal {
	public Integer lungimeColti;
	
	public Tiger() {
		super.setName("Tigrisor");
		super.setNrOfLegs(4);
		super.setNormalBodyTemp(36);
		super.setPercBodyHair(99);
		this.lungimeColti = 2;
	}
	
	public void setLungimeColti(Integer lungimeColti) {
		this.lungimeColti = lungimeColti;
	}
	
	public Integer getLungimeColti() {
		return this.lungimeColti;
	}
	
}
