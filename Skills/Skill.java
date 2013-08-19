package Skills;

import java.util.List;

import players.Player;
import cards.ICard;

public abstract class Skill {

	
	public abstract void cast(List<Player> players, List<ICard> targetCards);
	public abstract String getSkillName();
	public abstract String getSkillDescription();
	
}
