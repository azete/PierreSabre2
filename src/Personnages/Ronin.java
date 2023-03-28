package Personnages;

public class Ronin extends Humain{
	private int honneur =1;
	
	public Ronin(String nom, String boisson, int argent, int honneur) {
		super(nom, boisson, argent);
		this.honneur=honneur;
	}
	public void donner(Commercant j) {
		int kdo= super.getArgent()*1/10;
		super.setArgent(super.getArgent()-super.getArgent()*1/10);
		super.parler( j.getNom() +" prend ces  "+ kdo +" sous !");
	}
	public void provoquer(Yakuza adversaire) {
		if (honneur*2 >= adversaire.reputation * 2){
			honneur++;
			super.setArgent(super.getArgent()+adversaire.getArgent());
			parler("j'ai gagner");
			adversaire.perdre();
		}
		else {
			adversaire.gagner(super.getArgent());
			honneur--;
			super.setArgent(0);
			parler("j'ai perdu ...");
		}
	}
}
