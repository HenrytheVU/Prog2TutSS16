package ss15.aufgabe5;

import java.util.Comparator;

public class VergleichePersonalNummer implements Comparator<Mitarbeiter> {

	@Override
	public int compare(Mitarbeiter arg0, Mitarbeiter arg1) {
		// TODO Auto-generated method stub
		return arg0.getNummer() - arg1.getNummer();
	}

}
