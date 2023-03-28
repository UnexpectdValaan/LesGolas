package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois villageois[];
	private int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];

	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois = nbVillageois + 1;
	}

	public Gaulois trouverHabitant(int numerovillageois) {
		return villageois[numerovillageois];
	}

	public void afficherVillageois() {
		String message = "Dans le " + nom + " du chef " + chef.getNom() + " vivent les légendaires gaulois:";
		int c = 0;
		while (c < nbVillageois) {
			message = message + "\n -" + villageois[c].getNom();
			c=c+1;
		}

		System.out.println(message);

	}

	public static void main(String[] args) {
		Village village_irreductibles = new Village("Village des irréductibles", 30);
		// village[30] est hors limite pour une longueur 30
//		Gaulois gaulois = village_irreductibles.trouverHabitant(29);
		Chef abraracourcix = new Chef("Abraracourcix", 6, village_irreductibles);
		village_irreductibles.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village_irreductibles.ajouterHabitant(asterix);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village_irreductibles.ajouterHabitant(obelix);
//		Gaulois gaulois = village_irreductibles.trouverHabitant(1);
//		System.out.println(gaulois);
		village_irreductibles.afficherVillageois();

	}

}
