package task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Player {
	private String name;
	public List<Card> hand = new ArrayList<Card>();
	
	public Player(String name) {
		this.name = name;
	}
	
	public void take(Card card) {
		hand.add(card);
	}

	public void printHand() {
		for (Card card : hand) {
			System.out.print(card);
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return name;
	}

	public void sort() {
		sort(null);
	}

	public void sort(Comparator<Card> comparator) {
		hand.sort(comparator);
	}

}
