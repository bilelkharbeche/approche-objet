/**
 * 
 */
package fr.diginamic.tp6;

/**
 * @author KHARBECHE Bilel
 *
 */
public class Multiplication implements IOperation {

	@Override
	public int calcul(int a, int b) { // Réduire la visibilité de la méthode
										// provoque une erreur de compilation
										// car on ne peut réduire la visibilité
										// d'une interface

		return a * b;
	}

}
