package Task2;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
	Stack stack = new Stack();
	
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
	
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		}
		else {
			Iterator iterator = (Iterator) stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			}
			else {
				return true;
			}
		}
	}
	
	public Prim next() {
		if (hasNext()) {
			Iterator iterator = (Iterator) stack.peek();
			Prim prim = (Prim) iterator.next();
				if (prim instanceof Prim_composite) {
					stack.push(prim.createIterator());
				}
			return prim;
		} else {
			return null;
		}
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}

}