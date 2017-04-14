package task;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String name;
	private List<Card> cards = new ArrayList<>();
	
	public Player(String _name){
		name = _name;
	}
	
	public void printHand(){
		StringBuilder all_Cards = new StringBuilder();
		for (int i=0; i<cards.size(); i++)
			all_Cards.append("[" + cards.get(i) + "] ");
		System.out.println(all_Cards);
	}

	public void addCard(Card onecard){
		cards.add(onecard);
	}
	
	public void removeCard(int index){
		cards.remove(index);
	}
	
	public void sort(){
		
	}
	
	@Override
	public String toString(){
		return name;
	}
	
}
