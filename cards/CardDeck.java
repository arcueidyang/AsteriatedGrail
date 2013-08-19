package cards;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cards.ICard;


public class CardDeck {

	
	private static List<ICard> myDeck;
	private static Random myRandom;
	
	private CardDeck() {
		myDeck = new ArrayList<ICard>();
		myRandom = new Random();
		reset();
	}
	
	public void reset() {
		//TODO
	}
	
	public static ICard randomPickCard() {
		return myDeck.get(myRandom.nextInt(myDeck.size()));
	}
}
