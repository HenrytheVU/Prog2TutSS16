package probeklausur.aufgabe1;

public class Bruch implements Comparable<Bruch> {

	int zaehler;
	int nenner;

	public Bruch(int zaehler, int nenner) throws ArithmeticException {
		if (nenner == 0) {
			throw new ArithmeticException("Nenner darf nicht null sein!");
		}
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	public Bruch(int wert) {
		this(wert, 1);
	}

	public Bruch() {
		this(0);
	}

	public String toString() {
		return zaehler + "/" + nenner;
	}

	@Override
	public int compareTo(Bruch o) {
		int wert1 = zaehler * o.nenner;
		int wert2 = o.zaehler * nenner;
		return wert1 - wert2;
	}

}
