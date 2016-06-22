package ws14.aufgabe1;

import java.util.Comparator;

public class AktieNachWertComparator implements Comparator<Aktie> {
	@Override
	public int compare(Aktie a1, Aktie a2) {
		return (int) (a1.wert() - a2.wert());
	}
}
