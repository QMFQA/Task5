package task;
import task.Card.Suit;
import task.Card.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List <Card> cards = new ArrayList <Card>();
	
	public Deck(){
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                cards.add(new Card(value, suit));
            }
        }
	}
	
	public void deal (int numberOfCards, Player... players){
		while (numberOfCards > 0){
			for(Player player:players){
				player.addCard(cards.remove(0));
			}
			numberOfCards--;
		}
	}
	
	public void swap (Player player, Integer... indexOfCards){
		for(Integer index:indexOfCards){
			player.replaceCard(index, cards.remove(0));
		}
	}
	
	public void shuffle(){
		Collections.shuffle(cards);
	}
}
