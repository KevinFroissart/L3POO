package bddAlgo;

import java.util.ArrayList;

public class Algo2 {

	private ArrayList<DF> df;
	private ArrayList<DF> G;
	
	public Algo2(ArrayList<DF> df) {
		this.df = new ArrayList<DF>(df);
		G = new ArrayList<DF>();
	}
	
	public ArrayList<DF> calcul() {
		G.clear();
		
		for(DF d : df) {
			Algo1 a1 = new Algo1(df, new Schema(d.getAttributsGauche()));
			G.add(new DF(d.getAttributsGauche(), a1.calcul(false).toString()));
		}	
		
		/*for(int i = 0; i < G.size(); i++) {
			for(int j = 0; j < G.size(); j++) {
				if(G.get(i).getDroite().equals(G.get(j).getDroite()) && j != i && G.get(i).getDroite() != "ABCDEF") {
					G.remove(i);
				}
			}
		}*/
		return G;
	}

	@Override
	public String toString() {
		String res = "";
		for(DF dfd : G) res += dfd.toString() + "\n";
		return res;
	}
	
	
}
