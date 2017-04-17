package task;

import java.util.ArrayList;
import java.util.Comparator;

public class Player {
	
	private String name;
	private ArrayList <Card> playerCards;
	
	public Player(String name) {
		this.name=name;
		playerCards = new ArrayList <Card>();
	}
	
	public void addCard(Card c) {
		playerCards.add(c);
	}
	
	public void setCard(int index, Card inputCard) {
		playerCards.set(index, inputCard);
	}
	
	public void sort() {
		playerCards.sort(null);		
	}
	
	public void sort(Comparator<Card> comparator) {
		playerCards.sort(comparator);
	}

	public void printHand() {
		for (int i=0; i<playerCards.size(); i++) {
			System.out.print(playerCards.get(i));
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return name;
	}

}
