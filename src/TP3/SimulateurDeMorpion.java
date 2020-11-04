/*
 * SimulateurDeMorpion.java                                           23/10/2019
 */
package TP3;

import TP3.JeuDeMorpion;
import TP3.Joueur;
import TP3.JoueurAleatoire;
import TP3.JoueurHumain;

public class SimulateurDeMorpion {
    public static void main(String[] args) {
        Joueur j1 = new JoueurHumain(1),
               j2 = new JoueurAleatoire(2),
               gagnant;
        JeuDeMorpion jeu = new JeuDeMorpion(j1, j2);
        gagnant = jeu.jouerPartie();
        if (gagnant != null) {
            System.out.println("Le joueur " + gagnant.getId() + " a gagné !");
        } else {
            System.out.println("Partie terminée : égalité !");
        }
    }
}
