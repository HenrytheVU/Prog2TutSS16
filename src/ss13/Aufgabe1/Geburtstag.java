package ss13.Aufgabe1;

public class Geburtstag {
	private String name;
	private int tag;
	private int monat;
	private int jahr;

	public Geburtstag() {
		this("Max Mustermann", 1, 1, 1970);
		// this.name = "Max Mustermann";
		// tag = 1;
		// monat = 1;
		// jahr = 1970;
	}

	public Geburtstag(String name, int tag, int monat, int jahr) {
		this.name = name;
		this.tag = tag;
		this.monat = monat;
		this.jahr = jahr;
	}

	// a)
	public String getName() {
		return name;
	}

	public int getTag() {
		return tag;
	}

	public int getMonat() {
		return monat;
	}

	public int getJahr() {
		return jahr;
	}
	
	// b)
	public String toString() {
		return "Geburtstag von " + name + " am " + tag + "." + monat + "." + jahr;
	}

}
