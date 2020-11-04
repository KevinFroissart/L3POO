/*
 * PlateauPuissance4.java                                             30/10/2019
 */
package TP3;

public class PlateauPuissance4 extends Plateau {

	private static final int LONGUEUR = 4;
	private static final int LARGEUR = 4;

	public PlateauPuissance4() {
		super(LONGUEUR, LARGEUR);
	}

	@Override
	public void appliquerCoup(Coup coup, int id)
			throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
		if (id <= 0) throw new IllegalArgumentException("L'identifiant du joueur doit être un entier strictement positif. ");

		this.etatIdPlateau[coup.getY()][coup.getX()] = id;
	}

	public boolean coupPossible(int x, int y) {
		if (!(coupDansPlateau(x, y) && getEtatIdCase(x, y) == 0)) {
			return false;
		}
		return y == LONGUEUR - 1 || getEtatIdCase(x, y+1) != 0;
	}                
}