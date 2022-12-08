public class CricketPlayer {
    
        /* This class is complete. Take a look around
         * to make sure you understand how to use it,
         * but you do not need to make changes.
         */
         
    	private String name;
    	private String team;
    	private int totalRunsScored;
        private int totalBallsBowled;
    	private int matchesPlayed;
    
    
        public CricketPlayer(String playerName, String currentTeam) {
            name = playerName;
            team = currentTeam;
            
            // Note that primitive values are automatically initialized
            // so we don't actually need these lines
            totalRunsScored = 0;
            totalBallsBowled = 0;
            matchesPlayed = 0;
        }
        
        public CricketPlayer(String playerName){
            // this() is a shortcut to calling the other constructor
            // in this class. We will see more of 'this' in a later
            // unit, but it is shown here as a best practice.
    		this(playerName, "no team");
        }
        
        public void addMatch(int runsScored, int ballsBowled){
            totalRunsScored += runsScored;
            totalBallsBowled += ballsBowled;
            matchesPlayed++;
        }
        
        public void printRunsScored(){
            System.out.print("Runs scored per match: ");
            System.out.println((double) totalRunsScored / matchesPlayed);
    	}
    
        public void printBallsBowled() {
    		System.out.print("Balls bowled per match: ");
            System.out.println((double) totalBallsBowled / matchesPlayed);
    	}
    
    	public String toString() {
    		return name + " scored an average of " + ((double) totalRunsScored / matchesPlayed) +
    		    " runs during these " + matchesPlayed + " matches.";
    	}
    
    }
