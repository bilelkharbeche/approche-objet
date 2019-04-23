package fr.diginamic.essais;

import fr.diginamic.entites.AdressePostale;
import fr.diginamic.entites.Client;

public class TestClient {

	public static void main(String[] args) {

		AdressePostale adresseClient = new AdressePostale(13, "rue des goulottes", 71210, "Montchanin");
		Client cli1 = new Client(15, "Kharbeche", "Bilel", adresseClient);
		Client cli2 = new Client(55, "B", "Aurélie");

		System.out.println("\n" + cli1.nom + adresseClient);
		System.out.println(cli2.numeroCompte);

	}

}
