package bddAlgo;

import java.util.Arrays;

public class Schema {

	private String R;
	
	public Schema(String schema) {
		this.R = schema;
	}
	
	public boolean ajoute(DF autre) {
		String autreG = autre.getAttributsGauche();
		String autreD = autre.getAttributsDroite();
				
		for(int i = 0; i < autreG.length(); i++) {
			if(this.R.indexOf(autreG.charAt(i)) == -1) return false;
		}
		for(int j = 0; j < autreD.length(); j++) {
			if(this.R.indexOf(autreD.charAt(j)) == -1) setR(sortString(R+autreD.charAt(j)));
		}
		return true;
	}
	
	public String getR() {
		return this.R;
	}

	public void setR(String r) {
		R = r;
	}

	@Override
	public String toString() {
		return R;
	}
	
	private String sortString(String inputString) { 
	    char tempArray[] = inputString.toCharArray();   
	    Arrays.sort(tempArray); 
	    return new String(tempArray); 
	} 
}