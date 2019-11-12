import java.util.Iterator;

public class Cards implements Iterable<Character> {

	private char myData[] = { '2', '3', '4', '5', '6', '7', '8', '9', 'X', 'J', 'Q', 'K', 'A' };

	@SuppressWarnings("unchecked")
	@Override
	public Iterator<Character> iterator() {
		return new CardSetIterator();
	}

	@SuppressWarnings("rawtypes")
	private class CardSetIterator implements Iterator {
		private int position = 0;

		@Override
		public boolean hasNext() {
			if (position < myData.length) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public Character next() {
			if (this.hasNext()) {
				return myData[position++];
			} else {
				return null;
			}
		}

		@Override
		public void remove() {
			if (position <= 0) {
				throw new IllegalStateException("Nu se poate sterge - index out of bounds");
			}
				myData[position] = '-'; 
		}
	}

}