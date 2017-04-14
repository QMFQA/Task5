package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> list = new ArrayList<Card>();

	public Deck() {
		for (Card.Value value : Card.Value.values()) {
			for (Card.Suit suit : Card.Suit.values()) {
				list.add(new Card(suit, value));
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(list);
	}

	public void deal(int count_card, Player... players) {
		for (int i = 0; i < count_card; i++) {
			for (Player player : players) {
				player.take(list.remove(0));
			}
		}
	}

	public void swap(Player player, int... indexes) {
		int counter = 0;
		for (int index : indexes) {
			player.hand.remove(index - counter - 1);
			counter++;
		}
		deal(counter, player);
	}
}
