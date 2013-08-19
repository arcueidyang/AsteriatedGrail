package players;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exceptions.WrongParameterException;

public class Team {

	public static final int STANDARD_PLAYER_NUMBER_IN_TEAM = 3;
	
	public static final int REDUCED_PLAYER_NUMBER_IN_TEAM = 2;

	public static final int INITIAL_HEALTH_POINTS = 15;
	
	public static final int INITIAL_RED_DIAMOND_NUMBER = 0;
	
	public static final int INITIAL_BLUE_DIAMOND_NUMBER = 0;
	
	public static final int INITIAL_GRAIL_NUMNER = 0;
	
	public static final int REMOVE_RED_AND_BLUE = 0;
	
	public static final int REMOVE_BLUE_ONLY = 1;
	
    private Map<Integer, Player> playerMap;
    private List<Integer> indicesOfPlayers;
    private String myTeamName;
    private int myHealth;
    private int myRedDiamonds;
    private int myBlueDiamonds;
    private int myGrails;
    
    public Team(int index1, int index2, String teamName) {
    	init();
    	myTeamName = teamName;
    	Player p1 = new Player(this);
    	Player p2 = new Player(this);
    	indicesOfPlayers.add(index1);
    	playerMap.put(index1, p1);
    	indicesOfPlayers.add(index2);
    	playerMap.put(index2, p2);
    }
    
    
    public Team(int index1, int index2, int index3, String teamName) {
    	this(index1, index2, teamName);
    	Player p3 = new Player(this);
    	indicesOfPlayers.add(index3);
    	playerMap.put(index3, p3);
    }
    
    public void init() {
    	playerMap = new HashMap<Integer, Player>();
    	indicesOfPlayers = new ArrayList<Integer>();
    	myHealth = INITIAL_HEALTH_POINTS;
        myRedDiamonds = INITIAL_RED_DIAMOND_NUMBER;
        myBlueDiamonds = INITIAL_BLUE_DIAMOND_NUMBER;
        myGrails = INITIAL_GRAIL_NUMNER;
    }
    
    public void addGrail() {
        myGrails ++;    	
    }
    
    public void addRedDiamond() {
    	myRedDiamonds ++;
    }

    public void addBlueDiamond() {
    	myBlueDiamonds ++;
    }
    public void removeDiamonds(int mode)throws WrongParameterException{
    	switch(mode) {
    	case REMOVE_RED_AND_BLUE :{
    		myRedDiamonds --;
    		myBlueDiamonds --;
    		break;
    	}
    	case REMOVE_BLUE_ONLY :{
    		myBlueDiamonds -= 2;
    		break;
    	}
    	default : throw new WrongParameterException("Cannot remove diamonds in this way");
    	}
    }
    
    public void loseHealth(int value) {
    	myHealth -= value;
    }
    
    public boolean isInThisTeam(int index) {
    	return playerMap.containsKey(index);
    }
    
    public boolean isInThisTeam(Player player) {
     	return playerMap.containsValue(player);
    }
    
    public void gainHealth(int value) {
    	myHealth += value;
    }

    public String getTeamName() {
    	return myTeamName;
    }
    
	public int getMyHealth() {
		return myHealth;
	}

	public int getMyRedDiamonds() {
		return myRedDiamonds;
	}

	public int getMyBlueDiamonds() {
		return myBlueDiamonds;
	}

	public int getMyGrails() {
		return myGrails;
	}
    
    
    
    


}
