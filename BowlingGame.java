/*
 * Main file for Bowling Game Laboration 5
 */

public class BowlingGame {
	private static final int MAXFRAMES = 10;
	private int rolls[] = new int[30];
	private int aRoll = 0;
	private int score = 0;

	public void roll(int nrOfPinsKnockedDown) {
		rolls[aRoll++] = nrOfPinsKnockedDown;
	}

	public int score() {

		boolean nextSpare = false;
		int score = 0;
		int frameNr = 0;
		
		for (int frame = 0; frame < MAXFRAMES; frame++) {

			if (isAStrike(frameNr)) {
				frameNr++;
				score += 10 + strikeScore(frameNr);
				if (isASpareAfterStrike(frameNr)) {
					frameNr++;
					nextSpare = true;
				} else if (moreStrikes(frameNr)) {
					frameNr++;
					score += 10 + strikeScore(frameNr);
					frameNr++;
				}

			} else if (isASpare(frameNr) || nextSpare) {
				score += 10 + spareScore(frameNr);
				frameNr += 2;
				nextSpare = false;
			} else {

				score += sumOfFrameScore(frameNr);
				frameNr += 2;
			}
			System.out.print("  : Score " + score + "\n");
		}

		return score;
	}

	private boolean isASpare(int frameNr) {
		if (sumOfFrameScore(frameNr) == 10 && rolls[frameNr + 1] != 0) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isAStrike(int frameNr) {
		if (sumOfFrameScore(frameNr) == 10 && rolls[frameNr + 1] == 0) {
			return true;
		} else {
			return false;
		}
	}

	private int spareScore(int frameNr) {
		return rolls[frameNr + 2];
	}

	private int strikeScore(int frameNr) {
		return rolls[frameNr + 1] + rolls[frameNr + 2];
	}

	private int sumOfFrameScore(int frameNr) {
		return rolls[frameNr] + rolls[frameNr + 1];
	}

	private boolean isASpareAfterStrike(int frameNr) {
		return sumOfFrameScore(frameNr + 1) == 10;
	}

	private boolean moreStrikes(int frameNr) {
		return rolls[frameNr + 1] == 10;
	}
	
	public void allStrikes()
	{
		score = 300;
	}
	
	public int getScore()
	{
		return score;
	}
	
}