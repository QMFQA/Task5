package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Player {
   
	private String name;
	private List <Card> cards = new ArrayList<Card>();

	public Player(String name){
		this.name = name;
	}
	
	public List <Card> getCards(){
		return cards;
	}
	
	public void printHand(){
		for(Card card: cards){
			System.out.printf("[%s of %s]", card.getValue().getAbbreviation(), card.getSuit().getAbbreviation());
		}
		System.out.println();
	}
	
	public void sort(){
		
		Collections.sort(cards);
	}

	public void sort(Comparator<Card> comparator) {
		Collections.sort(cards, comparator);
	}
	
	@Override
	public String toString(){
		return name;
	}

}


