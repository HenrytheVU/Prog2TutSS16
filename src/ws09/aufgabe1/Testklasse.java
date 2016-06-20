package ws09.aufgabe1;

public class Testklasse {

	public static void main(String[] args) {

		Creditpunkte[] array = new Creditpunkte[6];

		array[0] = new Vorlesung("Prog1", 4, 5);
		array[1] = new Praktikum("SSI Schäfer", 40, 25);
		array[2] = new Vorlesung("Prog2", 4, 5);
		array[3] = new Praktikum("Anevis", 20, 25);
		array[4] = new Vorlesung("DatKom", 4, 5);
		array[5] = new Vorlesung("ReWe", 4, 5);

		int gesamtCredits = 0;

		for (int i = 0; i < array.length; i++) {
			gesamtCredits += array[i].getCredits();
		}

		System.out.println(gesamtCredits);

	}
}
