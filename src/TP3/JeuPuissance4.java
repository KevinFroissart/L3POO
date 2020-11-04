package TP3;

import TP3.Joueur;

public class JeuPuissance4 extends Jeu {

	public JeuPuissance4(Joueur joueur1, Joueur joueur2) {
		super(joueur1, joueur2, new PlateauPuissance4());
	}

	@Override
	protected boolean partieGagnee() {
		final int longueur = plateau.getLongueur();
		final int largeur = plateau.getLargeur();
		boolean colAlignee, ligAlignee;
		
		for (int i = 0; i < longueur; ++i) {
			colAlignee = plateau.getEtatIdCase(i, 0) != 0;
			ligAlignee = plateau.getEtatIdCase(0, i) != 0;

			for (int j = 1; j < largeur; ++j) {
				colAlignee = colAlignee && (plateau.getEtatIdCase(i, 0) 
						== plateau.getEtatIdCase(i, j));
				ligAlignee = ligAlignee && (plateau.getEtatIdCase(0, i) 
						== plateau.getEtatIdCase(j, i));
			}

			if (colAlignee || ligAlignee) return true;
	
		}

		boolean diag1Alignee = plateau.getEtatIdCase(0, 0) != 0;
		boolean diag2Alignee = plateau.getEtatIdCase(0, longueur-1) != 0;
		for (int i = 0; i < longueur; ++i) {
			diag1Alignee = diag1Alignee && (plateau.getEtatIdCase(0, 0)
					== plateau.getEtatIdCase(i, i));
			diag2Alignee = diag2Alignee && (plateau.getEtatIdCase(0, longueur-1)
					== plateau.getEtatIdCase(i, longueur-1-i));
		}
		return diag1Alignee || diag2Alignee;
	}
}