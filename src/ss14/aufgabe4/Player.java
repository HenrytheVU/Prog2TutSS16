package ss14.aufgabe4;

import java.util.Date;

public class Player implements Comparable<Player> {
	// Instanzvariable
	Date geburtstag;
	String name;
	int numGoals = 0;

	// Konstruktor
	public Player(String name) {
		this.name = name;
		geburtstag = new Date();
	}

	// Getter
	public String getName() {
		return name;
	}

	public int getGoals() {
		return numGoals;
	}

	// Tor!!!
	public void score() {
		numGoals++;
	}

	public String toString() {
		return "Spieler: " + this.name + ", Tore: " + this.numGoals + ", Geb.:"+this.geburtstag;
	}

	@Override
	public int compareTo(Player o) {
		// 
		return this.geburtstag.compareTo(o.geburtstag);
	}

}
