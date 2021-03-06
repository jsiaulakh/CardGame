package cardgame4;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;


public class Player{
	public Queue<Card> cards;
	public int score;
        private String name;

	Player(ArrayList<Card> cards,String n) {
		score = 0;
                name = n;
		this.cards = new LinkedList<>();
		for(Card c: cards) {
			this.cards.add(c);
		}
	}


        
        public String getName(){
            return this.name;
        }

	void display() {
		for(Card card: this.cards) {
			System.out.print(card);
			System.out.print(", ");
		}
		System.out.println();
	}
}