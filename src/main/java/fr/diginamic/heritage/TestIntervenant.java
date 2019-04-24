package fr.diginamic.heritage;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie salarie1 = new Salarie("KHARBECHE", "Bilel", 6000);
		Pigiste pigiste1 = new Pigiste("BENINCA", "Aurélie", 22, 72);

		System.out.println(salarie1.getSalaire());

		System.out.println(pigiste1.getSalaire());

	}

}
