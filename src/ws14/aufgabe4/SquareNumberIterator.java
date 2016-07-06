package ws14.aufgabe4;

import java.util.Iterator;

public class SquareNumberIterator implements Iterator<Integer> {

	long number = 1L;

	@Override
	public boolean hasNext() {
		if (Math.pow(number, 2) <= Integer.MAX_VALUE) {
			return true;
		}
		return false;
	}

	@Override
	public Integer next() {
		return (int) Math.pow(number++, 2);
	}

	public void remove() {
		throw new UnsupportedOperationException("Zahl außerhalb Grenzen");
	}

}
