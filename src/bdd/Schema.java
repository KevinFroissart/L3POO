package bdd;

public class Schema {

	String R;
	
	public Schema(String schema) {
		this.R = schema;
	}
	
	public boolean contientAjoute(String autre) {
		boolean res = true;
		for(int i = 0; i < autre.length(); i++) {
			if(this.R.indexOf(autre.charAt(i)) == -1) {
				setR(R+autre.charAt(i));
				res = false;
			}
		}
		return res;
	}
	
	public boolean contient(String autre) {
		for(int i = 0; i < autre.length(); i++) {
			if(this.R.indexOf(autre.charAt(i)) == -1) {
				return false;
			}
		}
		return true;
	}
	
	
	public void ajoute(String nv) {
		System.out.println(R + " nv : " + nv);
		if(!this.contient(nv)) setR(R+nv);
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
}