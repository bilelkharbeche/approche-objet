package fr.diginamic.essais;

import fr.diginamic.entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne personne = new Personne();
		
		personne.nom = "KHARBECHE";
		personne.prenom = "Bilel";
		personne.adressePostale = "13 rue des goulottes 71210 Montchanin";
		
		personne.nom = "KHARBECHE";
		personne.prenom = "Bibi";
		personne.adressePostale = "13 impasse des fauvettes 71200 montchanin";

	}

}
