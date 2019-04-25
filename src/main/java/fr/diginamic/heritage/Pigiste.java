package fr.diginamic.heritage;

import fr.diginamic.calculsalaire.Intervenant;

public class Pigiste extends Intervenant {

	private double jTravailleMois;
	private double montantJournalier;

	public Pigiste(String nom, String prenom, double jTravailleMois, double montantJournalier) {
		super(nom, prenom);
		this.jTravailleMois = jTravailleMois;
		this.montantJournalier = montantJournalier;
	}

	public void afficherDonnees() {

		super.afficherDonnees();
		System.out.println("Statut : Pigiste");

	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return jTravailleMois * montantJournalier;
	}

	public double getjTravailleMois() {
		return jTravailleMois;
	}

	public void setjTravailleMois(double jTravailleMois) {
		this.jTravailleMois = jTravailleMois;
	}

	public double getMontantJournalier() {
		return montantJournalier;
	}

	public void setMontantJournalier(double montantJournalier) {
		this.montantJournalier = montantJournalier;
	}

}
