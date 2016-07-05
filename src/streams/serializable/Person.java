package streams.serializable;

import java.io.Serializable;

// serializable bedeutet, dass ein Objekt der Klasse Person in einem Stream verschickt werden kann.
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -728373239442194896L;
	
	private String vorname;
	private String nachname;
	
	// Steuer ID soll nicht in der Datei gespeichert werden!
	private transient String steuerID;
	
	
	public Person(String vorname, String nachname, String id) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.steuerID = id;
		
	}


	public String getSteuerID() {
		return steuerID;
	}


	public String getVorname() {
		return vorname;
	}


	public void setVorname(String vorname) {
		this.vorname = vorname;
	}


	public String getNachname() {
		return nachname;
	}


	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

}
