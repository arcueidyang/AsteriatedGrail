package cards.defense;

import cards.AbstractCard;

public abstract class DefenseCard extends AbstractCard {

	private boolean isPassive;
	
	public DefenseCard(int cardType, String cardName) {
		super(cardType, cardName);
	}

	public boolean isPassive() {
		return isPassive;
	}
	
}
