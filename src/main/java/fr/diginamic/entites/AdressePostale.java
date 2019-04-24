package fr.diginamic.entites;

public class AdressePostale {

	// public static void main(String[] args) {

	private int numeroRue;
	private String nomRue;
	private int codePostal;
	private String ville;

	public static int nbDepartement = 102;

	public AdressePostale(int numeroRue, String nomRue, int codePostal, String ville) {

		this.numeroRue = numeroRue;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public static int getNbDepartement() {
		return nbDepartement;
	}

	public static void setNbDepartement(int nbDepartement) {
		AdressePostale.nbDepartement = nbDepartement;
	}

}

// }
