package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {

		double add = Operations.calcul(5, 3, '+');
		double sous = Operations.calcul(10, 5, '-');
		double mult = Operations.calcul(2, 8, '*');
		double div = Operations.calcul(4, 3, '/');

		System.out.println(add);
		System.out.println(sous);
		System.out.println(mult);
		System.out.println(div);

	}

}
