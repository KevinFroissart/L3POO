package bddAlgo;

import java.util.ArrayList;

public class Algo1 {

	private ArrayList<DF> unused;
	private Schema closure;
	
	public Algo1(ArrayList<DF> unused, Schema closure) {
		this.unused = new ArrayList<DF>(unused);
		this.closure = new Schema(closure.toString());
	}
	
	public Schema calcul(boolean print) {
		
		Schema closure2 = new Schema("");
				
		while(!closure2.toString().equals(closure.toString())) {
			closure2 = new Schema(closure.toString());
			for(int i = 0; i < unused.size(); i++) {
				if(closure.ajoute(unused.get(i))) {
					if(print) System.out.println(closure + " =: " + unused.get(i) + " - " + unused);
					unused.remove(unused.get(i--));
				}	
			}	
		}
		return closure;
	}

}