package ws07.aufgabe1;

public class Firmensitz {

	private String ort;
	private String rechtsform;

	public Firmensitz(String ort, String rechtsform) {
		this.ort = ort;
		this.rechtsform = rechtsform;
	}

	public Object clone() {
		return this;
	}

	public String getOrt() {
		return this.ort;
	}

	public String getRechtsform() {
		return this.rechtsform;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public void setRechtsform(String rechtsform) {
		this.rechtsform = rechtsform;
	}

	@Override
	public String toString() {
		return "Firmensitz [ort=" + ort + ", rechtsform=" + rechtsform + "]";
	}
}
