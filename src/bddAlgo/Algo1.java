package bddAlgo;

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
				
		while(!closure2.toString().equals(closure.toString())) {
			closure2 = new Schema(closure.toString());
			for(int i = 0; i < unused.size(); i++) {
				if(closure.ajoute(unused.get(i))) {
					System.out.print(closure + " =: " + unused.get(i) + " - ");
					unused.remove(unused.get(i--));
					System.out.println(unused);
				}	
			}	
		}
		return closure;
	}

}