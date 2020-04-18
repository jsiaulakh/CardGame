package cardgame4;
/**
 * Starter code for the Card class.
 * 
 * @author jsiaulakh, 2020
 */

 // Base Class for Card Creation
public class Card {
	public enum Suit {HEARTS,CLUBS,SPADES,DIAMONDS};
	public enum Value {ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE, THIRTEEN};
	private final Suit suit;
	private final Value value;
	
	public Card(Suit s, Value gVal)
	{
			suit =s;
			value= gVal;
	}

	public Value getValue() {
		return this.value;
	}

	public Suit getSuit() {
		return this.suit;
	}

	public String toString() {
		return suit.toString() + " " + value.toString();
	}
}