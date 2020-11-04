/*
 * Jeu.java                                                           30/10/2019
 */
package TP3;

import TP3.Joueur;

public abstract class Jeu {

	public static final int N_JOUEURS = 2;
	protected Plateau plateau;
	private Joueur[] joueurs;
	private int idxJoueurActuel;

	public Jeu(Joueur joueur1, Joueur joueur2, Plateau plateau) {
		joueurs = new Joueur[N_JOUEURS];
		joueurs[0] = joueur1;
		joueurs[1] = joueur2;
		this.plateau = plateau;
		idxJoueurActuel = N_JOUEURS-1;
	}

	protected abstract boolean partieGagnee();

	public boolean partieTerminee() {
		if (partieGagnee()) return true;

		for (int i = 0; i < plateau.getLongueur(); ++i) {
			for (int j = 0; j < plateau.getLargeur(); ++j) {
				if (plateau.coupPossible(i, j)) return false; 
			}
		}
		return true;
	}

	private Joueur getJoueurSuivant() {
		idxJoueurActuel = (idxJoueurActuel+1) % N_JOUEURS;
		return joueurs[idxJoueurActuel];
	}

	public Joueur jouerPartie() {
		Joueur retour = null;

		System.out.println(plateau);
		while (!partieTerminee()) {
			retour = getJoueurSuivant();
			Coup c = retour.getCoup(plateau);
			if (plateau.coupPossible(c)) {
				plateau.appliquerCoup(c, retour.getId());
			} else {
				System.err.print("erreur");
				System.exit(1);
			}
			System.out.println(plateau);
		}
		if (!partieGagnee()) {
			retour = null;
		}
		return retour;
	}
}