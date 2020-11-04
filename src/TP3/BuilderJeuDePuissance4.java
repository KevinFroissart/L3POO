package TP3;

public class BuilderJeuDePuissance4 extends Builder{

	@Override
	public Jeu getPartie(Joueur j1, Joueur j2) {
		return new JeuPuissance4(j1, j2);
	}
}