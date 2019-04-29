/**
 * 
 */
package fr.diginamic.sets;

/**
 * @author KHARBECHE Bilel
 *
 */
public class Pays {

	private String pays;
	private int nbHab;
	private int pib;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pays other = (Pays) obj;
		if (pays == null) {
			if (other.pays != null)
				return false;
		} else if (!pays.equals(other.pays))
			return false;
		return true;
	}

	public Pays(String pays, int nbHab, int pib) {
		this.pays = pays;
		this.nbHab = nbHab;
		this.pib = pib;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getNbHab() {
		return nbHab;
	}

	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}

	public int getPib() {
		return pib;
	}

	public void setPib(int pib) {
		this.pib = pib;
	}

}
