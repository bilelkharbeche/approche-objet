package fr.diginamic.essais;

import fr.diginamic.entites.Client;

public class TestClient {

	public static void main(String[] args) {

		Client cli1 = new Client(15, "Kharbeche", "Bilel");
		Client cli2 = new Client(55, "Beninca", "Aurélie");
		
		System.out.println("\n" + cli1.nom);
		System.out.println(cli2.numeroCompte);

	}

}
