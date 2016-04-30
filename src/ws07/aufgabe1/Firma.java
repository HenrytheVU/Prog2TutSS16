package ws07.aufgabe1;

public class Firma implements Cloneable, Versteuerbar {

	private String name;
	private Firmensitz firmensitz;
	private float umsatz;
	private float gewinn;

	public Firma(String name, Firmensitz firmensitz, float umsatz, float gewinn) {
		this.name = name;
		this.firmensitz = firmensitz;
		this.umsatz = umsatz;
		this.gewinn = gewinn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Firmensitz getFirmensitz() {
		return firmensitz;
	}

	public void setFirmensitz(Firmensitz firmensitz) {
		this.firmensitz = firmensitz;
	}

	public float getUmsatz() {
		return umsatz;
	}

	public void setUmsatz(float umsatz) {
		this.umsatz = umsatz;
	}

	public float getGewinn() {
		return gewinn;
	}

	public void setGewinn(float gewinn) {
		this.gewinn = gewinn;
	}

	// WTF???
	public Firma(Firma firma) {
		this.name = firma.name;
		this.firmensitz = firma.firmensitz;
		this.gewinn = firma.gewinn;
		this.umsatz = firma.umsatz;
	}

	@Override
	public float calcSteuerschuld() {
		return 0.15f * gewinn;
	}

	@Override
	public float calcSteuermaessigung() {
		if (gewinn < 100000) {
			return 0.2f * calcSteuermaessigung();
		}
		return 0;
	}
	
	// WTF???
	public Firma clone() {
		return new Firma(this);
	}

	@Override
	public String toString() {
		return "Firma [name=" + name + ", firmensitz=" + firmensitz + ", umsatz=" + umsatz + ", gewinn=" + gewinn + "]";
	}
}
