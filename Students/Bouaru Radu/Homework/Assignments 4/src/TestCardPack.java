import java.util.Iterator;

public class TestCardPack {
	public static void main(String[] args) {
		Cards cardSet = new Cards();
		Iterator<Character> iterator = cardSet.iterator();
		while (iterator.hasNext()) {
			char nextValue = iterator.next();
			if (nextValue == '5')
				iterator.remove();
			System.out.println("Urmatoarea valoare: " + nextValue);
		}
	}
}
