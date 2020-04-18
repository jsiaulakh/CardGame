package cardgame4;

import java.util.Scanner;

/**
 * A class to handle the user interaction for the Card
 * project. Contains a main method that generates a card hand
 * and then iterates over it to print its contents to the console.
 * @author jsiaulakh, 2020
 */
public class printCards {
   // Main Class For Program Execution
	public static void main(String[] args) {
		CardHand ch = new CardHand();
		ch.generateHand();
                Scanner input = new Scanner(System.in);
                System.out.println("Let Begin The Fun :");
                System.out.println("Enter The Name Of Player 1 :");
                String n1 = input.next();
                System.out.println("Enter The Name Of Player 2 :");
                String n2 = input.next();


		Player p1 = new Player(ch.cards_1,n1);
		Player p2 = new Player(ch.cards_2,n2);
		// p1.display();
		// p2.display();
                
		Play playground = new Play(p1,p2);
		playground.play();
	}
}