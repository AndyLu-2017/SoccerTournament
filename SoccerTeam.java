
public class SoccerTeam {

	private static int myWins = 0, myLosses = 0, myTies = 0, myScore = 0;
	private static int opWins = 0, opLosses = 0, opTies = 0, opScore = 0;
	private static int totalGames = 0, totalScore = 0;
	
	public void played(SoccerTeam opponent, int myScore, int opponentScore) {
		if(myScore == 3 && opponentScore == 0) {
			this.myWins++;
			this.opLosses++;
		}
		
		if(myScore == 0 && opponentScore == 3) {
			this.opWins++;
			this.myLosses++;
		}
		
		if(myScore == 1 && opponentScore == 1) {
			this.myTies++;
			this.opTies++;
		}
		this.myScore += myScore;
		this.opScore += opponentScore;
		this.totalGames++;
		this.totalScore += myScore + opponentScore;
	}
	
	public static void startTournament() {
		myWins = 0;
		myLosses = 0;
		myTies = 0;
		myScore = 0;
		opWins = 0;
		opLosses = 0;
		opTies = 0;
		opScore = 0;
		totalGames = 0;
		totalScore = 0;
	}
	
	public static void reset() {
		myWins = 0;
		myLosses = 0;
		myTies = 0;
		myScore = 0;
		opWins = 0;
		opLosses = 0;
		opTies = 0;
		opScore = 0;
	}
	
	public String getScore() {
		return "Score - " + myScore + ":" + opScore;
	}
	
	public static int getTotalGames() {
		return totalGames;
	}
	
	public static int getTotalScore() {
		return totalScore;
	}

}
