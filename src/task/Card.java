package task;

public class Card implements Comparable<Card>{
	public static enum Suit {
		HEARTS("Hearts"),
		DIAMONDS("Diamonds"),
		SPADES("Spades"),
		CLUBS("Clubs");
		
		public String _suit;
		
		Suit(String name){
			_suit = name;
		}
	};
	
	public static enum Value {
		Two("2"),
		Three("3"),
		Four("4"), 
		Five("5"), 
		Six("6"), 
		Seven("7"), 
		Eight("8"), 
		Nine("9"), 
		Ten("10"), 
		Jack("J"), 
		Queen("Q"), 
		King("K"), 
		Ace("A");
		
		public String _value;
		
		Value(String name){
			_value = name;;
		}
		};
	
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
		return  card_value._value + " of " + card_suit._suit;
	}

}


