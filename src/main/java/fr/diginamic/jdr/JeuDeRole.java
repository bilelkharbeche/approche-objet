package fr.diginamic.jdr;

import java.util.Scanner;

public class JeuDeRole {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Hero h1 = null;
		Jeu jeu = new Jeu();

		int choix = 0;
		do {
			System.out.println(
					"Menu \n 1 : Créer le personnage\n 2 : Combattre une créature\n 3 : Afficher le score\n 4 : Sortir");

			choix = sc.nextInt();

			if (choix == 1) {
				h1 = new Hero();
				System.out.println("Vous possédez " + h1.getForce() + " points de force et " + h1.getPointDeVie()
						+ " points de vie.");

			} else if (choix == 2) {

				jeu.combattre(h1);

			} else if (choix == 3) {

				h1.getScore();

			} else if (choix == 4) {

				System.out.println("Test4");

			}
		} while (choix != 4);

	}

}
