package ws07.aufgabe1;

public class Testklasse {

	public static void main(String[] args) {
		Versteuerbar[] array = new Versteuerbar[5];

		array[0] = new Person("Ina", 20, false, 8200);
		array[1] = new Firma("X GmbH", new Firmensitz("Würzburg", "GmbH"), 20000000, 2000000);
		
		// To be continued
//		array[2] = ((Firma) array[1]).clone();
//		((Firma) array[2]).setName("Y");
//		((Firma) array[2]).setGewinn(100000);
	}
}
