package fr.diginamic.heritage;

public class AffichageForme {

	public static void afficher(Forme forme) {

		System.out.println("Le périmètre est : " + forme.calculerPerimetre());
		System.out.println("La surface  est : " + forme.calculerSurface() + "\n");
	}

}
