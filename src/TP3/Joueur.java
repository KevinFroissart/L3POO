/*
 * Joueur.java                                                        23/10/2019
 */
package TP3;

import TP3.Coup;
import TP3.Plateau;

public abstract class Joueur {
    private int id;
    
    public Joueur(int id) {
        this.id = id;
    }

    public abstract Coup getCoup(Plateau etatJeu);
    
    public int getId() {
        return id;
    }
}