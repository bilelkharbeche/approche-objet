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

}
