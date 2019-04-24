package fr.diginamic.entites;

public class Client {

	private int numeroCompte;
	private String nom;
	private String prenom;
	private AdressePostale adresse;

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

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
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

	public AdressePostale getAdresse() {
		return adresse;
	}

	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
}
