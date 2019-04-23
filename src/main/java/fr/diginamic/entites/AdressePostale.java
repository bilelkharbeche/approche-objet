package fr.diginamic.entites;

public class AdressePostale {

	// public static void main(String[] args) {

	public int numeroRue;
	public String nomRue;
	public int codePostal;
	public String ville;

	public static int nbDepartement = 102;

	public AdressePostale(int numeroRue, String nomRue, int codePostal, String ville) {

		this.numeroRue = numeroRue;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

}

// }
