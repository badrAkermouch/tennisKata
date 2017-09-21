package fr.softteam.kata.tennis;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		// SPRINT1 : User Story 1
		sprint1UserStory1();

		// SPRINT1 : User Story 2
		sprint1UserStory2();

		// SPRINT2 : User Story 1
		sprint2UserStory1();
		
		// SPRINT2 : User Story 2
		sprint2UserStory2();

	}

	private void sprint1UserStory2() {
		Player p3 = new Player("Maël");
		Player p4 = new Player("Raphaël");

		TennisGame tg2 = new TennisGame(p3, p4);

		p3.markPoint(p4, tg2, null);
		p4.markPoint(p3, tg2, null);

		p3.markPoint(p4, tg2, null);
		p4.markPoint(p3, tg2, null);

		p3.markPoint(p4, tg2, null);
		p4.markPoint(p3, tg2, null);

		assertEquals(p3.getScore(), 40);
		assertEquals(p4.getScore(), 40);
		assertEquals(tg2.getDeuce(), true);

		p3.markPoint(p4, tg2, null);

		assertEquals(p3.getAdvantage(), Boolean.TRUE);

		p3.markPoint(p4, tg2, null);

		assertEquals(p3.isWinner(), true);
	}

	private void sprint1UserStory1() {
		Player p1 = new Player("Léo");
		Player p2 = new Player("gabriel");

		TennisGame tg = new TennisGame(p1, p2);

		assertEquals(p1.getScore(), 0);
		assertEquals(p1.isWinner(), false);
		assertEquals(p2.getScore(), 0);
		assertEquals(p2.isWinner(), false);

		p1.markPoint(p2, tg, null);
		assertEquals(p1.getScore(), 15);

		p2.markPoint(p2, tg, null);
		assertEquals(p2.getScore(), 15);

		p1.markPoint(p2, tg, null);
		assertEquals(p1.getScore(), 30);

		p1.markPoint(p2, tg, null);
		assertEquals(p1.getScore(), 40);

		p1.markPoint(p2, tg, null);
		assertEquals(p1.isWinner(), true);
		assertEquals(p2.isWinner(), false);

		try {
			assertSame(tg.getWinner().getName(), p1.getName());
		} catch (Exception e) {
			// AssertionError.
			e.printStackTrace();
		}
	}

	private void sprint2UserStory1() {

		Player p5 = new Player("Louis");
		Player p6 = new Player("Ethan");

		TennisGame tg3 = new TennisGame(p5, p6);
		TennisSet ts = new TennisSet();

		for (int i = 1; i <= 6; i++) {
			p5.markPoint(p6, tg3, ts);
			p6.markPoint(p5, tg3, ts);

			p5.markPoint(p6, tg3, ts);
			p6.markPoint(p5, tg3, ts);

			p5.markPoint(p6, tg3, ts);
			p6.markPoint(p5, tg3, ts);

			p5.markPoint(p6, tg3, ts);
			p5.markPoint(p6, tg3, ts);
		}

		assertEquals(p5.getSetScore(), 7);
		assertEquals(p6.getSetScore(), 0);
		
		try {
			assertEquals(ts.getWinner(), p5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void sprint2UserStory2() {
		Player p5 = new Player("Sacha");
		Player p6 = new Player("Lucas");

		TennisGame tg3 = new TennisGame(p5, p6);
		TennisSet ts = new TennisSet();

		for (int i = 1; i <= 6; i++) {
			p5.markPoint(p6, tg3, ts);
			p5.markPoint(p6, tg3, ts);
			p5.markPoint(p6, tg3, ts);
			p5.markPoint(p6, tg3, ts);
			
			p6.markPoint(p5, tg3, ts);
			p6.markPoint(p5, tg3, ts);
			p6.markPoint(p5, tg3, ts);
			p6.markPoint(p5, tg3, ts);
		}
		assertEquals(p5.getSetScore(), 6);
		assertEquals(p6.getSetScore(), 6);
		
		for (int i = 1; i <= 8; i++) {
			p6.markPoint(p5, tg3, ts);
		}
		
		assertEquals(p5.getSetScore(), 6);
		assertEquals(p6.getSetScore(), 8);
		
		try {
			assertSame(ts.getWinner(), p6);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
