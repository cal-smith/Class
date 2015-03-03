public class Match {
	String player1_name;
	String player2_name;
	String player1_race;
	String player2_race;
	String winner;
	
	public Match(String p1, String p2, String p1r, String p2r, String w){
		this.player1_name = p1;
		this.player2_name = p2;
		this.player1_race = p1r;
		this.player2_race = p2r;
		this.winner = w;
	}
	
	public String winningRace() {
		if (this.winner.equals(this.player1_name)) {
			return this.player1_race;
		}
		return this.player2_race;
	}

	public String toString(){
		return this.player1_name +" "+ this.player1_race +" -vs- "+ this.player2_name +" "+ this.player2_race +" => winner: "+ this.winner;
	}
}