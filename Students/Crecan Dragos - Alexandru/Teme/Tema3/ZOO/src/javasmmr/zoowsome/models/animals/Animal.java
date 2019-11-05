package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	private String name;
	private Integer nrOfLegs;
	
	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getNrOfLegs() {
		return this.nrOfLegs;
	}
	
	public String getName() {
		return this.name;
	}
	
}
