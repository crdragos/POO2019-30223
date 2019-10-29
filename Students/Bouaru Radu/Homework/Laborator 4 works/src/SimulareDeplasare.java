public class SimulareDeplasare extends Autovehicul{
	public static void drive(Autovehicul Car)
	{
		System.out.printf("Conduceti un %s cu viteza maxima de %d\n",Car.getMarca(), Car.getVitezaMaxima());
		if(Car.getVitezaCurenta() == 0)
		System.out.printf("Masina stationeaza\n");
		Car.accelerare(20);
		System.out.printf("Viteza : %d km/h - treapta: %d\n", Car.getVitezaCurenta(), Car.getTreaptaCurenta());
		Car.accelerare(21.23);
		System.out.printf("Viteza : %d km/h- treapta: %d\n", Car.getVitezaCurenta(), Car.getTreaptaCurenta());
		Car.accelerare(300);
		System.out.printf("Viteza : %d km/h- treapta: %d\n", Car.getVitezaCurenta(), Car.getTreaptaCurenta());
		Car.decelerare(40);
		System.out.printf("Viteza : %d km/h- treapta: %d\n", Car.getVitezaCurenta(), Car.getTreaptaCurenta());
		Car.decelerare(200);
		System.out.printf("Viteza : %d km/h- treapta: %d\n", Car.getVitezaCurenta(), Car.getTreaptaCurenta());
		Car.oprire();
		System.out.printf("Viteza : %d km/h- treapta: %d\n", Car.getVitezaCurenta(), Car.getTreaptaCurenta());
		System.out.println("Soferul dvs. a fost " + Car.getNumeSofer());
		
	}
	public static void main(String[] args) {
			Autovehicul newCar = new Autovehicul();
			drive(newCar);
	}

}
