public class Card {
    private char rank;
    private String suit;

    public final static String DIAMONDS = "romb";
    public final static String CLUBS = "trefla";
    public final static String HEARTS = "inima rosie";
    public final static String SPADES = "inima neagra";

    public final static char TWO = 2;
    public final static char THREE = 3;
    public final static char FOUR = 4;
    public final static char FIVE = 5;
    public final static char SIX = 6;
    public final static char SEVEN = 7;
    public final static char EIGHT = 8;
    public final static char NINE = 9;
    public final static char TEN = 10;
    public final static char JOKER = 'J';
    public final static char QUEEN = 'Q';
    public final static char KING = 'K';
    public final static char ACE = 'A';

    public Card(char rank, String suit) {
        if (TWO <= rank && rank <= ACE) {
            if (suit.equals(DIAMONDS) || suit.equals(CLUBS) || suit.equals(HEARTS) || suit.equals(SPADES)) {
                this.rank = rank;
                this.suit = suit;
            }
        }
    }

    public char getRank() {
        return this.rank;
    }

    public String getSuit() {
        return this.suit;
    }

    //@Override
    public int compareTo(Comparable comparableObjet) {
        if (comparableObjet instanceof Card) {
            char result = rank.compareTo(((Card) comparableObjet).getRank());
            // am modificat rank-ul din int in char si a aparut eroarea
            if (result == 0) {
                return suit.compareTo(((Card) comparableObjet).getSuit());
            }
            return result;
        }
        return 0;
    }

}
