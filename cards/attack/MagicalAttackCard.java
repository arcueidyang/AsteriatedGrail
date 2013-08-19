package cards.attack;

import java.util.List;

import Skills.Skill;

public abstract class MagicalAttackCard extends AttackCard {

	private boolean isClockWise;
	
	public MagicalAttackCard(String cardName, List<Skill> skills) {
		super(cardName, AttackCard.MAGICAL_ATTACK, skills);
		isClockWise = true;
	}
	
    public boolean isClockWise() {
    	return isClockWise;
    }

	
}
