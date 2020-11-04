package TP3;

public class BuilderJeuDeMorpion extends Builder{

	@Override
	public Jeu getPartie(Joueur j1, Joueur j2) {
		return new JeuDeMorpion(j1, j2);
	}
}