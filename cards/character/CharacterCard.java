package cards.character;

import java.util.ArrayList;
import java.util.List;

import cards.AbstractCard;
import cards.ICard;

import Skills.Skill;

public abstract class CharacterCard extends AbstractCard {

	private int myDifficulty;
	
	private List<Skill> myNormalSkills;
	private List<Skill> myUltraSkills;
	
	private boolean isUltraSkillAvailable;
	
	public CharacterCard(String cardName, int difficulty, List<Skill> normalSkills, List<Skill> ultraSkills) {
		super(0, cardName);
		isUltraSkillAvailable = false;
		myDifficulty = difficulty;
		myNormalSkills = new ArrayList<Skill>();
		myNormalSkills.addAll(normalSkills);
		myUltraSkills = new ArrayList<Skill>();
		myUltraSkills.addAll(ultraSkills);
	}
	public abstract boolean isSkillAvailable(ICard card);
    public abstract void castSkill(Skill target);
    
    public boolean isUltarSkillAvailable() {
    	return isUltraSkillAvailable;
    }
    
    public int getMyDifficulty() {
    	return myDifficulty;
    }

}
