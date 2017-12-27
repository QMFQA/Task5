package task;

public class Card implements Comparable<Card> {

	public enum Suit {
		HEARTS, DIAMONDS, SPADES, CLUBS
	};
	
	public enum Value {
		DEUCE ("2"), THREE ("3"), FOUR ("4"), FIVE ("5"), SIX ("6"),
        SEVEN ("7"), EIGHT ("8"), NINE ("9"), TEN ("10"), JACK ("J"), QUEEN ("Q"), KING ("K"), ACE ("A");
        
        private String value;
		
		private Value(String value) {
			this.value = value;
		}
	};
	
	private final Suit suit;
	private final Value value;
	
	public Card(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}

	public Suit getSuit() {
		return suit;
	}

	public Value getValue() {
		return value;
	}

	@Override
	public int compareTo(Card other) {
		int comparison = 0;
		
		comparison = this.getSuit().compareTo(other.getSuit());
		
		if (comparison == 0) {
			comparison = this.getValue().compareTo(other.getValue());
		}
		
		return comparison;
	}
	
	@Override
	public String toString() {
		return "[" + this.value.value + " of " + this.suit + "]";
	}
}
