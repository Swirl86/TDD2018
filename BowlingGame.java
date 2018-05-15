/*
 * Main file for Bowling Game Laboration 5
 */

public class BowlingGame {
	private int[] rolls = new int[21];
	private int roll = 0;
	private int score = 0;
	
	public void roll(int nrOfPinsKnockedDown) {
		rolls[roll++] = nrOfPinsKnockedDown;
	}
	
	public int score() {
		for (int i = 0; i < rolls.length; i++) {
			score += rolls[i];
		}
	return score;
}

}


