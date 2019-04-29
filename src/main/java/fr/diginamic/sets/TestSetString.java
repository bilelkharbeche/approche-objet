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
public class TestSetString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<String> set = new HashSet();

		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");

		int nbCharMax = set.iterator().next().length();
		String nomP = "";

		for (String setP : set) {
			if (setP.length() > nbCharMax) {
				nbCharMax = setP.length();
				nomP = setP;
			}
		}
		System.out.println(nomP);
	}

}
