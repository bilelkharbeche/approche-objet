package fr.diginamic.immobilier;

public abstract class Piece extends Maison {

	private double superficie;
	private double etage;
	private String type;

	public Piece(double superficie, double etage, String type) {
		this.superficie = superficie;
		this.etage = etage;
		this.type = type;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public double getEtage() {
		return etage;
	}

	public void setEtage(double etage) {
		this.etage = etage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
