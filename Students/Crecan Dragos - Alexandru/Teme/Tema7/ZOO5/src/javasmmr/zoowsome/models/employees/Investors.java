package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public class Investors extends Employee {
	
	public Investors() {
		this.name = "newInvestor";
		this.id = (long) -1;
		this.salary = new BigDecimal(3000);
		this.isDead = false;
	}

}
