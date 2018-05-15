/*
 * Main file for Bowling Game Laboration 5
 */

public class BowlingGame {

	private int score = 0;
	
	public void roll(int nrOfPinsKnockedDown) {
		score += nrOfPinsKnockedDown;
	}
	
	public int score() {
		return score;
	}
}


