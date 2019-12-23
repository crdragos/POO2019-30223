package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.models.employees.Investor;

public class InvestorFactory extends EmployeeAbstractFactory {
    @Override
    public Employee getEmployeeFactory(String type) throws Exception {
        return new Investor();
    }
}
