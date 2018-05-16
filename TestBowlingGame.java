import static org.junit.Assert.*;

import org.junit.Before;
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
	BowlingGame game;

	@Before
	public void setUp() {
		game = new BowlingGame();
	}

	private void doRolls(int nrOfRolls, int nrOfPins) {
		for (int i = 0; i < nrOfRolls; i++) {
			game.roll(nrOfPins);
		}
	}

	@Test
	public void testGetGameScore() {
		doRolls(20, 1);
		assertEquals(20, game.score());
	}

	@Test
	public void testDoASpare() {
		game.roll(1);
		game.roll(9);
		game.roll(3);
		doRolls(17, 0);
		assertEquals(16, game.score());
	}


	private void rollAStrike() {
		game.roll(10);
	}

	@Test
	public void StrikeAndSpare() {
		game.roll(10);
		game.roll(0);
		
		System.out.println(game.score());


		game.roll(4);
		game.roll(6);

		System.out.println(game.score());

		game.roll(7);
		game.roll(2);

		System.out.println(game.score());

		game.roll(3);
		game.roll(6);

		System.out.println(game.score());

		game.roll(4);
		game.roll(4);

		System.out.println(game.score());

		game.roll(5);
		game.roll(3);

		System.out.println(game.score());

		game.roll(3);
		game.roll(3);

		System.out.println(game.score());

		game.roll(4);
		game.roll(5);

		System.out.println(game.score());

		game.roll(8);
		game.roll(1);

		System.out.println(game.score());

		game.roll(2);
		game.roll(6);
		
		System.out.println(game.score());

		assertEquals(103, game.score());
		
	}

}
