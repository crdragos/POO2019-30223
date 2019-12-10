package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.models.employees.Manager;
import javasmmr.zoowsome.models.employees.Investors;

public class EmployeeFactory extends EmployeeAbstractFactory{
	public Employee getEmployee(String type) {
		if (Constants.Employees.Manager.equals(type)) {
			return new Manager();
		} else if (Constants.Employees.Investor.equals(type)) {
			return new Investors();
		} else if (Constants.Employees.Caretaker.equals(type)) {
			return new Caretaker();
		} else {
			return null;
		}
	}
	
}
