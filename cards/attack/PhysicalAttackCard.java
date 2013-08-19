package cards.attack;

import java.util.List;

import cards.CardDeck;

import players.Player;
import Skills.Skill;

public class PhysicalAttackCard extends AttackCard {
	
	public enum Attribute{
		wind, fire, water, thunder, earth, dark
	}
	
	private Attribute myAttribute;
	private boolean isDefensable;
	
	

	public PhysicalAttackCard(String cardName, List<Skill> skills, Attribute attribute, boolean isDefensable) {
		super(cardName, AttackCard.PHYSICAL_ATTACK, skills);
		myAttribute = attribute;
	}
	
	public String getAttackAttribute() {
		return myAttribute.toString();
	}
	
	public boolean isDefensable() {
		return isDefensable;
	}
	
}
