/*
 * Plateau.java                                                       30/10/2019
 */
package TP3;

public abstract class Plateau {

	private int longueur;
	private int largeur;
	protected int[][] etatIdPlateau;

	public Plateau(int longueur, int largeur) 
			throws IllegalArgumentException {
		if (longueur <= 0) throw new IllegalArgumentException("La longueur du plateau doit être un entier strictement positif. ");
		if (largeur <= 0) throw new IllegalArgumentException("La largeur du plateau doit être un entier strictement positif. ");

		this.longueur = longueur;
		this.largeur = largeur;
		initialiser();
	}


	public void initialiser() {
		this.etatIdPlateau = new int[this.longueur][this.largeur];
	}

	public abstract void appliquerCoup(Coup coup, int id)
			throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

	public boolean coupDansPlateau(int x, int y) {
		return x >= 0 && y >= 0
				&& x < longueur && y < largeur;
	}

	public boolean coupDansPlateau(Coup coup) {
		return coupDansPlateau(coup.getX(), coup.getY());
	}

	public abstract boolean coupPossible(int x, int y);

	public boolean coupPossible(Coup coup) {
		return coupPossible(coup.getX(), coup.getY());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < this.longueur; ++i) {
			for (int j = 0; j < this.largeur; ++j) {
				sb.append(this.etatIdPlateau[i][j]).append(' ');
			}
			sb.append(System.lineSeparator());
		}

		return sb.toString();
	}


	public int getLongueur() {
		return longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public int getEtatIdCase(int x, int y) 
			throws ArrayIndexOutOfBoundsException {
		return this.etatIdPlateau[y][x];
	}
}