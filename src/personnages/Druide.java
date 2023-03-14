package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private static int forcePotion=1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide" + nom + "et ma potion peut aller d'une force " + effetPotionMin + "à" + effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+ texte + ">>");
	}
	private String prendreParole() {
		return "Le druide"+nom+":";
	}
	
	
	public void preparerPotion() {
		Random random=new Random();
		forcePotion=random.nextInt(effetPotionMax+1-effetPotionMin)+effetPotionMin;
	}
	
	public static void main(String[] args) {
		Druide panoramix=new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
		panoramix.parler("ma potion est de force "+forcePotion);
		
	}
	
	
	
}
