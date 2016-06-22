package ws14.aufgabe1;

import java.util.Comparator;

public class AktieNachNamenComparator implements Comparator<Aktie> {
	@Override
	public int compare(Aktie a1, Aktie a2) {
		return a1.getName().compareTo(a2.getName());
	}
}
