package TP3;

public class JeuDeMorpion {

	public static final int N_JOUEUR = 2;
	public static final int LONGUEUR = 3;
	public static final int LARGEUR = 3;

	private Plateau plateau;
	private Joueur joueurs[];
	private int indexJoueur;

	public JeuDeMorpion(Joueur joueur1, Joueur joueur2) {
		joueurs = new Joueur[N_JOUEUR];
		joueurs[0] = joueur1;
		joueurs[1] = joueur2;
		plateau = new Plateau(LONGUEUR, LARGEUR);
		indexJoueur = N_JOUEUR - 1;
	}

	public boolean partieTerminee() {
		for(int i = 0; i < LARGEUR; i++) {
			for(int j = 0; j < LONGUEUR; j++) {
				if(coupPossible(new Coup(i, i))) return false;
			}
		}
		return true;
	}

	private Joueur joueurSuivant() {
		indexJoueur = (indexJoueur+1) % N_JOUEUR;
		return joueurs[indexJoueur];
	}

	public boolean coupPossible(Coup coup) {
		return plateau.etatIDPlateau[coup.getX()][coup.getY()] == 0;
	}

	public Joueur jouerPartie() {
		Joueur retour = null;

		while(!partieTerminee()) {
			retour = joueurSuivant();
			Coup c = retour.getCoup(plateau);
			if (coupPossible(c))
				plateau.appliquerCoup(c,retour.getId());
			else
				System.err.print("erreur") ;
			System.exit(1) ;

		}
		return retour;
	}
}
