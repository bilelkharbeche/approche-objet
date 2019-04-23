package fr.diginamic.entites;

public class Client {

	public int numeroCompte;
	public String nom;
	public String prenom;
	public AdressePostale adresse;

	public Client(int numeroCompte, String nom, String prenom) {

		this.numeroCompte = numeroCompte;
		this.nom = nom;
		this.prenom = prenom;

		System.out.println("Nom " + nom + " Prénom " + prenom + " Numéro de compte " + numeroCompte);
	}

	public Client(int numeroCompte, String nom, String prenom, AdressePostale adresse) {

		this(numeroCompte, nom, prenom);
		this.adresse = adresse;

		System.out.println(
				"Nom " + nom + " Prénom " + prenom + " Numéro de compte " + numeroCompte + " Adresse " + adresse);

	}

	public void AfficheNom() {

		System.out.println(nom.toUpperCase() + " " + prenom);
	}

	public void ModifNom(String nom) {

		this.nom = nom;
	}

	public void ModifPrenom(String prenom) {

		this.prenom = prenom;
	}

	public void ModifCompte(int numeroCompte) {

		this.numeroCompte = numeroCompte;
	}

	public String RetourneNom() {

		return nom;
	}

	public String RetournePrenom() {

		return prenom;
	}

	public int RetourneCompte() {

		return numeroCompte;
	}

}
