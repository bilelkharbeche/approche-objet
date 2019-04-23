package fr.diginamic.entites;

public class Client {
	
	public int numeroCompte;
	public String nom;
	public String prenom;
	
	public Client(int compte, String name, String nickname) {
		
		numeroCompte = compte;
		nom = name;
		prenom = nickname;
		
		System.out.println("Nom " + name + " Prénom " + nickname + " Numéro de compte " + compte);		
	}

}
