package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Player {
	
	private final String name;
	private List<Card> hand = new ArrayList<>();

	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public void swapCard(int cardIndex, Card newCard) {
		hand.set(cardIndex, newCard);
	}
	
	public void sort() {
		Collections.sort(hand);
	}
	
	public void sort(Comparator<Card> comparator) {
		Collections.sort(hand, comparator);
	}
	
	public void printHand() {
		for (Card card : hand) {
			System.out.print(card);
		}
		
		System.out.println();
	}

	@Override
	public String toString() {
		return this.name;
	}

	
	

}
