package task;

public class Card implements Comparable<Card> {

	public enum Value {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}

	public enum Suit {
		HEARTS, DIAMONDS, SPADES, CLUBS
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
		String value_name = "";
		switch (value) {
		case TWO:
			value_name = "2";
			break;
		case THREE:
			value_name = "3";
			break;
		case FOUR:
			value_name = "4";
			break;
		case FIVE:
			value_name = "5";
			break;
		case SIX:
			value_name = "6";
			break;
		case SEVEN:
			value_name = "7";
			break;
		case EIGHT:
			value_name = "8";
			break;
		case NINE:
			value_name = "9";
			break;
		case TEN:
			value_name = "10";
			break;
		case JACK:
			value_name = "J";
			break;
		case QUEEN:
			value_name = "Q";
			break;
		case KING:
			value_name = "K";
			break;
		case ACE:
			value_name = "A";
			break;
		default:
			break;
		}
		return "[" + value_name + " of " + suit.toString() + "]";
	}

}
