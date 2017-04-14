package task;

public class Card implements Comparable<Card> {

	public enum Value {
		TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"), JACK(
				"J"), QUEEN("Q"), KING("K"), ACE("A");

		private String name;

		private Value(String name) {
			this.name = name;
		}
	}

	public enum Suit {
		HEARTS("Hearts"), DIAMONDS("Diamonds"), SPADES("Spades"), CLUBS("Clubs");

		private String name;

		private Suit(String name) {
			this.name = name;
		}
	}

	private Suit suit;
	private Value value;

	public Card(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}

	@Override
	public int compareTo(Card card) {
		int comp_result;
		comp_result = suit.compareTo(card.suit);
		if (comp_result == 0) {
			comp_result = value.compareTo(card.value);
		}
		return comp_result;
	}

	@Override
	public String toString() {
		return "[" + value.name + " of " + suit.name + "]";
	}

}
