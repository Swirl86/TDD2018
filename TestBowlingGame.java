import org.junit.Test;

/*
 * Main file for testing Laboration 5
*/

/* 
 *  Test case for user story createNewBowlingGame
 *  TDD JUnit Bowling game 2018 PA1417
 *  In this assignment your group should develop software for calculating score of a single bowling game. 
 *  You must use Test Driven Development approach and use of JUnit framework for automating testing scripts.
*/

public class TestBowlingGame {

    @Test
    public void createNewBowlingGame() {
        BowlingGame game = new BowlingGame();
    }

    @Test
	 public void rollABowlingBall() {
	 BowlingGame game = new BowlingGame();
		game.roll(0);
	 }
}