package TP1;

public class Phare {
	
	boolean allume;
	
	public Phare() {
		allume = false;
	}
	
	public void allumer() {
		this.allume = true;
		System.out.println("Le phare s'allume");
	}
	
	public void eteindre() {
		this.allume = false;
		System.out.println("Le phare s'éteint");
	}
}