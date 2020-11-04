/*
 * PlateauMorpion.java                                                30/10/2019
 */
package TP3;

public class PlateauMorpion extends Plateau {

	private static final int LONGUEUR = 3;
	private static final int LARGEUR = 3;

	public PlateauMorpion() {
		super(LONGUEUR, LARGEUR);
	}

	@Override
	public void appliquerCoup(Coup coup, int id)
			throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
		if (id <= 0) throw new IllegalArgumentException("L'identifiant du joueur doit être un entier strictement positif. ");

		this.etatIdPlateau[coup.getY()][coup.getX()] = id;
	}

	@Override
	public boolean coupPossible(int x, int y) {
		return coupDansPlateau(x, y) && getEtatIdCase(x, y) == 0;
	}                
}