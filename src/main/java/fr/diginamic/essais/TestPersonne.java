package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		Personne personne = new Personne();

		personne.setNom("KHARBECHE");
		personne.setPrenom("Bilel");

		personne.adressePostale = new AdressePostale(13, "rue des goulottes", 71210, "Montchanin");

		AdressePostale adresse = new AdressePostale(13, "impasse des fauvettes", 71200, "Le Creusot");
		Personne personne2 = new Personne();

		adresse.setNumeroRue(13);
		adresse.setNomRue("impasse des fauvettes");
		adresse.setCodePostal(71200);
		adresse.setVille("Le Creusot");

		personne2.setNom("Kharbeche");
		personne2.setPrenom("Bilel");
		personne2.adressePostale = adresse;

	}

}
