package task;

public class Card implements Comparable <Card>{

	private final Value value;
	
	private final Suit suit;
	
	public enum Value { 
		   DEUCE("2") , THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"), JACK("J"), QUEEN("Q"), KING("K"), ACE("A");
		   			
		   private String abbreviation;

		   private Value(String abbreviation){
			   this.abbreviation = abbreviation;
		   }
		   
		   public String getAbbreviation(){
			   return abbreviation;
		   }
	}

	public enum Suit { 
		   HEARTS ("Hearts"), DIAMONDS ("Diamonds"), SPADES ("Spades"), CLUBS ("Clubs");
		
		   private String abbreviation;

		   private Suit(String abbreviation){
			   this.abbreviation = abbreviation;
		   }
		   
		   public String getAbbreviation(){
			   return abbreviation;
		   }
	}
	
	public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
	
	public Value getValue(){
		return value;
	}
	
	public Suit getSuit(){
		return suit;
	}

	@Override
	public int compareTo(Card card) {
		if (suit == card.suit){
				return value.compareTo(card.value);
		}
		return suit.compareTo(card.suit);
	}
	
	

}
