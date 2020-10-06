package TP1;

public class Somme {

	public static void main(String[] args) {
		
		float somme;
		int nb;
		nb = Integer.parseInt(args[0]);
		
		if(args.length > 0)
			somme = nb;
		else
			somme = 0;
		
		for(int i = nb; i < nb + 11; i++) {
			somme+=1/i;
		}
		
		System.out.println(somme);	
	}	
}