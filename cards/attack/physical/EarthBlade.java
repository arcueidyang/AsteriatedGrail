package cards.attack.physical;

import java.util.List;

import Skills.Skill;
import cards.attack.PhysicalAttackCard;

public class EarthBlade extends PhysicalAttackCard {

	public EarthBlade(String cardName, List<Skill> skills,
			boolean isDefensable) {
		super(cardName, skills, Attribute.earth, isDefensable);
	}

}
