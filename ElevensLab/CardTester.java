public class CardTester {

	public static void main(String[] args) {
	Card one = new Card("3", "Hearts", 3);
	Card two = new Card("2", "Spades", 3);
	Card three = new Card("3", "Hearts", 3);
	
	
	
	System.out.println("One matches 3: " + one.matches(three));
	System.out.println("One matches 2: " + one.matches(two));    
	System.out.println("Suit: " + one.suit());
	System.out.println("Card/Rank: " + one.toString());
	}
}
