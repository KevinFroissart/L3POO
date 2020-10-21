package TP3;

public abstract class Joueur {

	private int id;
	
	public Joueur(int _id) {
		this.id = _id;
	}

	public int getId() {
		return id;
	}
	
	public abstract Coup getCoup(Plateau _etatJeu);
}