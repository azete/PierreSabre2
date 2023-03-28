package Personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boisson, int argent) {
		super(nom, "thé", argent);
	}

	public void recevoirArgent(int argent2) {
		super.gagnerArgent(argent2);
		super.parler(argent2 + " sous, je te remercie généreux donateur !");
	}

	public int seFaireExtorquer() {
		int perte= super.getArgent();
		super.perdreArgent(perte);
		super.parler("J'ai tout perdu ! Le monde est trop injuste...");
		return perte;
	}
}
