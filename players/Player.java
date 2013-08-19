package players;

import java.util.ArrayList;
import java.util.List;

import cards.character.CharacterCard;
import cards.ICard;

public class Player {
    
	/**
	 * default handcard upper limit
	 */
	private static int DEFAULT_HANDCARD_UPPER_LIMIT = 6;
	
	private int myHandcardUpperLimit;
	private int leftActTime;

	private List<ICard> myHandcards;
	private CharacterCard myCharacter;
	
	private int myBlueDiamondNumber;
	private int myRedDiamondNumber;

	private Team myTeam;
	
    public Player(Team team) {
    	myHandcards = new ArrayList<ICard>();
    	leftActTime = 0;
    	myBlueDiamondNumber = 0;
    	myRedDiamondNumber = 0;
    	myHandcardUpperLimit = DEFAULT_HANDCARD_UPPER_LIMIT;
        myTeam = team;
    }	
    
    public void setCharacterCard(CharacterCard card) {
    	myCharacter = card;
    }
    
    
    public ICard getCharacterCard() {
    	return myCharacter;
    }
    
    public void addHandcard(ICard card) {
    	myHandcards.add(card);
    }
    
    public int currentHandcardNumber() {
    	return myHandcards.size();
    }
    
    public boolean isHandcardBeyondLimit() {
    	return myHandcards.size() > myHandcardUpperLimit;
    }
    
    public void removeHandcard(int index) {
    	myHandcards.remove(index);
    }
    
    public void removeHandcard(ICard card) {
    	myHandcards.remove(card);
    }
    
    public void randomRemoveCard() {
    	myHandcards.remove((int)Math.random() % myHandcards.size());
    }
    
    public void removeActTime() {
    	leftActTime --;
    }
    
    public void addBlueDiamond(int number) {
    	myBlueDiamondNumber += number;
    }
    
    public void removeBlueDiamond(int number) {
    	myBlueDiamondNumber -= number;
    }
    
    public void addRedDiamond(int number) {
    	myRedDiamondNumber += number;
    }
    
    public void removeRedDiamond(int number) {
    	myRedDiamondNumber -= number;
    }
    
    public int getRedDiamondNumber() {
    	return myRedDiamondNumber;
    }
    
    public int getBlueDiamondNumber() {
    	return myBlueDiamondNumber;
    }
    
    public void playCard(Player targetPlayer, int index) {
    	ICard targetCard = myHandcards.get(index);
    	if(leftActTime > 0) {
    		targetCard.affect(targetPlayer);
    	}
    }
    
    public Team getMyTeam() {
    	return myTeam;
    }
	
    
}
