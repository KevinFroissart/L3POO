package TP3;

import java.util.ArrayList;
import java.util.List;

public class Tournoi {

	protected Builder builder;
	public List<Joueur> tabjoueurs;
	
	public Tournoi(Builder builder) {
		this.builder = builder;
        this.tabjoueurs = new ArrayList<Joueur>();
	}
	
	public void addJoueur(Joueur joueur) {
		if (joueur == null) throw new NullPointerException("Le joueur ne doit pas être null !");
		if (this.tabjoueurs.contains(joueur)) throw new IllegalArgumentException("Le joueur est déjà inscrit dans le tournoi !");
        this.tabjoueurs.add(joueur);
	}
	
	public String jouerTournoi() {
        final int nbJoueurs = this.tabjoueurs.size();
        if (nbJoueurs == 0) {
            return "";
        }
        Joueur gagnant = this.tabjoueurs.get(0);
        for (int i = 1; i < nbJoueurs; ++i) {
            Joueur concurrent = this.tabjoueurs.get(i);
            gagnant = this.jouerPartie(gagnant, concurrent);
        }
        return (gagnant != null) ? String.valueOf(gagnant.getId()) : "";
    }

    private Joueur jouerPartie(Joueur j1, Joueur j2) {
        Jeu jeu = this.builder.getPartie(j1, j2);
        Joueur gagnant = jeu.jouerPartie();
        if (gagnant == null) {
            gagnant = j1;
        }
        return gagnant;
    }
}