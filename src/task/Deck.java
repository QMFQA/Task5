package task;

import java.util.ArrayList;
import java.util.Collections;
import task.Card;
import task.Card.Suit;
import task.Card.Value;

public class Deck {
	private ArrayList<Card> Deck = new ArrayList<Card>();
		
		private int cardnumber = 52;
		
		public Deck () {
			for (int x = 0; x <= 12; x++) {
				for (int y = 0; y <=3; y++) { 
					Deck.add(new Card (x,y));
					}
			}
		}
		
		public void deal(int cardnumber, Player...players) {
		for (Player p : players) 
			for (int i=0; i<cardnumber; i++) 
				p.addCard(Deck.remove(i));
		}
	
		public void swap (int... indx, Player...players){
				p.dropCard(indx);
				p.addCard(Deck.remove(indx));				
		}
	
		public void shuffle() {
			Collections.shuffle(Deck);
		}
}
	
	

	