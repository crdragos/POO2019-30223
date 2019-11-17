package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {
	protected String name;
	protected Long id;
	protected BigDecimal salary;
	protected Boolean isDead;
	
	public String getName() {
		return this.name;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public BigDecimal getSalary() {
		return this.salary;
	}
	
	public Boolean getIsDead() {
		return this.isDead;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId() {
		this.id = (long) (Math.random() * 10000000 * 1000000);
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public void setIsDead(Boolean isDead) {
		this.isDead = isDead;
	}
}
