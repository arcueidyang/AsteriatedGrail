package cards;

import players.Player;

public interface ICard {
	
	/**
	 * execute this card as attacker or skill caster
	 */
	public abstract void affect(Player player);
	
	
	
}
