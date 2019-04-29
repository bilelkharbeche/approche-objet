/**
 * 
 */
package fr.diginamic.listes;

/**
 * @author KHARBECHE Bilel
 *
 */
public class TestMoyenneListe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CalculMoyenneListe liste = new CalculMoyenneListe();

		liste.Ajout(10);
		liste.Ajout(28);

		System.out.println(liste.calcul());
	}

}
