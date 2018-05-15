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
    
    @Test
        public void testGetGameScore() {
        game.roll(0);
        assertEquals(0, game.score());
        }
}
    