package task;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> card_deck;

	public Deck(){
		card_deck = new ArrayList<Card>();
		for (Card.Suit suit: Card.Suit.values()){
			for (Card.Value value: Card.Value.values())
				card_deck.add(new Card(suit, value));
		}
	}
	
	public void shuffle(){
		Collections.shuffle(card_deck);
	}
	
	public void deal(Integer Cards_count, Player... person){
		for (Player p : person) 
			for (int i=0; i<Cards_count; i++) 
				p.addCard(card_deck.remove(i));
	}
	
	public void swap(Player person, Integer... card_num){
		for (int i:card_num){
			person.removeCard(i);
			person.addCard(card_deck.remove(0));
		}
			
	}
	
}
