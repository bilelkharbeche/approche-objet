/**
 * 
 */
package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import fr.diginamic.sets.Pays;

/**
 * @author KHARBECHE Bilel
 *
 */
public class TestMapPays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, Pays> pays = new HashMap();

		Pays usa = new Pays("Usa", 325_000_000, 57_638);
		Pays france = new Pays("France", 67_000_000, 43_551);
		Pays allemagne = new Pays("Allemagne", 87_000_000, 50_206);
		Pays uk = new Pays("Uk", 66_000_000, 43_620);
		Pays italie = new Pays("Italie", 60_000_000, 37_970);
		Pays japon = new Pays("Japon", 126_000_000, 42_659);
		Pays chine = new Pays("Chine", 1_300_000_000, 16_624);
		Pays russie = new Pays("Russie", 144_000_000, 27_900);
		Pays inde = new Pays("Inde", 1_349_000_000, 7_174);

		pays.put("Usa", usa);
		pays.put("France", france);
		pays.put("Allemagne", allemagne);
		pays.put("Uk", uk);
		pays.put("Italie", italie);
		pays.put("Japon", japon);
		pays.put("Chine", chine);
		pays.put("Russie", russie);
		pays.put("Inde", inde);

		for (String cle : pays.keySet()) {
			System.out.println(cle);
		}

		System.out.println("\n");
		Collection<Pays> listeP = pays.values();
		int hab = listeP.iterator().next().getNbHab();
		String suppr = listeP.iterator().next().getPays();

		for (Pays valeur : listeP) {
			System.out.println(valeur.getPays() + " " + valeur.getNbHab() + " " + valeur.getPib());
			// Les éléments sont affichés dans le désordre

			if (valeur.getNbHab() < hab) {
				hab = valeur.getNbHab();
				suppr = valeur.getPays();
			}
		}
		System.out.println("\n");
		pays.remove(suppr);

		for (Pays valeur : listeP) {
			System.out.println(valeur.getPays());
		}
	}

}
