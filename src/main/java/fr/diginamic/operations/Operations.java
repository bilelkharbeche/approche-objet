package fr.diginamic.operations;

public class Operations {

	public static double calcul(double a, double b, char op) {
		if (op == '+') {

			return a + b;
		} else if (op == '-') {

			return a - b;
		} else if (op == '*') {

			return a * b;
		} else if (op == '/') {

			return a / b;
		} else {

			return 0.0;
		}
	}
}
