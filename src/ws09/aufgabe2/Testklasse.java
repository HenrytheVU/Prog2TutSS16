package ws09.aufgabe2;

public class Testklasse {

	public static void main(String[] args) {
		Rechteck[] array = new Rechteck[6];

		array[0] = new Rechteck(1.0, 2.0);
		array[1] = new Quader(23.0, 2.0, 45);
		array[2] = new Rechteck(1.0, 2.0);
		array[3] = new Quader(102.0, 22.0, 4);
		array[4] = new Rechteck(91.0, 12.0);
		array[5] = new Quader(16.0, 2.0, 3.0);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
		}
		

	}
}
