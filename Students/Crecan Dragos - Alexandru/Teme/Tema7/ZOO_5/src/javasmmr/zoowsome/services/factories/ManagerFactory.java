package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.models.employees.Manager;

public class ManagerFactory extends EmployeeAbstractFactory {
    @Override
    public Employee getEmployeeFactory(String type) throws Exception {
        return new Manager();
    }
}
