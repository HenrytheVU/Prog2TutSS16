package ws14.aufgabe1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Aktiedepot {

	HashMap<String, Aktie> map = new HashMap<>();

	// Standardkonstruktor
	public Aktiedepot() {
	}

	// b) 4p
	void bucheAktieEin(Aktie a) {
		if (!map.containsKey(a.getName())) {
			map.put(a.getName(), a);
		}
	}

	// c) 3p
	Aktie leseAktieAus(String name) {
		return map.get(name);
	}

	// d) 6p
	Aktie[] alleAktien() {
		return map.values().toArray(new Aktie[0]);
	}

	// e) 7p
	Aktie[] alleAktienNachNamen() {
		ArrayList<Aktie> list = new ArrayList<>(map.values());
		list.sort(new AktieNachNamenComparator());
		// Collections.sort(list, new AktieNachNamenComparator());
		return list.toArray(new Aktie[0]);
	}

	// f) 7p
	Aktie[] alleAktienNachWert() {
		ArrayList<Aktie> list = new ArrayList<>(map.values());
		list.sort(new AktieNachWertComparator());
		return list.toArray(new Aktie[0]);
	}

}
