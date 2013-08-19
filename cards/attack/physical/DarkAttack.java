package cards.attack.physical;

import java.util.List;

import players.Player;

import Skills.Skill;
import cards.attack.PhysicalAttackCard;

public class DarkAttack extends PhysicalAttackCard {

	public DarkAttack(String cardName, List<Skill> skills) {
		super(cardName, skills, PhysicalAttackCard.Attribute.dark, false);
	}
	
	public void attack(Player p) {
		
	}

}
