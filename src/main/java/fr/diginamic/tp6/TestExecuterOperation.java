/**
 * 
 */
package fr.diginamic.tp6;

/**
 * @author KHARBECHE Bilel
 *
 */
public class TestExecuterOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		IOperation addition = new Addition();
		IOperation multiplication = new Multiplication();

		System.out.println(ExecuterOperation.execute(addition, 5, 10));
		System.out.println(ExecuterOperation.execute(multiplication, 10, 8));

	}

}
