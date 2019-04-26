package fr.diginamic.immobilier;

public class TestMaison {

	public static void main(String[] args) {

		Maison m1 = new Maison();
		Chambre ch1 = new Chambre(50, 1, "Chambre");
		Chambre ch2 = new Chambre(120, 3, "Chambre");
		Salon s1 = new Salon(30, 5, "Salon");
		SalleDeBain sdb1 = new SalleDeBain(10, 2, "Salle de bain");
		WC wc1 = new WC(8, 2, "WC");

		m1.ajouterPiece(ch1);
		m1.ajouterPiece(ch2);
		m1.ajouterPiece(s1);
		m1.ajouterPiece(sdb1);
		m1.ajouterPiece(wc1);

		System.out.println(m1.superficieEtage(2));
		System.out.println(m1.calculerSurface());
		System.out.println(m1.superficieType("Chambre"));
		System.out.println(m1.nbPiece("Salon"));

	}

}
