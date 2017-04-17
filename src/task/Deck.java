package task;

import java.util.ArrayList;
import java.util.Collections;
import task.Card;

public class Deck {
	private ArrayList<Card> gameCards;
	
	public Deck() {
		gameCards = new ArrayList<Card>();
		for (int i=0; i<Card.getValuelength(); i++) 
			for (int j=0; j<Card.getSuitlength(); j++) gameCards.add(new Card(i,j));
	}
	
	public void shuffle() {
		Collections.shuffle(gameCards);
	}
	
	public void deal(int numCards, Player... players ) {
		try {
			for (Player somePlayer: players) for (int i=0; i<numCards; i++) somePlayer.addCard(gameCards.remove(0));
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("The cards are over. The deal failed: " + ex.getMessage());
			System.exit(1);
		}
	}

	public void swap(Player p1, int indexCard) {
		try {
			p1.setCard(indexCard, gameCards.get(0));
			gameCards.remove(0);
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("The cards are over. The swap failed: " + ex.getMessage());
			System.exit(1);
		}
	}

	public void swap(Player p1, int... indexCards) {
		try {
			for (int index:indexCards) p1.setCard(index, gameCards.remove(0));
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("The cards are over. The swap failed: " + ex.getMessage());
			System.exit(1);
		}
		
	}

}
