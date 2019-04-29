/**
 * 
 */
package fr.diginamic.listes;

import java.util.ArrayList;

/**
 * @author KHARBECHE Bilel
 *
 */
public class CalculMoyenneListe {

	ArrayList<Double> liste = new ArrayList();
	int indice = 0;

	public CalculMoyenneListe() {

	}

	public void Ajout(double add) {
		liste.add(add);
	}

	public double calcul() {

		double moyenne;
		double somme = 0;

		for (int i = 0; i < liste.size(); i++) {

			somme = somme + liste.get(i);
		}

		moyenne = somme / liste.size();
		return moyenne;
	}

}
