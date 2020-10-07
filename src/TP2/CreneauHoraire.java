package TP2;

import java.util.Scanner;

public class CreneauHoraire {

	int jour, heure, minute, duree;
	
	public CreneauHoraire(int jour, int heure, int debMinute, int dureeMinure) {
		this.jour = jour;
		this.heure = heure;
		this.minute = debMinute;
		this.duree = dureeMinure;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getHeure() {
		return heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	public int getDebMinute() {
		return minute;
	}

	public void setDebMinute(int debMinute) {
		this.minute = debMinute;
	}

	public int getDureeMinure() {
		return duree;
	}

	public void setDureeMinure(int dureeMinure) {
		this.duree = dureeMinure;
	}
	
	// Avant de redéfinir equals, le "équivalent" sur c1 et c2 ne fonctionnait pas
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		
		final CreneauHoraire autre = (CreneauHoraire) obj;
		
		if(this.duree != autre.duree) return false;
		if(this.minute != autre.minute) return false;
		if(this.heure != autre.heure) return false;
		if(this.jour != autre.jour) return false;
		
		return true;
	}
	
	private static int saisirNbEntier(Scanner sc) {
        String entreeUtil;
        
        while (!sc.hasNextInt()) {
            entreeUtil = sc.next();
            System.out.println(entreeUtil + " n'est pas un nombre entier. ");
        }
        return sc.nextInt();
    }
	
	public static CreneauHoraire saisirCreneau() {
        Scanner sc = new Scanner(System.in);
        int jour, heure, minute, duree;
        CreneauHoraire creneauSaisi;
        
        System.out.println("Veuillez saisir les valeurs du créneau à créer. ");
        
        System.out.print("Numéro du jour : ");
        jour = saisirNbEntier(sc);
        while (jour <= 0) {
            jour = demanderRessaisie(sc, jour);
        }
        
        System.out.print("Heure : ");
        heure = saisirNbEntier(sc);
        while (heure <= 0 || heure >= 24) {
            heure = demanderRessaisie(sc, heure);
        }
        
        System.out.print("Minute : ");
        minute = saisirNbEntier(sc);
        while (minute <= 0 || minute >= 60) {
            minute = demanderRessaisie(sc, minute);
        }
        
        System.out.print("Durée (en minutes) : ");
        duree = saisirNbEntier(sc);
        while (duree <= 0) {
            duree = demanderRessaisie(sc, duree);
        }
  
        creneauSaisi = new CreneauHoraire(jour, heure, minute, duree);
        return creneauSaisi;
    }
	
	private static int demanderRessaisie(Scanner sc, int nombre) {
        System.out.print(nombre + " est une valeur incorrecte."
                       + System.lineSeparator()
                       + "Veuillez refaire votre saisie : ");
        return saisirNbEntier(sc);
    }
	
	@Override
    public String toString() {
        return "CreneauHoraire{" + "jour=" + jour + ", heure=" 
             + heure + ", minute=" + minute + ", duree=" + duree + '}';
    }
	
	
public static void main(String[] args) {
		
		CreneauHoraire c1 = new CreneauHoraire(87, 10, 00, 1);
		CreneauHoraire c2 = new CreneauHoraire(87, 10, 00, 1);
		CreneauHoraire c3 = c1;
		
		if(c1 == c2) System.out.println("égal");
		if(c1.equals(c2)) System.out.println("équivalent");
		
		if(c1 == c3) System.out.println("égal");
		if(c1.equals(c3)) System.out.println("équivalent");
		
		CreneauHoraire c4 = saisirCreneau();
		System.out.println(c4.toString());
	}
}