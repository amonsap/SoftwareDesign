package Task2;

import java.util.ArrayList;
import java.util.Iterator;

public class Prim_composite implements Prim {
	Iterator iterator = null;
	
	ArrayList<Prim> child_components = new ArrayList<Prim>();
	
	public void render() {
		for (Prim prim : child_components) {
			prim.render();}}
	
	public float volume() {
		float total = 0;
		for (Prim prim : child_components) {
			total+=prim.volume();
		}
		return total;
	}

	public void add(Prim graphic) {
		child_components.add(graphic);
	}

	public void remove(Prim graphic) {
		child_components.remove(graphic);
	}
	
	public Iterator createIterator() {
		if (iterator==null) {
		iterator = new CompositeIterator(child_components.iterator());
	}
	
	return iterator;
	
	}
}

