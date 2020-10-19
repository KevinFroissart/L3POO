package bddAlgo;

public class DF {

	private String attributsGauche;
    private String attributsDroite;

    public DF(String g, String d){
        attributsGauche = g;
        attributsDroite = d;
    }

    public String getAttributsGauche()
    {
        return attributsGauche;
    }

    public String getAttributsDroite()
    {
        return attributsDroite;
    }

	@Override
	public String toString() {
		return attributsGauche + "->" + attributsDroite;
	}

}