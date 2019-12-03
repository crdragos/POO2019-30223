package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public class Manager extends Employee {
	
	public Manager() {
		this.name = "newManager";
		this.id = (long) -1;
		this.salary = new BigDecimal(1500);
		this.isDead = false;
	}

}
