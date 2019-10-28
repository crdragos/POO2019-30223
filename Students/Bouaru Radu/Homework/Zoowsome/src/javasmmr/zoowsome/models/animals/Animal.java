package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	private Integer nrOfLegs;
	private String name;

	public Animal(Integer nrOfLegs, String name) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
	}

	public Integer getNumberOfLegs() {
		return this.nrOfLegs;
	}

	public void setNumberOfLegs(Integer legs) {
		this.nrOfLegs = legs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String newName) {
		this.name = newName;
	}
}
