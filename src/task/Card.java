package task;

import java.lang.Enum;
import java.lang.Integer;


public class Card {
	
	private final Value value;
	private final Suit suit;
	
    public enum Suit {Hearts, Diamonds, Spades, Clubs}
    public enum Value {two(2), three(3), four(4), five(5), six(6), seven(7), eight(8), nine(9), ten(10), J(11), Q(12), K(13), A(14);
    private final int value;

       

        public int getValue() {
            return value;
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
     	if (suit == card.suit)
     	{
     	return value.compareTo(card.value);
     	}
     	return suit.compareTo(card.suit);
     	}
}
	

	


