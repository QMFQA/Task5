package main;

import java.util.Comparator;
import task.Card;
import task.Deck;
import task.Player;

public class Main {

	private static Deck deck = new Deck();
	private static Player p1 = new Player("Sanders");
	private static Player p2 = new Player("Pernal");
	
	public static void main(String[] args) {
		deck.shuffle();
		deck.deal(5, p1, p2);
		deck.deal(2, p2);
		printHands();
		p1.sort();
		p2.sort(new Comparator<Card>() {
			@Override
			public int compare(Card o1, Card o2) {
				return (o2.compareTo(o1));
			}
		});
		printHands();
		deck.swap(p1, 3);
		deck.swap(p2, 1, 4);
		printHands();
	}
	private static void printHands() {
		System.out.println(p1 + "'s hand:");
		p1.printHand();
		System.out.println(p2 + "'s hand:");
		p2.printHand();
		System.out.println("--");
	}

}
