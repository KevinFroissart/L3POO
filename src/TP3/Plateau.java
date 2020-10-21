package TP3;

public class Plateau {
	
	public int longueur;
	public int largeur;
	public int etatIDPlateau[][];
	
	public Plateau(int _longueur, int _largeur) {
		this.longueur = _longueur;
		this.largeur = _largeur;
		this.etatIDPlateau = new int[longueur][largeur];
	}
	
	public void initialiser() {
		for(int i = 0; i < longueur; i++) {
			for(int j = 0; j < largeur; j++) {
				etatIDPlateau[i][j] = 0;
			}
		}
	}
	
	public void appliquerCoup(Coup coup, int id) {
		etatIDPlateau[coup.getX()][coup.getY()] = id;
	}

	@Override
	public String toString() {
		String res = "";
		for(int i = 0; i < longueur; i++) {
			for(int j = 0; j < largeur; j++) {
				res += "[" + etatIDPlateau[i][j] + "]";
			}
			res += "\n";
		}
		return res;
	}
	
	
}
