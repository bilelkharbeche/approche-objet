package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class testMoyenne {

	public static void main(String[] args) {

		CalculMoyenne tab = new CalculMoyenne(10);
		tab.ajout(3);
		tab.ajout(10);

		System.out.println(tab.calcul());

		// Si on entre une longueur négative, le code ne compile pas car le
		// tableau aurait une longueur inférieur à 0

		// Si on a ajoute trop d'élément à la classe, le code ne compile par car
		// le tableau ne possède pas assez de cellules

	}

}
