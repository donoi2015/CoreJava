package headfirstdp.headfirst.composite.menuiterator;
 
import java.util.Iterator;
  
class NullIterator implements Iterator {
   
	public Object next() {
		return null;
	}
  
	public boolean hasNext() {
		return false;
	}
   
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
