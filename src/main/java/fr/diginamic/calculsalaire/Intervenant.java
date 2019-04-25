package fr.diginamic.calculsalaire;

public abstract class Intervenant {

	String nom;
	String prenom;

	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();

	public void afficherDonnees() {

		System.out.println("nom : " + nom + "\nprénom : " + prenom + "\nsalaire : " + getSalaire());

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
