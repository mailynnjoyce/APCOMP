import java.util.List;
import java.util.ArrayList;

public class Deck {

	private List<Card> cards;
	private int size;
	
	public Deck(String[] ranks, String[] suits, int[] values) {
		this.cards = new ArrayList<Card>();
        for (int i = 0; i < ranks.length; i++) {
            Card aCard = new Card(ranks[i], suits[i], values[i]);
            this.cards.add(aCard);
        }
        this.size = this.cards.size();
        shuffle();
	}

	public boolean isEmpty() {
		return cards.isEmpty();
	}

	public int size() {
		return cards.size();
	}

	public void shuffle() {
		for( int i = size - 1; i >= 0; i-- ) 
		{
            int r = (int)(Math.random() * i);
            Card tmp = cards.get(r);
            cards.set(r, cards.get(i));
            cards.set(i, tmp);
        }
	}

	public Card deal() {
	    this.size = this.size - 1;
		if (this.size > 0) 
		{
			return this.cards.get(this.size);
		}
		return null;
	}

	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int i = size - 1; i >= 0; i--) {
			rtn = rtn + cards.get(i);
			if (i != 0) {
				rtn = rtn + ", ";
			}
			if ((size - i) % 2 == 0) {
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int i = cards.size() - 1; i >= size; i--) {
			rtn = rtn + cards.get(i);
			if (i != size) {
				rtn = rtn + ", ";
			}
			if ((i - cards.size()) % 2 == 0) {
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
