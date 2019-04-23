package fr.diginamic.operations;

public class CalculMoyenne {

	double[] array;
	int indice = 0;

	public CalculMoyenne(int longueur) {

		if (longueur > 0) {

			array = new double[longueur];
		} else {
			System.out.println("Impossible d'avoir un tableau de longueur négative");
			array = new double[1];
		}

	}

	public void ajout(double add) {

		if (indice < array.length) {

			array[indice] = add;
			indice++;
		} else {

			System.out.println("Nombres de valeurs supérieur à la taille du tableau");
		}

	}

	public double calcul() {

		double moyenne;
		double somme = 0;

		for (int i = 0; i < array.length; i++) {

			somme = somme + array[i];
		}

		moyenne = somme / array.length;
		return moyenne;
	}

}
