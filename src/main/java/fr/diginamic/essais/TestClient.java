package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Client;

public class TestClient {

	public static void main(String[] args) {

		AdressePostale adresseClient = new AdressePostale(13, "rue des goulottes", 71210, "Montchanin");
		Client cli1 = new Client(15, "Kharbeche", "Bilel", adresseClient);

		// System.out.println("\n" + cli1.nom + adresseClient);
		// System.out.println(cli2.numeroCompte);

		cli1.setNom("Beninca");
		cli1.setPrenom("Aurélie");
		cli1.setNumeroCompte(15);
		cli1.getNom();

		System.out.println(cli1.getNumeroCompte());

	}

}
