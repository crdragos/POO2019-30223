import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class AngajatTest {
	
	@SuppressWarnings("deprecation")
	Angajat testAngajat = new Angajat("Andrei Popescu", new Date(2020, 1, 15) , new Long(5), new Double(0.4), new Long(5));
	@Test
	void testNume() {
		assertEquals(testAngajat.getNume(), "Andrei Popescu");
	}
	
	@Test
	void testDataAngajarii(){
		assertEquals(testAngajat.getDataAngajarii(), new Date(2020,1,14));
	}
	@Test
	void testBonusSalariu(){
		assertEquals(testAngajat.getBonusSalariu(), new Double(4.3));
	}

}
