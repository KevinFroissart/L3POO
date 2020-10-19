package bddAlgo;

import java.util.ArrayList;
import java.util.List;

public class Algo {
	
	public static void main(String args[]){
		ArrayList<DF> ensembleDF = new ArrayList<DF>();
		
		ensembleDF.add(new DF("A", "B"));
		ensembleDF.add(new DF("A", "C"));
		ensembleDF.add(new DF("A", "D"));
		ensembleDF.add(new DF("CD", "E"));
		ensembleDF.add(new DF("BE", "F"));
		ensembleDF.add(new DF("ABE", "G"));
		ensembleDF.add(new DF("EG", "ABD"));
		ensembleDF.add(new DF("FG", "AE"));
		ensembleDF.add(new DF("AB", "B"));
		ensembleDF.add(new DF("A", "E"));

	    System.out.println(fermetureAttribut(ensembleDF, "BE"));
	    
	    List<DF> couvMini = couvertureMinimale(ensembleDF);
	    for(DF d : couvMini) {
	    	System.out.println(d.toString());
	    }

	}
	
	public List<DF> reductionDesParties(List<DF> ensembleDF){
		List<DF> reduit = new ArrayList<DF>();
		
		for(DF df : ensembleDF) {
			String w = df.getAttributsGauche();
			for(int i = 0; i < w.length(); i++) {
				//reduit.add
			}
		}
		
		for(DF df : ensembleDF) {
			String w = df.getAttributsDroite();
			for(int i = 0; i < w.length(); i++) {
				//reduit.add
			}
		}
		
		return reduit;
	}
	
	public static List<DF> couvertureMinimale(List<DF> ensembleDF){
		List<DF> result = new ArrayList<DF>();
		
		for(DF d : ensembleDF){
			String X = d.getAttributsGauche();
			result.add(new DF(X, fermetureAttribut(ensembleDF, X)));
		}
		//on fait une liste de fermeture en fonction de notre ensemble
		
		for(DF d : result){ // Pour chaque DF
			List<DF> singletonDF = new ArrayList<DF>();
			singletonDF.add(d); //J'ajoute la DF à une autre liste singletonDF
			
			List<DF> diff = difference(result, singletonDF); //Une nouvelle liste diff qui compare mon ensemble de fermeture et mon singleton
			
			
			if(infere(diff, d)) result = diff; //Si notre diff est juste, on la copie sur *result*?
		}
		return result;
	}
	  
	public static String fermetureAttribut(List<DF> ensembleDF, String ensembleAttributs){
		String closure = ensembleAttributs;
		boolean done = false;
		while(!done) {
			done = true;
			for(DF d : ensembleDF) {
				if(inclusion(d.getAttributsGauche(), closure) && !inclusion(d.getAttributsDroite(), closure)) {
					closure += d.getAttributsDroite();
					done = false;
				}
			}
		}
		return closure;
	}
	  
	public static List<DF> difference(List<DF> ensemble1, List<DF> ensemble2){
		return null;
	}	
	
	public static boolean infere(List<DF> ensembleDf, DF df){
		String fermeture = fermetureAttribut(ensembleDf, df.getAttributsDroite());
		return inclusion(df.getAttributsDroite(), fermeture);
	}

	    
	public static boolean inclusion(String ensemble1, String ensemble2) {
		for(char attribut : ensemble1.toCharArray()){
			if(ensemble2.indexOf(attribut) == -1){
				return false;
			}
		}
		return true;
	}
}
