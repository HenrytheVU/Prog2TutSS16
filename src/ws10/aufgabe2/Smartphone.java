package ws10.aufgabe2;

import java.util.ArrayList;
import java.util.Collections;

public class Smartphone implements Comparable<Smartphone> {

	String name;
	double preis;
	long seriennummer;
	static long lfdSeriennummer = 0;

	static ArrayList<Smartphone> list = new ArrayList<>();

	public Smartphone() {
		this("Kein Name", 0.0);
	}

	public Smartphone(String name, double preis) {
		this.name = name;
		this.preis = preis;
		this.seriennummer = lfdSeriennummer++;
		list.add(this);
	}

	public String toString() {
		return "Name: " + name + " Preis: " + preis + " Seriennummer: " + seriennummer;
	}

	@Override
	public int compareTo(Smartphone o) {
		return (int) (this.seriennummer - o.seriennummer);
	}

	static ArrayList<Smartphone> getAllSmartphones() {
		Collections.sort(list);
		return list;
	}

}
