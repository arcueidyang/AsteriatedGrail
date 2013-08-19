package cards;



import players.Player;

public abstract class AbstractCard implements ICard {
	
	public static final int CHARACTER_CARD = 0;
	public static final int ATTACK_CARD = 1;
	public static final int DEFENSE_CARD = 2;
	
	
	private int myCardType;
	private String myCardName;
	
	public AbstractCard(int cardType, String cardName) {
		myCardType = cardType;
		myCardName = cardName;
	}
	
	
	@Override
	public void affect(Player player) {
		// TODO Auto-generated method stub
		
	} 
	
	public String getCardName() {
		return myCardName;
	}
	
	public int getCardType() {
		return myCardType;
	} 
}
