
public class Card {
	private String suit;
	private int numberOfCard;
	
	public Card(String suitColorShape, int numberOfCard)
	{
		this.suit = suitColorShape;
		this.numberOfCard = numberOfCard;
	}
	public String getSuit() {
		return this.suit;
	}
	public int getNumber()
	{
		return this.numberOfCard;
	}
}
