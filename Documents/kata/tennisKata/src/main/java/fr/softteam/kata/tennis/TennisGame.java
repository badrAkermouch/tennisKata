package fr.softteam.kata.tennis;

public class TennisGame {
	private boolean deuce;

	private Player p1;
	private Player p2;

	public TennisGame(Player p1, Player p2) {
		super();
		deuce = false;
		this.p1 = p1;
		this.p2 = p2;
	}

	public Player getWinner() throws Exception {
		if (p1.isWinner() && !p2.isWinner()) {
			return p1;
		} else if (!p1.isWinner() && p2.isWinner()) {
			return p2;
		} else if (p1.isWinner() && p2.isWinner()) {
			throw new Exception("Une reeur est survenue");
		} else if (!p1.isWinner() && !p2.isWinner()) {
			return null;
		}
		return null;
	}

	public Player getP1() {
		return p1;
	}

	public void setP1(Player p1) {
		this.p1 = p1;
	}

	public Player getP2() {
		return p2;
	}

	public void setP2(Player p2) {
		this.p2 = p2;
	}

	public boolean getDeuce() {
		return deuce;
	}

	public void setDeuce(boolean deuce) {
		this.deuce = deuce;
	}

}
