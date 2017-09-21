package fr.softteam.kata.tennis;

public class Player {

	private int score;
	private boolean isWinner;
	private String name;
	private Boolean advantage;
	// Sprint 2
	private int setScore = 0;
	private boolean isSetWinner;

	public Player(String name) {
		super();
		score = 0;
		isWinner = false;
		advantage = false;
		this.name = name;
		// Sprint 2
		setScore = 0;
		isSetWinner = false;
	}

	public void markPoint(Player other, TennisGame tg, TennisSet ts) {
		// 0 -> 15 -> 30 -> 40 -> Win game
		if (score == 0) {
			score = 15;
		} else if (score == 15) {
			score = 30;
		} else if (score == 30) {
			score = 40;
		} else if (score == 40 && other.score < 40) {
			isWinner = true;
			if (ts != null) {
				ts.getGames().add(tg);
				setScore++;
				isWinner = false;
				other.isWinner = false;
				advantage = false;
				other.advantage = false;
				score = 0;
				other.score = 0;
				tg = new TennisGame(this, other);

			}
		}

		if (!tg.getDeuce() && score == 40 && other.score == 40) {
			tg.setDeuce(true);
		} else if (tg.getDeuce() && !advantage && score == 40
				&& other.score == 40) {
			advantage = Boolean.TRUE;
		}
		if (tg.getDeuce() && advantage && score == 40 && other.score == 40) {
			isWinner = true;
			if (ts != null) {
				ts.getGames().add(tg);
				setScore++;
				isWinner = false;
				other.isWinner = false;
				advantage = false;
				other.advantage = false;
				score = 0;
				other.score = 0;
				tg = new TennisGame(this, other);

			}
		}

		if ((setScore == 6 && other.getSetScore() <= 4)
				|| (ts != null && ts.isTieBreak() && setScore >= other
						.getSetScore() + 2)) {
			isSetWinner = true;
		}
		//SPRINT2 : User Story 1 (to activate for this user story)
		/* else if (setScore == 6 && other.getSetScore() == 5) {
			setScore = 0;
			other.setScore = 0;
		}*/
		// Sprint 2 : User Story 2
		else if (ts != null && setScore == 6 && other.getSetScore() == 6) {
			ts.setTieBreak(true);
		}

	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isWinner() {
		return isWinner;
	}

	public void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getAdvantage() {
		return advantage;
	}

	public int getSetScore() {
		return setScore;
	}

	public boolean isSetWinner() {
		return isSetWinner;
	}

	@Override
	public String toString() {
		return name;
	}

}
