
public class Tester {
	public static void main(String[] args) {
		SoccerTeam team1 = new SoccerTeam();
		SoccerTeam team2 = new SoccerTeam();
		SoccerTeam team3 = new SoccerTeam();
		SoccerTeam team4 = new SoccerTeam();
		
		SoccerTeam.startTournament();
		SoccerTeam.reset();
		team1.played(team2, 3, 0);
		team1.played(team2, 0, 3);
		team1.played(team2, 0, 3);
		team1.played(team2, 0, 3);
		team1.played(team2, 3, 0);
		System.out.println("1st Session [team1 vs team2] " + team1.getScore());
		
		SoccerTeam.reset();
		team4.played(team3, 0, 3);
		team4.played(team3, 0, 3);
		team4.played(team3, 0, 3);
		team4.played(team3, 0, 3);
		team4.played(team3, 3, 0);
		System.out.println("2nd Session [team4 vs team3] " + team4.getScore());
		
		SoccerTeam.reset();
		team3.played(team1, 0, 3);
		team3.played(team1, 3, 0);
		team3.played(team1, 0, 3);
		team3.played(team1, 0, 3);
		team3.played(team1, 3, 0);
		System.out.println("3rd Session [team3 vs team1] " + team3.getScore());
		
		SoccerTeam.reset();
		team2.played(team4, 0, 3);
		team2.played(team4, 3, 0);
		team2.played(team4, 1, 1);
		team2.played(team4, 0, 3);
		team2.played(team4, 0, 3);
		System.out.println("4th Session [team2 vs team4] " + team2.getScore());
		
		
		System.out.println("Total Games: " + SoccerTeam.getTotalGames());
		System.out.println("Total Score: " + SoccerTeam.getTotalScore());
	}
}
