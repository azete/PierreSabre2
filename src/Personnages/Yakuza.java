package Personnages;

public class Yakuza extends Humain{
	private String clan;
	public int reputation;
	
	public Yakuza (String nom, String boisson, int argent, String clan, int reputation) {
		super(nom, boisson, argent);
		this.clan= clan;
		this.reputation= reputation;
	}
	
	public void extorquer(Commercant victime) {
		super.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		super.parler(victime.getNom() +"si tu tiens à la vie donne moi ta bourse !");
		int x=victime.getArgent();
		super.gagnerArgent(victime.seFaireExtorquer());
		reputation++;
		super.parler("J’ai piqué les "+ x + " sous de "+ victime.getNom()+ ", ce qui me fait "+ super.getArgent() +" sous dans ma poche. Hi ! Hi !");
	}
	public void perdre() {
		super.setArgent(0);
		reputation--;
		parler("jai tout perdu...");
	}
	public void gagner(int gain) { 
		super.setArgent(getArgent()+gain);
		reputation++;
		parler("J'ai gagner ahahah");
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		System.out.println("Mon clan est celui de " + clan);
	}
	
}
