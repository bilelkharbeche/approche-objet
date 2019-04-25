package fr.diginamic.jdr;

import java.util.Random;

public class Gobelin extends Creature {

	public Gobelin() {
		Random rnd = new Random();

		this.force = rnd.nextInt(6) + 12;
		this.pointDeVie = rnd.nextInt(6) + 15;
	}

}
