package players;

public class TeamEntity {

	public static final int MAX_TEAM_NUMBER = 2;
	
	public static final int DEFAULT_GAME_SIZE = 6;
	
	public static final int REDUCED_GAME_SIZE = 4;

    private Team redTeam;
    private Team blueTeam;
    
    
    public TeamEntity(int gameSize) {
        if(gameSize == DEFAULT_GAME_SIZE) {
         	redTeam = new Team(0, 2, 4, "red");
            blueTeam = new Team(1, 3, 5, "blue");
        }else {
        	redTeam = new Team(0, 2, "red");
        	blueTeam = new Team(1, 3, "blue");
        }
    }
    
    public boolean isGameOver() {
    	return redTeam.getMyHealth() <= 0 || blueTeam.getMyHealth() <= 0 ||
    			redTeam.getMyGrails() >= 5 || blueTeam.getMyGrails() >= 5;
    }
    
    public Team getWinner() {
    	if(isGameOver()) {
    		if(redTeam.getMyHealth() <= 0 || blueTeam.getMyGrails() >= 5) return blueTeam;   	
    	    return blueTeam;
    	}
    	return null;
    }
    
    




}
