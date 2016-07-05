package ws15.aufgabe2;

public class Auto implements HatKosten {

	String name;
	double kosten;
	int hubraum;

	public Auto(String name, double kosten, int hubraum) {
		this.name = name;
		this.kosten = kosten;
		this.hubraum = hubraum;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getKosten() {
		return this.kosten;
	}

}
