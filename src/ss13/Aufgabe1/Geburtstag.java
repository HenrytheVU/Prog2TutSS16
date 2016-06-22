package ss13.Aufgabe1;

public class Geburtstag implements Comparable<Geburtstag> {
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

	// c
	public boolean gleicherTag(Geburtstag g) {
		if (g.getTag() == this.tag && g.getMonat() == this.monat) {
			return true;
		} else {
			return false;
		}
	}
	
	public int compareTo(Geburtstag o){
		int myDay = this.jahr*10000 + this.monat*100+ this.tag;
		int oDay = o.getJahr()*10000 + o.getMonat()*100 + o.getTag();
		return myDay - oDay;
	}

//	@Override
//	public int compareTo(Geburtstag o) {
//		if (this.jahr == o.getJahr()) {
//
//			if (this.monat == o.getMonat()) {
//				return this.tag - o.getTag();
//			} else {
//				return this.monat - o.getMonat();
//			}
//
//		} else {
//			return this.jahr - o.getJahr();
//		}
//	}

}
