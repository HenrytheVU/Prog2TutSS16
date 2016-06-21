package ws09.aufgabe2;

public class Quader extends Rechteck {
	private double tiefe;

	public Quader(double laenge, double breite, double tiefe) {
		super(laenge, breite);
		this.tiefe = tiefe;
	}

	public double flaeche() {
		return getLaenge() * getBreite() * 2 + getLaenge() * tiefe * 2 + tiefe * getBreite() * 2;
	}

	public double volumen() {
		return getLaenge() * getBreite() * tiefe;
	}

	public void druckeKantenlaengen() {
		System.out.println(4 * (getLaenge() + getBreite() + tiefe));
	}

	public double getTiefe() {
		return this.tiefe;
	}

	@Override
	public String toString() {
		return "Quader [tiefe=" + tiefe + ", flaeche()=" + flaeche() + ", volumen()=" + volumen() + ", getTiefe()="
				+ getTiefe() + ", getLaenge()=" + getLaenge() + ", getBreite()=" + getBreite() + "]";
	}
	

}
