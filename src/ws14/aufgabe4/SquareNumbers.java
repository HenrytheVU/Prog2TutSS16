package ws14.aufgabe4;

import java.util.Iterator;

public class SquareNumbers implements Iterable<Integer> {
	public Iterator<Integer> iterator() {
		return new SquareNumberIterator();
	}

	public static void main(String[] args) {
		SquareNumbers listOfSquares = new SquareNumbers();
		for (Integer i : listOfSquares) {
			System.out.println(i);
		}
	}
}