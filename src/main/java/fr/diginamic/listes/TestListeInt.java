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
public class TestListeInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Integer> liste = new ArrayList();

		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);

		Integer min = liste.get(0);
		Integer max = liste.get(0);

		System.out.println(liste + "\n"); // Affiche la liste

		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i) > max) {
				max = liste.get(i);
			}
		}
		// System.out.println(max); // Affiche l'élément le plus grand de la

		Iterator<Integer> iter = liste.iterator();

		while (iter.hasNext()) {
			Integer tmp = iter.next();
			if (tmp < min) {
				min = tmp;
			}
		}
		liste.remove(min); // Supprime l'élément le plus petit
		// System.out.println(liste);

		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i) < 0) {
				liste.set(i, liste.get(i) * -1); // Remplace tous les éléments
													// négatif en positif
			}
		}
		System.out.println(liste);
	}
}
