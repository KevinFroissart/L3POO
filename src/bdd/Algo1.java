package bdd;

import java.util.ArrayList;

public class Algo1 {

	private ArrayList<DF> unused;
	private Schema closure;
	
	public Algo1(ArrayList<DF> unused, Schema closure) {
		this.unused = unused;
		this.closure = closure;
	}
	
	public Schema calcul() {
		
		Schema closure2 = new Schema("");
				
		while(!closure2.equals(closure)) {
			closure2 = closure;
			for(int i = 0; i < unused.size(); i++) {
				//System.out.println(closure.toString() + " -> " + unused.get(i).getGauche());
				if(closure.toString().length() == 1) {
					if(closure.equals(unused.get(i).getGauche())) {
						closure.ajoute(unused.get(i).getDroite());
						unused.remove(unused.get(i));
					}
					else return closure;
				} else
				if(closure.ajoute(unused.get(i).getGauche())) {
					unused.remove(unused.get(i));
					i--;
				}
			}
		}
		return closure;
	}

}