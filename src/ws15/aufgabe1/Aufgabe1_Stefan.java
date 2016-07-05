package ws15.aufgabe1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;


// Mein etwas anderer Lösungsansatz
public class Aufgabe1_Stefan {

	public static void main(String[] args) {
		schreibeIntWerteInDatei("data/werte.int");
		System.out.println(liesWerteAusIntDatei("data/werte.int"));
	}
	
	// Nicht Teil der Aufgabe
	static void schreibeIntWerteInDatei(String dateiname) {
		FileOutputStream fos;
		OutputStreamWriter osw;

		try {
			fos = new FileOutputStream(dateiname);
			osw = new OutputStreamWriter(fos);

			osw.write(3);
			osw.write(4);
			osw.write(5);
			osw.write(8);

			osw.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	// a) 7 Punkte
	static int liesWerteAusIntDatei(String dateiname) {
		int summe = 0;

		FileInputStream fis;
		InputStreamReader isr;

		try {
			fis = new FileInputStream(dateiname);
			isr = new InputStreamReader(fis);

			int currentInt = isr.read();
			while (currentInt != -1) {
				summe += currentInt;
				currentInt = isr.read();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return summe;
	}

	// b) 7 Punkte
	static double liesWerteAusSystemIn() {
		double summe = 0;
		double anzahl = 0;
		double durchschnitt;
		boolean weiter = true;

		try (Scanner sc = new Scanner(System.in)) {

			while (weiter) {

				String s = sc.nextLine();
				double wert = new Double(s);

				summe += wert;
				anzahl++;
			}
		} catch(Exception e){
			e.printStackTrace();
		}

		if (anzahl > 0) {
			durchschnitt = summe / anzahl;
		} else {
			durchschnitt = 0;
		}

		return durchschnitt;
	}

}
