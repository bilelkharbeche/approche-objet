/**
 * 
 */
package fr.diginamic.tri;

import java.util.Comparator;

import fr.diginamic.sets.Pays;

/**
 * @author KHARBECHE Bilel
 *
 */
public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays pays1, Pays pays2) {
		int result = pays1.getPays().compareTo(pays2.getPays());
		return result;
	}

}
