package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

import java.math.BigDecimal;
import java.util.Random;

public class CaretakerFactory extends EmployeeAbstractFactory {
    @Override
    public Employee getEmployeeFactory(String type) throws Exception {

        return new Caretaker();
    }
}
