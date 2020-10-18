package bdd;

import java.util.Arrays;

public class Schema {

	String R;
	
	public Schema(String schema) {
		this.R = schema;
	}
	
	public boolean ajoute(String autre) {
		boolean res = true;
		for(int i = 0; i < autre.length(); i++) {
			if(this.R.indexOf(autre.charAt(i)) == -1) {
				setR(sortString(R+autre.charAt(i)));
				res = false;
			}
		}
		return res;
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
	
	public static String sortString(String inputString) { 
	    char tempArray[] = inputString.toCharArray();   
	    Arrays.sort(tempArray); 
	    return new String(tempArray); 
	} 
}