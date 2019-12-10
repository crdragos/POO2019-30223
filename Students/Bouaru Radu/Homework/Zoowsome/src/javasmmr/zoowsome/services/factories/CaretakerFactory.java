package javasmmr.zoowsome.services.factories;

import java.math.BigDecimal;
import java.util.Random;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class CaretakerFactory extends EmployeeAbstractFactory {

	@Override
	public Employee getEmployeeFactory(String type) throws Exception {
		String[] caretakerNames = new String[] { "Magnus", "Jonas", "Ulrich", "Noah", "Mads", "Adam",
				"Basil I the Macedonian", "Leo VI the Wise", "Alexander III", "Constantine VII", "John I Tzimiskes",
				"Theodora", "Constantine IX Monomachos", "Nikephoros III Phokas", "Zoe" };
		BigDecimal[] salaries = new BigDecimal[] { new BigDecimal("1000"), new BigDecimal("5000"),
				new BigDecimal("2000"), new BigDecimal("3000"), new BigDecimal("4000") };

		Random randomizer = new Random();
		int chooseName = randomizer.nextInt(caretakerNames.length);
		double workingHours = 10 * randomizer.nextDouble();
		int chooseSalary = randomizer.nextInt(salaries.length);

		return new Caretaker(caretakerNames[chooseName], salaries[chooseSalary], false, workingHours);
	}
}
