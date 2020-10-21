package TP3;

import java.util.Scanner;

public class JoueurHumain extends Joueur{

	public JoueurHumain(int _id) {
		super(_id);
	}

	@Override
	public Coup getCoup(Plateau _etatJeu) {
		boolean joue = false;
		Coup coup = null;
		int x;
		int y;
		while(!joue) {
			do {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Entrez x entre 0 et " + _etatJeu.largeur + " : ");
				x = scanner.nextInt();
				System.out.println();
				System.out.print("Entrez y entre 0 et " + _etatJeu.longueur + " : ");
				y = scanner.nextInt();
				System.out.println();
			} while(x < _etatJeu.largeur && x >= 0 && y < _etatJeu.longueur && y >= 0);
			
			coup = new Coup(x, y);
			if(_etatJeu.etatIDPlateau[coup.getX()][coup.getY()] == 0) {
				_etatJeu.appliquerCoup(coup, getId());
				joue = true;
			}
		}
		return coup;
	}
	
	
}
