/**
 * 
 */
package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author KHARBECHE Bilel
 *
 */
public class TestListeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> liste = new ArrayList();

		liste.add("Nice");
		liste.add("Carcassonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");

		String maxL = liste.get(0);
		Iterator<String> iter = liste.iterator();

		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).length() > maxL.length()) {
				maxL = liste.get(i);
			}
		}
		System.out.println(maxL); // Affiche la liste qui a le plus grand nombre
									// de lettres

		for (int i = 0; i < liste.size(); i++) {
			String Upper = liste.get(i);
			Upper = Upper.toUpperCase();

			System.out.println(Upper); // Affiche la liste avec les noms en
										// majuscule
		}

		while (iter.hasNext()) {
			String tmp = iter.next();
			if (tmp.charAt(0) == 'N') {
				iter.remove();
			}
		}
		System.out.println(liste); // Supprime les noms de villes commençant par
									// "N"
	}
}
