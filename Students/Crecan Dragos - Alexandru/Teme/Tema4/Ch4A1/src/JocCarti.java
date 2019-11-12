import java.security.spec.RSAOtherPrimeInfo;

public class JocCarti {
    public static void main(String[] args) {
        CardIterator cardIterator = new CardIterator();
        for (int i = 0; i < 13; i++) {
            System.out.println(cardIterator.cardArray[i]);
        }

        cardIterator.cardArray[0] = new Card('5', "romb");
        cardIterator.cardArray[1] = new Card('A', "inima rosie");
        cardIterator.cardArray[2] = new Card('2', "romb");
        cardIterator.cardArray[3] = new Card('7', "inima neagra");
        cardIterator.cardArray[4] = new Card('J', "trefla");
        cardIterator.cardArray[5] = new Card('3', "trefla");
        cardIterator.cardArray[6] = new Card('4', "inima rosie");
        cardIterator.cardArray[7] = new Card('Q', "inima rosie");
        cardIterator.cardArray[8] = new Card('9', "trefla");
        cardIterator.cardArray[9] = new Card('4', "inima negra");
        cardIterator.cardArray[10] = new Card('K', "trefla");
        cardIterator.cardArray[11] = new Card('9', "romb");
        cardIterator.cardArray[12] = new Card('3', "romb");

        for (int i = 0; i < 13; i++) {
            System.out.println(cardIterator.cardArray[i].getSuit() + " " + cardIterator.cardArray[i].getRank());
        }

    }
}
