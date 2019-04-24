package fr.diginamic.heritage;

public class TestForme {

	public static void main(String[] args) {

		Cercle c1 = new Cercle(10);
		Rectangle r1 = new Rectangle(25, 12);
		Carre ca1 = new Carre(2);

		AffichageForme.afficher(c1);
		AffichageForme.afficher(r1);
		AffichageForme.afficher(ca1);

	}

}
