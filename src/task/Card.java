package task;


public class Card implements Comparable<Card>{
	public static enum Suit {Hearts, Diamonds, Spades, Clubs};
	
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
		return card_value + " of " + card_suit;
		
	}


}

