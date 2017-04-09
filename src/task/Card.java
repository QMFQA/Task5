package task;


public class Card  implements Comparable<Card>{
	public enum Suit { 
		Hearts, Diamonds, Spades, Clubs 
	}
	public enum Value { 
		Ace, King, Queen, Jack, Ten, Nine,
		Eight, Seven, Six, Five, Four, Three, Two
	}

	private Suit s;
	private Value v;

	public Card( Suit newS, Value newV ) {
		s = newS;
		v = newV;
	}

	@Override
	public int compareTo(Card arg0) {
		int result;
		
		if( (result = s.compareTo(arg0.s)) == 0 ) {
			result = v.compareTo(arg0.v);
		}
		return result;
	}

	@Override
	public String toString() {
		return v + " of " + s;
	}

}
