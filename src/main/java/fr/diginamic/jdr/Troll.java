package fr.diginamic.jdr;

import java.util.Random;

public class Troll extends Creature {

	public Troll() {
		Random rnd = new Random();

		this.force = rnd.nextInt(9) + 20;
		this.pointDeVie = rnd.nextInt(11) + 30;
	}

}
