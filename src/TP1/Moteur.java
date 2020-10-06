package TP1;

public class Moteur {
	
	boolean demarre;
	
	public Moteur() {
		demarre = false;
	}

	public void demarrer() {
		this.demarre = true;
		System.out.println("Le moteur s'allume");
	}
	
	public void eteindre() {
		this.demarre = false;
		System.out.println("Le moteur s'éteint");
	}
}