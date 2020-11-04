/*
 * JoueurHumain.java                                               23/10/2019
 */
package TP3;

import java.util.Scanner;
import TP3.Coup;
import TP3.Plateau;

public class JoueurHumain extends Joueur {
	private Scanner entreeJoueur;

	public JoueurHumain(int id) {
		super(id);
		entreeJoueur = new Scanner(System.in);
	}

	private int saisirCoord() {
		String entreeUtil;
		while (!entreeJoueur.hasNextInt()) {
			entreeUtil = entreeJoueur.next();
			System.out.print(entreeUtil + " n'est pas un nombre entier. "
					+ System.lineSeparator()
					+ "Veuillez refaire votre saisie : ");
		}

		return entreeJoueur.nextInt();
	}

	private Coup saisirCoup() {
		int x, y;
		Coup coupJoueur;

		System.out.print("x : ");
		x = saisirCoord();
		System.out.print("y : ");
		y = saisirCoord();
		coupJoueur = new Coup(x, y);

		return coupJoueur;
	}


	@Override
	public Coup getCoup(Plateau etatJeu) {
		Coup coupJoueur = saisirCoup();

		while(!etatJeu.coupPossible(coupJoueur)) {
			System.out.println("Coordonnées incorrectes. "
					+ System.lineSeparator()
					+ "Veuillez refaire votre saisie : ");
			coupJoueur = saisirCoup();
		}

		return coupJoueur;
	}
}