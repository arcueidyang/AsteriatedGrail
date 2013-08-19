package cards.attack;

import java.util.ArrayList;
import java.util.List;

import Skills.Skill;
import cards.AbstractCard;

public abstract class AttackCard extends AbstractCard {

	public static final int PHYSICAL_ATTACK = 0;
	public static final int MAGICAL_ATTACK = 1;
	private static final int DEFAULT_DAMAGE_WHEN_HIT = 2;
	
	private List<Skill> mySkills;
	private int myAttackType;
	private int damageWhenHit;
	
	
	public AttackCard(String cardName, int attackType, List<Skill> skills) {
		super(1, cardName);
		myAttackType = attackType;
		mySkills = new ArrayList<Skill>();
		mySkills.addAll(skills);
		damageWhenHit = DEFAULT_DAMAGE_WHEN_HIT;
	}
	
	public List<Skill> getSkills() {
		return mySkills;
	}
	
	public boolean isPhysicalAttack() {
		return myAttackType == PHYSICAL_ATTACK;
	}
	
	public boolean isMagicalAttack() {
		return myAttackType == MAGICAL_ATTACK;
	}
	
	public void setDamage(int damage) {
		damageWhenHit = damage;
	}
	
	public int getDamage() {
		return damageWhenHit;
	}
	
	
}
