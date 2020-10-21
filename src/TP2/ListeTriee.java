package TP2;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings("serial")
public class ListeTriee<E> extends ArrayList<Comparable<E>>{

	public void verifInstance(Object o) {
		if(!(o instanceof Comparable)) throw new IllegalArgumentException("L'objet doit implémenter Comparable");
	}
	
	@SuppressWarnings("rawtypes")
	public void verifInstanceCollection(Collection c) {
		for(Object o : c) {
			verifInstance(o);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean add(Comparable<E> e) {
		int i;
		for(i = 0; i < this.size() && e.compareTo((E) this.get(i)) > 0; i++) {}
		super.add(i, e);
		return true;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean addAll(Collection c) {
				
		for(Object element : c) {
			Comparable<E> elem = (Comparable<E>) element;
			this.add(elem);
		}
		return true;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
    public boolean addAll(int index, Collection c) {
        return this.addAll(c);
    }
    
    @Override
    public void add(int index, Comparable<E> element) {
        this.add(element);
    }
}
