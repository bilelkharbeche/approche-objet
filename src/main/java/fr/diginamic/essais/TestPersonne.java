package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne personne = new Personne();
		
		personne.nom = "KHARBECHE";
		personne.prenom = "Bilel";
		
		personne.adressePostale =  new AdressePostale();
		personne.adressePostale.numeroRue = 13;
		personne.adressePostale.nomRue = "rue des goulottes";
		personne.adressePostale.codePostal = 71210;
		personne.adressePostale.ville = "Montchanin";
		
		
		
		
		AdressePostale adresse = new AdressePostale();
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
