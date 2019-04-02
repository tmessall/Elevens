/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] suits = new String[]{"Hearts", "Spades", "Clubs", "Diamonds"};
		String[] ranks1 = new String[]{"King", "Ace", "Queen"};
		String[] ranks2 = new String[]{"Two", "Three", "Four"};
		String[] ranks3 = new String[]{"Seven", "Eight", "Nine"};
		int[] values1 = new int[]{13, 14, 12};
		int[] values2 = new int[]{2, 3, 4};
		int[] values3 = new int[]{7, 8, 9};
	
		Deck deck1 = new Deck(ranks1, suits, values1);
		Deck deck2 = new Deck(ranks2, suits, values2);
		Deck deck3 = new Deck(ranks3, suits, values3);

		while (!deck1.isEmpty()) {
			System.out.println(deck1.deal().toString());
		}
		while (!deck2.isEmpty()) {
			System.out.println(deck2.deal().toString());
		}
		while (!deck3.isEmpty()) {
			System.out.println(deck3.deal().toString());
		}
	}
}
