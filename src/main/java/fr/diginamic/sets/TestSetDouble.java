/**
 * 
 */
package fr.diginamic.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * @author KHARBECHE Bilel
 *
 */
public class TestSetDouble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<Double> sets = new HashSet();

		sets.add(1.5);
		sets.add(8.25);
		sets.add(-7.32);
		sets.add(13.3);
		sets.add(-12.45);
		sets.add(48.5);
		sets.add(0.01);
		sets.add(13.3);

		System.out.println(sets); // Pas dans l'ordre rentré car le HashSet les
									// rangent dans un ordre précis

		double nbMax = sets.iterator().next();

		for (Double set : sets) {
			if (nbMax < set) {
				nbMax = set;
			}
		}
		System.out.println(nbMax); // Affiche le plus grand nombre
	}

}
