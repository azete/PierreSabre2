package Histoire;
import Personnages.Humain;
import Personnages.Commercant;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain humain = new Humain ("Prof", "Kombucha", 54);
		humain.direBonjour();
		humain.acheter("boisson", 12);
		humain.boire();
		humain.acheter("jeu",2);
		humain.acheter("kimono", 50);
		Commercant j = new Commercant("Marco", "thé", 20);
		j.direBonjour();
		j.seFaireExtorquer();
		j.recevoirArgent(15);	
		j.boire();
	}
}