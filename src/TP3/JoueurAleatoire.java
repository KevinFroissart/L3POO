package TP3;

public class JoueurAleatoire extends Joueur{

	public JoueurAleatoire(int _id) {
		super(_id);
	}

	@Override
	public Coup getCoup(Plateau _etatJeu) {
		boolean joue = false;
		Coup coup = null;
		while(!joue) {
			coup = new Coup((int) (Math.random() * _etatJeu.largeur), (int) (Math.random() * _etatJeu.longueur));
			if(_etatJeu.etatIDPlateau[coup.getX()][coup.getY()] == 0) _etatJeu.appliquerCoup(coup, getId());
		}
		return coup;
	}
}
