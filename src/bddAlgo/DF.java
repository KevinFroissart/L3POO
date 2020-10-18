package bddAlgo;

public class DF {

	private String gauche;
	private String droite;
	
	public DF(String gauche, String droite) {
		this.gauche = gauche;
		this.droite = droite;
	}

	public String getGauche() {
		return gauche;
	}

	public String getDroite() {
		return droite;
	}

	@Override
	public String toString() {
		return gauche + "->" + droite;
	}
}