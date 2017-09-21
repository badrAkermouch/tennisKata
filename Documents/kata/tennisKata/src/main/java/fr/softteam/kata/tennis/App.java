package fr.softteam.kata.tennis;

public class App {
	public static void main(String[] args) {
		// SPRINT1 : User Story 1
		 sprint1UserStory1();

		// SPRINT1 : User Story 2
		 spring1UserStory2();

		// SPRINT2 : User Story 1
		 sprint2UserStory1();

		// SPRINT2 : User Story 2
		sprint2UserStory2();
	}

	private static void sprint1UserStory1() {
		Player p1 = new Player("Léo");
		Player p2 = new Player("gabriel");

		TennisGame tg = new TennisGame(p1, p2);

		p1.markPoint(p2, tg, null);

		p2.markPoint(p2, tg, null);

		p1.markPoint(p2, tg, null);

		p1.markPoint(p2, tg, null);

		p1.markPoint(p2, tg, null);

		System.out.println("Player 1 score is " + p1.getScore());
		System.out.println("Player 2 score is " + p2.getScore());

		try {
			System.out.println("The winner is " + tg.getWinner());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// User Story 1
	private static void spring1UserStory2() {
		Player p3 = new Player("Maël");
		Player p4 = new Player("Raphaël");

		TennisGame tg2 = new TennisGame(p3, p4);

		p3.markPoint(p4, tg2, null);
		p4.markPoint(p3, tg2, null);

		p3.markPoint(p4, tg2, null);
		p4.markPoint(p3, tg2, null);

		p3.markPoint(p4, tg2, null);
		p4.markPoint(p3, tg2, null); // 40 40 deuce

		// System.out.println(tg2.getDeuce());

		p3.markPoint(p4, tg2, null); // advantage
		p3.markPoint(p4, tg2, null); // winner p3

		System.out.println("Player 1 score is " + p3.getScore());
		System.out.println("Player 2 score is " + p4.getScore());

		try {
			System.out.println("The winner is " + tg2.getWinner());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// User Story 1
	private static void sprint2UserStory1() {
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

		System.out.println("Player 1 set score is " + p5.getSetScore());
		System.out.println("Player 2 set score is " + p6.getSetScore());

		try {
			System.out.println("The winner is " + ts.getWinner());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// User Story 2
	private static void sprint2UserStory2() {
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
		
		for (int i = 1; i <= 8; i++) {
			p6.markPoint(p5, tg3, ts);
		}

		System.out.println("Player 1 set score is " + p5.getSetScore());
		System.out.println("Player 2 set score is " + p6.getSetScore());

		try {
			System.out.println("The winner is " + ts.getWinner());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
