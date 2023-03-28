package Histoire;
import Personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
//		Humain humain = new Humain ("Prof", "Kombucha", 54);
//		humain.direBonjour();
//		humain.acheter("boisson", 12);
//		humain.boire();
//		humain.acheter("jeu",2);
//		humain.acheter("kimono", 50);
		Commercant j = new Commercant("Marco", "thé", 20);
		j.direBonjour();
		j.seFaireExtorquer();
		j.recevoirArgent(15);	
		j.boire();
		Yakuza k = new Yakuza ("Yaku le noir", "whisky", 30 , "Warsong", 0);
		k.direBonjour();
		k.extorquer(j);
		j.seFaireExtorquer();
		Ronin u = new Ronin("Roro", "Shochu", 60, 1);
		u.direBonjour();
		int x=u.getArgent();
		u.donner(j);
		j.recevoirArgent(x * 1 / 10);
		u.provoquer(k);
	}
}