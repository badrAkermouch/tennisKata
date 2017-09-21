package fr.softteam.kata.tennis;

import java.util.ArrayList;
import java.util.List;

public class TennisSet {

	private boolean tieBreak = false;

	private List<TennisGame> games = new ArrayList<TennisGame>();

	public List<TennisGame> getGames() {
		return games;
	}

	public Player getWinner() throws Exception {
		for (TennisGame tg : games) {
			if (tg.getP1().isSetWinner() && !tg.getP2().isSetWinner()) {
				return tg.getP1();
			} else if (!tg.getP1().isSetWinner() && tg.getP2().isSetWinner()) {
				return tg.getP2();
			} else if (tg.getP1().isSetWinner() && tg.getP2().isSetWinner()) {
				throw new Exception("Une erreur est survenue");
			} else if (!tg.getP1().isSetWinner() && !tg.getP2().isSetWinner()) {
				return null;
			}
		}
		return null;
	}

	public boolean isTieBreak() {
		return tieBreak;
	}

	public void setTieBreak(boolean tieBreak) {
		this.tieBreak = tieBreak;
	}

}
