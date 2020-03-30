package cardgameweek4;

import java.util.ArrayList;

import java.util.Collections;

/**
 * a class that models the Card Hand.
 * A Card hand has an array of cards. 
 * How can you change the size of the hand? how big is it right now?
 * @author jsiaulakh, 2020.
 */

public class CardHand  {

	private int handSize = 26;
	public ArrayList<Card> cards_1 = new ArrayList<>();
	public ArrayList<Card> cards_2 = new ArrayList<>();

	public void generateHand()
	{
		ArrayList<Card> cards = new ArrayList<>();
		for(Card.Suit s: Card.Suit.values())
		{
			for(Card.Value v: Card.Value.values())
			{
					cards.add(new Card(s,v));
			}
		}//end outter for

		Collections.shuffle(cards);

		for(int i=0;i<this.handSize;i++) {
			this.cards_1.add(cards.get(i));
		}

		for(int i=0;i<this.handSize;i++) {
			this.cards_2.add(cards.get(i));
		}
	}//end method

}