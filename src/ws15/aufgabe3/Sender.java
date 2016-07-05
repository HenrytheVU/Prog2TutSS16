package ws15.aufgabe3;

public class Sender {

	String name;
	int kanalNr;

	public Sender(String name, int kanalNr) {
		this.kanalNr = kanalNr;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKanalNr() {
		return kanalNr;
	}

	public void setKanalNr(int kanalNr) {
		this.kanalNr = kanalNr;
	}

	@Override
	public String toString() {
		return "Sender [name=" + name + ", kanalNr=" + kanalNr + "]";
	}

}
