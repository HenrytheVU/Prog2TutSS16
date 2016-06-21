package ws09.aufgabe1;

public class Praktikum implements Creditpunkte {

	String firma;
	int dauer;
	int credits;

	public Praktikum(String firma, int dauer, int credits) {
		this.firma = firma;
		this.dauer = dauer;
		this.credits = credits;
	}

	@Override
	public int getCredits() {
		return this.credits;
	}
}
