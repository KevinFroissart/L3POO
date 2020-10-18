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
		for(int i = 0; i < df.size(); i++) {
			Algo1 a1 = new Algo1(df, new Schema(df.get(i).getGauche())); //on calcul la fermeture de la df
			G.add(new DF(df.get(i).getGauche(), a1.calcul(false).toString())); //on créer une nouvelle DF avec sa fermeture à droite X->X+
		}
		
		for(int i = 0; i < G.size(); i++) {
			for(int j = 0; j < G.size(); j++) {
				if(G.get(i).getDroite().equals(G.get(j).getDroite()) && j != i) {
					G.remove(i);
				}
			}
		}
		return G;
	}

	@Override
	public String toString() {
		String res = "";
		for(DF dfd : G) res += dfd.toString() + "\n";
		return res;
	}
	
	
}
