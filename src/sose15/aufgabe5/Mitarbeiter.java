package sose15.aufgabe5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

// 5. a)
public class Mitarbeiter implements Serializable {
	private static final long serialVersionUID = 4755542691557183441L;

	private String vorname = null;
	private String nachname = null;
	private int nummer = 0;
	// zu a) Gehalt mit transient markieren, damit ist dieses Element nicht
	// serialisierbar
	private transient int gehalt = 0;

	public Mitarbeiter(String vorname, String nachname, int nummer, int gehalt) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.nummer = nummer;
		this.gehalt = gehalt;
	}

	public int getNummer() {
		return nummer;
	}

	public String toString() {
		return "Nachname: " + nachname + " Vorname: " + vorname + " Personalnummer: " + nummer + " Gehalt: " + gehalt;
	}

	// 5 b)
	public static void legDateiAn() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		Mitarbeiter[] mit = { new Mitarbeiter("Patrick", "Zinßer", 001, 2500), new Mitarbeiter("Jonas", "Klar", 002, 3000),
				new Mitarbeiter("Thomas", "Müller", 003, 4500) };
		try {
			fos = new FileOutputStream("/data/mitarbeiter.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(mit);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// c)
	public static Collection<Mitarbeiter> leseDatei() throws IOException {

		Collection<Mitarbeiter> col = new ArrayList<Mitarbeiter>();
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fis = new FileInputStream("/data/mitarbeiter.dat");
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			while (o != null) {
				col.add((Mitarbeiter) o);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return col;
	}
	
	// d)
	public static void gibCollectionAus(Collection<Mitarbeiter> team){
		for(Mitarbeiter m : team){
			System.out.println(m.toString());
		}
		
	}
	
	// e
	public static Mitarbeiter[] sortiere(Collection<Mitarbeiter> team){
		Mitarbeiter[] liste = team.toArray(new Mitarbeiter[team.size()] );
		Arrays.sort(liste, new VergleichePersonalNummer());		
		return liste;
	}
	
	// f
	public static void main(String[] args) { 
		try {
			legDateiAn(); 
			Collection<Mitarbeiter> collection;
			collection = leseDatei();
			Mitarbeiter[] array = sortiere(collection); 
			gibCollectionAus(Arrays.asList(array)); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 } 

}
