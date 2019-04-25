package fr.diginamic.jdr;

import java.util.Random;

public class Loup extends Creature {

	public Loup() {
		Random rnd = new Random();

		this.force = rnd.nextInt(6) + 10;
		this.pointDeVie = (6) + 10;
	}

}
