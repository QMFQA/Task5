package task;

import task.Comparable;

public class Card implements Comparable <Card>{
	
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
		String s="[" + cardValue.val.toString() + " of " + cardSuit.toString() + "]";
		return s;
	}

	@Override
	public int compareTo(Card otherCard) {
		if (this.cardSuit.ordinal() < otherCard.cardSuit.ordinal()) return -1;
		if (this.cardSuit.ordinal() > otherCard.cardSuit.ordinal()) return 1;
		else {
			if (this.cardValue.ordinal() < otherCard.cardValue.ordinal()) return -1;
			else return 1; //Предполагается, что в колоде нет повторяющихся карт
		}
	}
	
	public enum Value {
		Two ("2"), Three ("3"), Four ("4"), Five ("5"), Six ("6"), Seven ("7"), Eight ("8"),
		Nine ("9"), Ten ("10"), Jack ("J"), Queen ("Q"), King ("K"), Ace ("A");
		
		private String val;
		
		private Value (String val) {
			this.val = val;
    	}
	}

	public enum Suit {
		Hearts, Diamonds, Spades, Clubs
	}
}
