package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
	
	private List<Card> cards = new ArrayList<>();

	public Deck() {		
		for (Card.Suit suit : Card.Suit.values()) {
			for (Card.Value value : Card.Value.values()) {
				cards.add(new Card(suit, value));
			}			
		}
	}
	
	public void deal (int nCards, Player...players) {
		for (Player player : players) {
			for (int i = 0; i < nCards; i++) {
				player.addCard(cards.get(i));
				cards.remove(i);
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards, new Random(System.nanoTime()));
	}
	
	public void swap(Player player, int... cardIndices) {
		for (int i : cardIndices) {
			player.swapCard(i, cards.get(0));
			cards.remove(0);
		}
	}
	
}
