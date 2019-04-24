package fr.diginamic.entites;

public class Cercle {

	public double rayon;

	public Cercle(double rayon) {

		this.rayon = rayon;
	}

	public double getPerim() {

		return 2 * Math.PI * rayon;
	}

	public double getAir() {

		return Math.PI * rayon * rayon;
	}

}
