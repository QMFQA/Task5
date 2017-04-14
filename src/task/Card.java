package task;


public class Card  implements Comparable<Card>{
	public enum Suit { 
		HEARTS("Hearts"), 
		DIAMONDS("Diamonds"), 
		SPADES("Spades"), 
		CLUBS("Clubs"); 
		
		private String name;
		
		private Suit( String newName ) {
			name = newName;
		}
	}
	
	public enum Value  { 
		ACE {
			@Override
			public String toString() { return "A"; }
		},
		KING {
			@Override
			public String toString() { return "K"; }
		},
		QUEEN {
			@Override
			public String toString() { return "Q"; }
		}, 
		JACK {
			@Override
			public String toString() { return "J"; }
		},
		TEN {
			@Override
			public String toString() { return "10"; }
		}, 
		NAME {
			@Override
			public String toString() { return "9"; }
		},
		EIGHT {
			@Override
			public String toString() { return "8"; }
		}, 
		SEVEN {
			@Override
			public String toString() { return "7"; }
		},
		SIX {
			@Override
			public String toString() { return "6"; }
		}, 
		FIVE {
			@Override
			public String toString() { return "5"; }
		}, 
		FOUR {
			@Override
			public String toString() { return "4"; }
		}, 
		THREE {
			@Override
			public String toString() { return "3"; }
		}, 
		TWO {
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
		return "[ " + v + " of " + s.name + " ]";
	}

}
