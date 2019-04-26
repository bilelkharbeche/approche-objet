/**
 * 
 */
package fr.diginamic.tp6;

import fr.diginamic.heritage.Carre;
import fr.diginamic.heritage.Forme;
import fr.diginamic.immobilier.Chambre;
import fr.diginamic.immobilier.Cuisine;
import fr.diginamic.immobilier.Maison;

/**
 * @author KHARBECHE Bilel
 *
 */
public class TestAffichageSurface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Maison maison = new Maison();
		Chambre chambre = new Chambre(20, 2, "Chambre");
		Cuisine cuisine = new Cuisine(10, 1, "Cuisine");
		Forme carre = new Carre(10);

		maison.ajouterPiece(chambre);
		maison.ajouterPiece(cuisine);

		System.out.println(AffichageSurface.afficher(maison));
		System.out.println(AffichageSurface.afficher(carre));

	}

}
