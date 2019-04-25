package fr.diginamic.jdr;

import java.util.Random;

public class Hero extends Personnage {

	private int score;

	public Hero() {
		Random rnd = new Random();

		this.force = rnd.nextInt(7) + 12;
		this.pointDeVie = rnd.nextInt(31) + 20;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
