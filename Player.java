package cardgameweek4;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;


public class Player{
	public Queue<Card> cards;
	public int score;

	Player(ArrayList<Card> cards) {
		score = 0;
		this.cards = new LinkedList<>();
		for(Card c: cards) {
			this.cards.add(c);
		}
	}

	void display() {
		for(Card card: this.cards) {
			System.out.print(card);
			System.out.print(", ");
		}
		System.out.println();
	}
}