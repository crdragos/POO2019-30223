import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingPersons {

	public static void main(String[] args) {
		ArrayList<Persoana> myPersons = new ArrayList<Persoana>();

		Persoana[] personsToAdd = new Persoana[10];
		String[] names = { "Debussy", "Liszt", "Chopin", "Tchaikovsky", "Schubert", "Mozart", "Beethoven",
				"Rachmaninoff", "Brahms", "Satie" };
		String[] fnames = { "Claude", "Franz", "Frederic", "Piotr Ilich", "Franz", "Wolfgang Amadeus", "Ludwig van",
				"Sergei", "Johannes", "Erik" };
		int[] ages = { 39, 69, 12, 73, 34, 75, 64, 12, 74, 43 };
		for (int i = 0; i < personsToAdd.length; i++) {
			personsToAdd[i] = new Persoana();
			personsToAdd[i].setNume(names[i]);
			personsToAdd[i].setPrenume(fnames[i]);
			personsToAdd[i].setVarsta(ages[i]);
			myPersons.add(personsToAdd[i]);
		}
		System.out.println("Sorted after name:");
		Collections.sort(myPersons, new Persoana());
		Iterator<Persoana> newIterator = myPersons.iterator();
		while (newIterator.hasNext()) {
			Persoana nextPerson = newIterator.next();
			System.out.println(nextPerson.getNume() + ", " + nextPerson.getPrenume() + ", " + nextPerson.getVarsta());
		}
		System.out.println();
		System.out.println("Sorted after age:");
		Collections.sort(myPersons);
		newIterator = myPersons.iterator();
		while (newIterator.hasNext()) {
			Persoana nextPerson = newIterator.next();
			System.out.println(nextPerson.getNume() + ", " + nextPerson.getPrenume() + ", " + nextPerson.getVarsta());
		}
	}

}
