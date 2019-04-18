package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale adressePostale1 = new AdressePostale();
		AdressePostale adressePostale2 = new AdressePostale();
		
		adressePostale1.numeroRue = 13;
		adressePostale1.nomRue = "impasse des fauvettes";
		adressePostale1.codePostal = 71200;
		adressePostale1.ville = "Le Creusot";
		
		adressePostale2.numeroRue = 13;
		adressePostale2.nomRue = "rue des goulottes";
		adressePostale2.codePostal = 71210;
		adressePostale2.ville = "Montchanin";
		
		System.out.println(adressePostale1);
		System.out.println(adressePostale2);

	}

}
