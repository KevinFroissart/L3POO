package TP1;
import TP1.Moteur;
 
public class Moto {
	
	Moteur moteur;
	Phare[] phares;
	Roue[] roues;
	
	public Moto(Moteur moteur, Phare[] phares, Roue[] roues) {
		this.moteur = moteur;
		this.phares = phares;
		this.roues = roues;
	}
	
	public boolean accelerer() {
		boolean pret = true;
		
		System.out.println("La moto vérifie si le moteur est en marche :");
		if(!moteur.demarre) {
			pret = false;
			System.out.println("Le moteur est éteint");
			return pret;
		}
		System.out.println("Le moteur est en marche\nLa moto vérifie si les phares sont allumés :");
		for(Phare phare : phares) {
			if(!phare.allume) {
				pret = false;
				System.out.println("L'un des phares est éteint");
				return pret;
			}
		}
		System.out.println("Les phares sont allumés");
		if(pret) {
			System.out.println("Tout est pret, la moto accélère");
			//Execution
		}
		return pret;
	}
	
	public static void main(String[] args) {
		Moteur moteur = new Moteur();
		Phare[] phares = new Phare[] {new Phare(), new Phare()};
		Roue[] roues = new Roue[] {new Roue(), new Roue()};
		
		moteur.demarrer();
		for(Phare phare : phares) {
			phare.allumer();
		}
		
		Moto m1 = new Moto(moteur, phares, roues);
		
		m1.accelerer();
		
		Moto m2 = m1;
		
		m2.accelerer();
		
	}

}
