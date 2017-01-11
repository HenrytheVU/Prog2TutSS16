package ws10.aufgabe2;

public class SmartphoneTest {

	public static void main(String[] args) {
		Smartphone s1 = new Smartphone("A", 1.2);
		Smartphone s2 = new Smartphone("B", 1.2);
		Smartphone s3 = new Smartphone("C", 1.2);
		Smartphone s4 = new Smartphone("D", 1.2);
		Smartphone s5 = new Smartphone("E", 1.2);

		Smartphone.getAllSmartphones().stream().forEach(phone -> System.out.println(phone));

	}
}
