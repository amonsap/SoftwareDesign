package Task2;

import java.util.Iterator;

public interface Prim {
	public void render();
	public float volume();
	public void add(Prim graphic);
	public void remove(Prim graphic);
	public Iterator createIterator();
}
