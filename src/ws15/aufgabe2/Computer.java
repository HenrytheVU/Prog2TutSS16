package ws15.aufgabe2;

public class Computer implements HatKosten {
	String name;
	double kosten;
	String prozessor;

	public Computer(String name, double kosten, String prozessor) {
		this.name = name;
		this.kosten = kosten;
		this.prozessor = prozessor;
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
