package fr.diginamic.jdr;

import java.util.Random;

public class Jeu {

	public Jeu() {

	}

	public void combattre(Hero hero) {
		Random rnd = new Random();

		if (hero.getPointDeVie() > 0) {

			int numMonstre = rnd.nextInt(3) + 1;
			Creature creature = null;

			if (numMonstre == 1) {
				creature = new Loup();
				System.out.println("Préparez vous à combattre un loup possédant " + creature.getForce()
						+ " points de force et " + creature.getPointDeVie() + " points de vie.\n");
			} else if (numMonstre == 2) {
				creature = new Gobelin();
				System.out.println("Préparez vous à combattre un gobelin possédant " + creature.getForce()
						+ " points de force et " + creature.getPointDeVie() + " points de vie.\n");
			} else {
				creature = new Troll();
				System.out.println("Préparez vous à combattre un puissant troll possédant " + creature.getForce()
						+ " points de force et " + creature.getPointDeVie() + " points de vie.\n");
			}

			while (hero.getPointDeVie() > 0 && creature.getPointDeVie() > 0) {

				int forceH = hero.getForce() + rnd.nextInt(10) + 1;
				int forceC = creature.getForce() + rnd.nextInt(10) + 1;

				if (forceH > forceC) {
					creature.setPointDeVie(creature.getPointDeVie() - (forceH - forceC));
					System.out.println("Il vous reste " + hero.getPointDeVie()
							+ " points de vie et votre adversaire en possède " + creature.getPointDeVie() + "\n");
				} else {
					hero.setPointDeVie(hero.getPointDeVie() - (forceC - forceH));
					System.out.println("Il vous reste " + hero.getPointDeVie()
							+ " points de vie et votre adversaire en possède " + creature.getPointDeVie() + "\n");
				}
			}

			if (hero.getPointDeVie() > 0) {
				if (numMonstre == 1) {
					hero.setScore(+1);
				} else if (numMonstre == 2) {
					hero.setScore(+2);
				} else {
					hero.setScore(+5);
				}
				System.out.println("Vous avez gagné votre combat, votre score est de : " + hero.getScore());
			} else {
				System.out.println("Votre personnage est décédé. Il a obtenu le score de " + hero.getScore()
						+ " points. Veuillez créer un nouveau personnage");
			}

		} else {
			System.out.println("Votre personnage est décédé. Il a obtenu le score de " + hero.getScore()
					+ " points. Veuillez créer un nouveau personnage\n");
		}
	}
}
