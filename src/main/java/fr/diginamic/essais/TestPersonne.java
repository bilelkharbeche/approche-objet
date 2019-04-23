package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		Personne personne = new Personne();

		personne.nom = "KHARBECHE";
		personne.prenom = "Bilel";

		personne.adressePostale = new AdressePostale(13, "rue des goulottes", 71210, "Montchanin");

		AdressePostale adresse = new AdressePostale(13, "impasse des fauvettes", 71200, "Le Creusot");
		Personne personne2 = new Personne();

		adresse.numeroRue = 13;
		adresse.nomRue = "impasse des fauvettes";
		adresse.codePostal = 71200;
		adresse.ville = "Le Creusot";

		personne2.nom = "Kharbeche";
		personne2.prenom = "Bilel";
		personne2.adressePostale = adresse;

	}

}
