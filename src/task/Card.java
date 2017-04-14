package task;

public class Card 
implements Comparable<Card>
{
	public enum Suit { HEARTS, DIAMONDS, SPADES, CLUBS };
	public enum Value { DEUCE(2, "2"), THREE(3, "3"), FOUR(4, "4"), FIVE(5, "5"), SIX(6, "6"), SEVEN(7, "7"), EIGHT(8, "8"), NINE(9, "9"), TEN(10, "10"), JACK(11, "J"), QUEEN (12, "Q"), KING(13, "K"), ACE(14, "A"); 
		private int rank; 
		private String name;
		private Value(int rank, String name){ 
			this.rank = rank; 
			this.name = name;
		}			
	};
	
    private final Value value;
    private final Suit suit;

    
    private Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
    
    public Value getValue() 
    { 
    	return value; 
    }
    public Suit getSuit() 
    { 
    	return suit; 
    }

	@Override
	public int compareTo(Card card) {
		if (this.suit.ordinal() <= card.suit.ordinal())
		{
			if (this.value.rank < card.value.rank)
			{
				return -1;
			}
		}
		else
			return 1;
		return 0;
	}
    
    
}
