package task;

import java.util.List;
import java.util.ArrayList;
import task.Card;
import java.util.Random;

public class Deck {
	private List<Card> gameCards;
	
	public Deck() {
		gameCards = new ArrayList<>();
		for (int i=0; i<Card.getValuelength(); i++) 
			for (int j=0; j<Card.getSuitlength(); j++) gameCards.add(new Card(i,j));
	}
	
	public void shuffle() {
		Random randomCard = new Random();
		for (int i=0; i<(randomCard.nextInt(gameCards.size()/2)+gameCards.size()/2); i++) {
			int indexCard1 = randomCard.nextInt(gameCards.size());
			int indexCard2 = randomCard.nextInt(gameCards.size());
			Card tempCard = gameCards.get(indexCard1);
			gameCards.set(indexCard1, gameCards.get(indexCard2));
			gameCards.set(indexCard2, tempCard);
		}
	}
	
	public void deal(int numCards, Player p1, Player p2) {
		try {
			for (int i=0; i<numCards; i++) p1.addCard(gameCards.get(i));
			for (int i=numCards; i<(2*numCards); i++) p2.addCard(gameCards.get(i));
			for (int i=0; i<(2*numCards); i++) gameCards.remove(0);
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("The cards are over. The deal failed: " + ex.getMessage());
			System.exit(1);
		}
	}
	
	public void deal(int numCards, Player p1) {
		try {
			for (int i=0; i<numCards; i++) p1.addCard(gameCards.get(i));
			for (int i=0; i<numCards; i++) gameCards.remove(0);
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

	public void swap(Player p1, int indexCard1, int indexCard2) {
		try {
			p1.setCard(indexCard1, gameCards.get(0));
			gameCards.remove(0);
			p1.setCard(indexCard2, gameCards.get(0));
			gameCards.remove(0);		
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("The cards are over. The swap failed: " + ex.getMessage());
			System.exit(1);
		}
		
	}

}
