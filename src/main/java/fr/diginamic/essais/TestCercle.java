package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {

		Cercle c1 = new Cercle(3);
		Cercle c2 = new Cercle(8);

		System.out.println(c1.getPerim());
		System.out.println(c1.getAir());

		System.out.println(c2.getPerim());
		System.out.println(c2.getAir());

		Cercle cercle = CercleFactory.creer(5);
		System.out.println(cercle.getPerim() + cercle.getAir());

	}

}
