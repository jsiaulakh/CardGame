package cardgameweek4;
/**
 * a class that models the Card Hand.
 * A Card hand has an array of cards. 
 * How can you change the size of the hand? how big is it right now?
 * @author jsiaulakh, 2020.
 */

public class CardHand {

				private int handSize = 26;
				/** Arrays of cards created for 2 players  */
	public Card[] cards_1 = new Card[handSize];
	public Card[] cards_2 = new Card[handSize];

	
        /**
         * This function generates cards
         */
        public void generateHand()
        {
                int countCards = 0;
		for(Card.Suit s: Card.Suit.values())
                {
                    for(Card.Value v: Card.Value.values())
                    {
                        cards[countCards] = (new Card(s,v));
                        countCards++;
                    }
                }//end outter for
        }//end method

}