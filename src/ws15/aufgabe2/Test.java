package ws15.aufgabe2;

public class Test {

	public static void main(String[] args) {
		HatKosten[] array = new HatKosten[6];
		
		array[0] = new Computer("Apple", 2000, "i7");
		array[1] = new Computer("Dell", 600, "i5");
		array[2] = new Computer("Samsung", 800, "i5");
		array[3] = new Auto("iCar", 100000, 9000);
		array[4] = new Auto("Tesla", 120000, 6000);
		
		for (HatKosten o : array) {
			if (o != null) {
				System.out.println("Name: " + o.getName() + " Kosten: " + o.getKosten());
			}
		}
	}

}
