package task;
import java.util.ArrayList;

import task.Card.Suit;
import task.Card.Value;

public class Deck {
	
	private ArrayList<Card> cards;

    public Deck()
    {
    	cards = new ArrayList<Cards>();
    	for(Value v : Value.values())
    	   for(Suit s: Suit.values())
    	      cards.add(new Card(v,s));

    }

	public void shuffle() {
		// TODO Auto-generated method stub
		
	}

	public void deal(int i, Player p1, Player p2) {
		// TODO Auto-generated method stub
		
	}

	public void swap(Player p1, int i) {
		// TODO Auto-generated method stub
		
	}

	public void swap(Player p2, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public void deal(int i, Player p2) {
		// TODO Auto-generated method stub
		
	}

}
