/*
 * Main file for Bowling Game Laboration 5
 */

public class BowlingGame {
	private static final int MAXFRAMES = 10;
	private int rolls[] = new int[21];
	private int aRoll = 0;
	private int score = 0;

	public void roll(int nrOfPinsKnockedDown) {
		rolls[aRoll++] = nrOfPinsKnockedDown;
	}

	public int score() {
		int frameNr = 0;
		for (int frame = 0; frame < MAXFRAMES; frame++) {
			if (isAStrike(frameNr)) {
				score += strikeScore(frameNr);
				frameNr++;
			} else if (isASpare(frameNr)) {
				score += spareScore(frameNr);
				frameNr += 2;
			} else {
				score += sumOfFrameScore(frameNr);
				frameNr += 2;
			}
		}
		return score;
	}

	private boolean isASpare(int frameNr) {
		return sumOfFrameScore(frameNr) == 10;
	}

	private boolean isAStrike(int frameNr) {
		return rolls[frameNr] == 10;
	}

	private int spareScore(int frameNr) {
		return 10 + rolls[frameNr + 2];
	}

	private int strikeScore(int frameNr) {
		return 10 + rolls[frameNr + 1] + rolls[frameNr + 2];
	}

	private int sumOfFrameScore(int frameNr) {
		return rolls[frameNr] + rolls[frameNr + 1];
	}
}
