package task;


public class Card implements Comparable<Card>{
	
	private Value cardValue;
	private Suit cardSuit;
	
	public Card (int inCardValue, int inCardSuit) {
		try {
			this.cardValue = Value.values()[inCardValue];
			this.cardSuit = Suit.values()[inCardSuit];
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Wrong value for card: " + ex.getMessage());
			System.exit(1);
		}
	}
	
	public Value getCardValue() {
		return cardValue;
	}
	
	public Suit getCardSuit() {
		return cardSuit;
	}
	
	public static int getValuelength () {
		return Value.values().length;
	}
	
	public static int getSuitlength () {
		return Suit.values().length;
	}
	
	@Override
	public String toString() {
		String s="[" + cardValue + " of " + cardSuit + "]";
		return s;
	}

	@Override
	public int compareTo(Card otherCard) {
		int result=this.cardSuit.compareTo(otherCard.cardSuit);
		if (result==0) {
			result=this.cardValue.compareTo(otherCard.cardValue);
		}
		return result;
	}
	
	public enum Value {
		Two ("2"), Three ("3"), Four ("4"), Five ("5"), Six ("6"), Seven ("7"), Eight ("8"),
		Nine ("9"), Ten ("10"), Jack ("J"), Queen ("Q"), King ("K"), Ace ("A");
		
		private String val;
		
		private Value (String val) {
			this.val = val;
    	}
		
		@Override
		public String toString(){
			return val;
		}
	}

	public enum Suit {
		HEARTS("Hearts"), DIAMONDS("Diamonds"), SPADES("Spades"), CLUBS("Clubs");
		
		private String val;
		
		private Suit (String val) {
			this.val = val;
    	}
		
		@Override
		public String toString(){
			return val;
		}
	}
}
