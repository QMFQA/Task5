package task;


public class Card  implements Comparable<Card>{
	public enum Suit { 
		Hearts, Diamonds, Spades, Clubs 
	}
	public enum Value  { 
		Ace {
			@Override
			public String toString() { return "A"; }
		},
		King {
			@Override
			public String toString() { return "K"; }
		},
		Queen {
			@Override
			public String toString() { return "Q"; }
		}, 
		Jack {
			@Override
			public String toString() { return "J"; }
		},
		Ten {
			@Override
			public String toString() { return "10"; }
		}, 
		Nine {
			@Override
			public String toString() { return "9"; }
		},
		Eight {
			@Override
			public String toString() { return "8"; }
		}, 
		Seven {
			@Override
			public String toString() { return "7"; }
		},
		Six {
			@Override
			public String toString() { return "6"; }
		}, 
		Five {
			@Override
			public String toString() { return "5"; }
		}, 
		Four {
			@Override
			public String toString() { return "4"; }
		}, 
		Three {
			@Override
			public String toString() { return "3"; }
		}, 
		Two {
			@Override
			public String toString() { return "2"; }
		}
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
		return "[ " + v + " of " + s + " ]";
	}

}
