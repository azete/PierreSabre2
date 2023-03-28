package Personnages;

public class Humain {
	public String nom;
	public String boisson;
	public int argent;

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	public int getArgent() {
		return argent;
	}
	public String getNom() {
		return nom;
	}
	protected void parler(String texte) {
		System.out.println("L'humain " + nom + " dit : " + texte + " .");
	}
	public void direBonjour() {
		parler("Bonjour ! , Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}

	public void boire() {
		parler("Mmmmm, un bon verre de " + boisson + " ! Gloupss !");
	}

	public void acheter(String bien, int prix) {
		if (prix > argent) {
			parler("Je n'ai plus que " + argent + " sous en poche, Je ne peux meme pas m'offrir " + bien
					+ " à " + prix);
		} else {
			perdreArgent(prix);
			parler("j'ai " + argent + " sous en poche, je vais pouvoir m'acheter " + bien + " à " + prix);
		}
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}
}
