package cards;

public class Deck {
	public static int numSuits = 4;
	public static int numRanks = 13;
	public static int numCards = numSuits * numRanks;
	
	private Card[][] cards;
	
	public Deck() {
		cards = new Card[numSuits][numRanks];
		for(int i = 0; i < numSuits; i++) {
			for(int j = 0; j < numRanks; j++) {
				cards[i][j] = new Card(i+1,j+1);
			}
		}
	}
	
	public Card getCard(int suit, int rank) {
		return cards[suit-1][rank-1];
	}
}
