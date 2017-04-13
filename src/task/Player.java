package task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Player {
	
	private String name;
	private List<Card> playerCard;
	
	public Player(String name) {
		this.name=name;
		playerCard = new ArrayList<>();
	}
	
	public void addCard(Card c) {
		playerCard.add(c);
	}
	
	public void setCard(int index, Card inputCard) {
		playerCard.set(index, inputCard);
	}
	
	public void sort() {
		for (int i=0; i<playerCard.size(); i++)
			for (int j=i; j<playerCard.size(); j++) {
				if (playerCard.get(i).compareTo(playerCard.get(j))>0) {
					Card TempCard = playerCard.get(i);
					playerCard.set(i, playerCard.get(j));
					playerCard.set(j, TempCard); 
				}
			}
		
	}

	public void sort(Comparator<Card> comparator) {
		for (int i=0; i<playerCard.size(); i++)
			for (int j=i; j<playerCard.size(); j++) {
				if (comparator.compare(playerCard.get(i), playerCard.get(j))>0) {
					Card TempCard = playerCard.get(i);
					playerCard.set(i, playerCard.get(j));
					playerCard.set(j, TempCard); 
				}
			}
	}

	public void printHand() {
		for (int i=0; i<playerCard.size(); i++) {
			System.out.print(playerCard.get(i));
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return name;
	}

}
