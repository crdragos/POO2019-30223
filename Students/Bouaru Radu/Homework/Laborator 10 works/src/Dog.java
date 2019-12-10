
public class Dog {
	private String name;
	private String breed;
	private int age;
	private String owner;
	
	public Dog(String name, String breed, String owner, int age)
	{
		this.setName(name);
		this.setBreed(breed);
		this.setAge(age);
		this.setOwner(owner);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String toString() {
		return this.name;
	}
}
