package fr.diginamic.heritage;

import fr.diginamic.calculsalaire.Intervenant;

public class Salarie extends Intervenant {

	private double salaire;

	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	@Override
	public double getSalaire() {

		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}
