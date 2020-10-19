package bddAlgo;

import java.util.ArrayList;

public class Algo3 {
	
	ArrayList<DF> min;
	
	public Algo3(ArrayList<DF> Fmini) {
		this.min = new ArrayList<DF>(Fmini);
	}
	
	public ArrayList<DF> calcul(){
		
		for(DF df : min) {
			String w = df.getAttributsGauche();
			for(int i = 0; i < w.length(); i++) {
				
			}
		}
		
		for(DF df : min) {
			String w = df.getAttributsDroite();
			for(int i = 0; i < w.length(); i++) {
				
			}
		}
		
		return min;
	}

}
