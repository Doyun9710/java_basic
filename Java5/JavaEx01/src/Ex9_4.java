class Card {
	String kind;
	int number;
	
	Card() {
		// TODO Auto-generated constructor stub
		this("SPADE", 1);
	}

	public Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}

public class Ex9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
