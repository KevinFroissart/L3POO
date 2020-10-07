package TP1;

public class Somme {

	public static void main(String[] args) {
		
		double somme;
		int nb;
		
		try {
			nb = Integer.parseInt(args[0]);
			somme = nb;
			for(int i = nb; i < nb + 11; i++) {
				somme+=1/i;
			}
		} catch(Exception e) {
			nb = 0;
			somme = 0;
			for(int i = nb; i < nb + 11; i++) {
				somme+=i;
			}
		}
		
		System.out.println(somme);	
	}	
}