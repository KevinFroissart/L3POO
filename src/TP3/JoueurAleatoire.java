/*
 * JoueurAleatoire.java                                               23/10/2019
 */
package TP3;

import TP3.Coup;
import TP3.Plateau;
import TP3.Tool;

public class JoueurAleatoire extends Joueur {
    public JoueurAleatoire(int id) {
        super(id);
    }
    
    
    @Override
    public Coup getCoup(Plateau etatJeu) {
        int x, y;
        Coup coupAlea;
        
        do {
            x = Tool.monRandom(0, etatJeu.getLongueur()-1);
            y = Tool.monRandom(0, etatJeu.getLargeur()-1);
            coupAlea = new Coup(x, y);
        } while (!etatJeu.coupPossible(coupAlea));
    
        return coupAlea;
    }
}
