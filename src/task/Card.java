package task;


public class Card implements Comparable<Card>{
	public static enum Suit {HEARTS, DIAMONDS, SPADES, CLUBS};
	
	public static enum Value {Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace};
	
	private Suit card_suit;
	private Value card_value;
	
	public Card (Suit _suit, Value _value){
		card_suit = _suit;
		card_value = _value;
	}

	@Override
	public int compareTo(Card arg0) {
		if (arg0.card_suit == this.card_suit)
			return this.card_value.compareTo(arg0.card_value);
		else
			return this.card_suit.compareTo(arg0.card_suit);
	}
	
	public Suit get_CardSuit(){
		return card_suit;
	}
	
	public Value get_CardValue(){
		return card_value;
	}

	@Override
	public String toString(){
		StringBuilder returned = new StringBuilder();
		switch (card_value){
		case Two:  returned.append("2");
				break;
		case Three: returned.append("3");
				break;
		case Four: returned.append("4");
				break;
		case Five: returned.append("5");
				break;
		case Six: returned.append("6");
				break;
		case Seven: returned.append("7");
				break;
		case Eight: returned.append("8");
				break;
		case Nine: returned.append("9");
				break;
		case Ten: returned.append("10");
				break;
		case Jack: returned.append("J");
				break;
		case Queen: returned.append("Q");
				break;
		case King: returned.append("K");
				break;
		case Ace: returned.append("A");
				break;
		}
		returned.append(" of ");
		switch (card_suit) {
			case HEARTS: returned.append("Hearts");
						break;
			case CLUBS: returned.append("Clubs");
						break;
			case DIAMONDS: returned.append("Diamonds");
						break;
			case SPADES: returned.append("Spades");
						break;
		}
		
		return returned.toString();
		
	}


}


