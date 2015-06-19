package cards;

public class CardsDemo {
	public static void main(String[] args) {
		Deck deck = new Deck();
		Card test = deck.getCard(2,11);
		System.out.println("Suit: " + Card.suitToString(test.getSuit()) + " Rank: " + Card.rankToString(test.getRank()));
	}
}
