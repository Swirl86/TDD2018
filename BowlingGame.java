/*
 * Main file for Bowling Game Laboration 5
 */

public class BowlingGame {
	private int rolls[] = new int[21];
	private int aRoll = 0;
	private int score = 0;

	public void roll(int nrOfPinsKnockedDown) {
		rolls[aRoll++] = nrOfPinsKnockedDown;
	}

	public int score() {
		int frameNr = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (rolls[frameNr] == 10) {
				score += 10 + rolls[frameNr + 1] + rolls[frameNr + 2];
				frameNr++;
			} else if (rolls[frameNr] + rolls[frameNr + 1] == 10) {
				score += 10 + rolls[frameNr + 2];
				frameNr += 2;
			} else {
				score += rolls[frameNr] + rolls[frameNr + 1];
				frameNr += 2;
			}
		}
		return score;
	}
}
