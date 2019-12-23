package javasmmr.zoowsome.services.factories;

public class EmployeeFactory {
    public EmployeeAbstractFactory getEmployeeFactory(String type) throws Exception {
        if (Constants.Employees.Caretaker.equals(type)) {
            return new CaretakerFactory();
        } else if (Constants.Employees.Investor.equals(type)) {
            return new InvestorFactory();
        } else if (Constants.Employees.Manager.equals(type)) {
            return new ManagerFactory();
        } else {
            throw new Exception("Invalid employee format!");
        }
    }
}
