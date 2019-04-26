package fr.diginamic.immobilier;

import fr.diginamic.tp6.ISurface;

public class Maison implements ISurface {

	private Piece[] array;
	// private int indice = 0;

	public Maison() {

		this.array = new Piece[0];
	}

	public void ajouterPiece(Piece piece) {

		Piece[] arrayTemp = new Piece[this.array.length + 1];

		for (int i = 0; i < array.length; i++) {

			arrayTemp[i] = this.array[i];
		}

		arrayTemp[arrayTemp.length - 1] = piece;
		this.array = arrayTemp;

	}

	public double calculerSurface() {

		double superficieTotale = 0;

		for (int i = 0; i < array.length; i++) {

			superficieTotale += array[i].getSuperficie();
		}

		return superficieTotale;
	}

	public double superficieEtage(int etage) {

		double superficieEtage = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i].getEtage() == etage) {

				superficieEtage += array[i].getSuperficie();
			}
		}

		return superficieEtage;
	}

	public double superficieType(String type) {

		double superficieType = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i].getType().equals(type)) {

				superficieType += array[i].getSuperficie();
			}
		}

		return superficieType;
	}

	public double nbPiece(String type) {

		double nbPiece = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i].getType() == type) {

				nbPiece++;
			}
		}

		return nbPiece;
	}

	public Piece[] getArray() {
		return array;
	}

	public void setArray(Piece[] array) {
		this.array = array;
	}

}
