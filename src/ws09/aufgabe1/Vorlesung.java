package ws09.aufgabe1;

public class Vorlesung implements Creditpunkte {

	String name;
	int semesterwochenstunden;
	int credits;

	public Vorlesung(String name, int semesterwochenstunden, int credits) {
		this.name = name;
		this.semesterwochenstunden = semesterwochenstunden;
		this.credits = credits;
	}

	@Override
	public int getCredits() {
		return this.credits;
	}

}
