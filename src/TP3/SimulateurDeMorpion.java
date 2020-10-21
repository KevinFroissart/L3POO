package TP3;

public class SimulateurDeMorpion {

	public static void main(String[] args) {
		
		Plateau p1 = new Plateau(3, 3);
		p1.initialiser();
		p1.appliquerCoup(new Coup(2, 1), 5);
		System.out.println(p1.toString());
	}
}