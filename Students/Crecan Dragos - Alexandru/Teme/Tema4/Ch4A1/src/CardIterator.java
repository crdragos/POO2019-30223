import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentMap;

public class CardIterator implements OrderedIterator {
    protected Card[] cardArray;
    int current = 0;

    public CardIterator() {
        this.cardArray = new Card[13];
    }

    @Override
    public boolean hasNext() {
        if (current < cardArray.length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Card next() {
        if (hasNext()) {
            return cardArray[current++];
        } else {
            //System.out.println("nu mai exista carti in pachet!");
            throw new NoSuchElementException();
        }
    }

    private Card[] removeCard(int index) {
        Card[] newCardArray = new Card[cardArray.length - 1];

        int cardIndex = 0;
        for (int i = 0; i < newCardArray.length; i++) {
            if (i != index) {
                newCardArray[i] = cardArray[cardIndex];
            } else {
                i--;
            }
            cardIndex++;
        }

        return newCardArray;
    }

    @Override
    public void remove() {
        this.cardArray = removeCard(current - 1 );
    }

    private Card[] insertCards(Comparable comparableItem) {
        Card[] newCardArray = new Card[cardArray.length + 1];

        int cardIndex = 0;
        boolean insertedItem = false;
        for (int i = 0; i < newCardArray.length; i++) {
            if ((cardIndex == cardArray.length || ((Card) comparableItem).compareTo((Comparable) cardArray[cardIndex]) < 0) && !insertedItem) {
                newCardArray[i] = ((Card) comparableItem);
                insertedItem = true;
            } else {
                newCardArray[i] = cardArray[cardIndex];
                cardIndex++;
            }
        }

        return newCardArray;
    }

    @Override
    public void put(Comparable comparableItem) {
        this.cardArray = insertCards(comparableItem);
    }

    public void reset() {
        this.current = 0;
    }
}
