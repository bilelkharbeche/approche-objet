package fr.diginamic.heritage;

public class Rectangle extends Forme {

	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {

		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {

		return longueur * largeur;
	}

	@Override
	public double calculerPerimetre() {

		return 2 * (longueur + largeur);
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
}
