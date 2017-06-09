public class DeckTester {

	public static void main(String[] args) {
		String[] ranks = {"Ace", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "Jack", "Queen", "King"};
		String[] suits = {"Clubs", "Hearts", "Spades", "Diamonds"};
		int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
		Deck deck = new Deck(ranks, suits, pointValues);
		deck.shuffle();
		System.out.println(deck);
		
	}

}
