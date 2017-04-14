package task;

import java.util.ArrayList;
import java.util.Collections;

import task.Card;
import task.Card.Suit;
import task.Card.Value;

public class Deck {
	private ArrayList<Card> Cards = new ArrayList<Card>();
	
	public Deck() {
		populate();
	}
	
	public void deal( int nCards, Player ...players ) {
		for (Player p : players){
			for( int i=0; i < nCards; i++ ) {
				p.takeCard(Cards.remove(0));
			}
		}
	}

	private void populate() {
		for( Suit s : Suit.values() ) {
			for( Value v : Value.values() ) {
				Cards.add(new Card(s, v));
			}
		}
	}
	
	public void swap( Player p, int ...idxs ) {
		p.dropCards(idxs);
		this.deal( idxs.length, p );
	}

	public void shuffle() {
		Collections.shuffle( Cards );
	}
}
