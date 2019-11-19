package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Employee;

public class EmployeeFactory {
	public EmployeeAbstractFactory getEmployeeFactory(String type) throws Exception {
		if (Constants.EmployeeTypes.Caretaker.contentEquals(type)) {
			return new CaretakerFactory();
		}
		else
			throw new Exception("Invalid employee exception!");
	}
}
