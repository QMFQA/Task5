package task;

import java.util.ArrayList;
import java.util.Comparator;

public class Player {
	private ArrayList<Card> Cards;	
	private String name;
	
	public Player( String newName ) {
		Cards = new ArrayList<Card>();
		name = newName;
	}
	
	public void printHand() {
		for(Card c : Cards) {
            System.out.print(c);
        }
		System.out.print("\n");
	}

	public void takeCard( Card c ) {
		if( c != null ) {
			Cards.add( c );
		}
	}
	
	public void dropCards( int ...i ) {
		ArrayList<Card> toDel = new ArrayList<Card>();
	
		for( int idx : i ) {
			toDel.add(this.Cards.get(idx));
		}
		boolean t = this.Cards.removeAll(toDel);
	}
	
	public void sort() {
		Cards.sort( null );
	}

	public void sort( Comparator<Card> c) {
		Cards.sort( c );
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
