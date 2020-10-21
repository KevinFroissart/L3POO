package TP2;

public class CreneauHoraireComparable extends CreneauHoraire implements Comparable<CreneauHoraireComparable>{

	public CreneauHoraireComparable(int jour, int heure, int debMinute, int dureeMinure) {
		super(jour, heure, debMinute, dureeMinure);
	}

	@Override
	public int compareTo(CreneauHoraireComparable o) {
		if(this == o) return 0;
		if(o == null) throw new NullPointerException();
		if(this.getClass() != o.getClass()) throw new ClassCastException();
		return this.duree < o.duree ? -1 : this.duree == o.duree ? 0 : 1;
	}
}