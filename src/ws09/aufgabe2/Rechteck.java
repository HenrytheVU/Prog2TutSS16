package ws09.aufgabe2;

public class Rechteck {

	private double laenge, breite;

	public Rechteck() {
		this.laenge = 1.0;
		this.breite = 1.0;
	}

	public Rechteck(double laenge, double breite) {
		this.laenge = laenge;
		this.breite = breite;
	}

	public double flaeche() {
		return laenge * breite;
	}

	public void druckeKantenlaengen() {
		System.out.println(2 * laenge + 2 * breite);
	}

	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		this.breite = breite;
	}

	@Override
	public String toString() {
		return "Rechteck [laenge=" + laenge + ", breite=" + breite + ", flaeche()=" + flaeche() + ", getLaenge()="
				+ getLaenge() + ", getBreite()=" + getBreite() + "]";
	}

}
