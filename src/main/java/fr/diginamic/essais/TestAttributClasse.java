package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;

public class TestAttributClasse {

	public static void main(String[] args) {

		AdressePostale a = new AdressePostale(13, "rue des goulottes", 71210, "Montchanin");
		AdressePostale b = new AdressePostale(13, "impasse des fauvettes", 71200, "Le Creusot");

		System.out.println(a.nbDepartement);
		System.out.println(b.nbDepartement);
		System.out.println(AdressePostale.nbDepartement);

		// Etape 2, la valeur de nbDepartement passe à 102 lorsqu'on la passe à
		// 102
		a.nbDepartement = 103;
		System.out.println(a.nbDepartement);
		System.out.println(b.nbDepartement);
		System.out.println(AdressePostale.nbDepartement);

		// Etape 3, la valeur de nbDepartement passe à 103 pour tous

	}

}
