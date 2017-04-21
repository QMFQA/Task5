package task;


public class Card implements Comparable <Card> {	
	private Value x;
	public Suit y;
	
	public Card (Value x, Suit y) {
		this.x = x;
		this.y = y;
		}
	
	public enum Value {
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
		
		private String name;
		
		private Value (String name) {
			this.name=name;
		}
	}

	public enum Suit {
		Hearts("Hearts"), 
		Diamonds("Diamonds"), 
		Spades ("Spades"), 
		Clubs("Clubs");
		
		private String name;
		
		private Suit (String name){
			this.name=name;
		}
	}

	@Override
	public int compareTo(Card arg0) {
		int result;
		
		if( (result = y.compareTo(arg0.y)) == 0 ) {
			result = x.compareTo(arg0.x);
		}
		return result;
	}

	public String toString () {
		return "[" + x.name + " of " + y.name + "]";
		}
}
