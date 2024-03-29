package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	public Gaulois(String nom, int force) {
		
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+texte+">>");
	}
	
	private String prendreParole() {
		return "Le gaulois"+nom+":";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom+"envoie un grand coup dans la m�choire de "+romain.getNom());
		romain.recevoirCoup((force/3)*effetPotion);
	}
	
	
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
		System.out.println(prendreParole()+"<<Merci Druide, je sens que ma force est d�cupl�e par "+effetPotion+">>");
		
	}
	
	
	public static void main(String[] args) {
		//TODO cr�er un main permettant de tester la classe Gaulois
		Gaulois asterix=new Gaulois("Ast�rix",8);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("Bonsoir, je suis Ast�rix haha!");
		Romain tiberus=new Romain("Tiberus",5);
		asterix.frapper(tiberus);
		Romain victimus=new Romain("Victimus",9);
		asterix.boirePotion(5);
		asterix.frapper(victimus);
	}

}

