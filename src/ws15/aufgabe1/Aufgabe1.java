package ws15.aufgabe1;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aufgabe1 {
	
	public static int liesWerteAusIntDatei(String dateiname) {
		int summe = 0;
		try (Scanner sc = new Scanner(new File(dateiname))){
			while(sc.hasNextInt()) {
				summe += sc.nextInt();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return summe;
	}
	
	public static double liesWerteAusSystemIn() {
		System.out.println("Bitte geben Sie double-Werte ein: ");
		Scanner sc = new Scanner(System.in);
		int anzahl = 0;
		double summe = 0;
		try {
			while(sc.hasNextDouble()) {
				summe += sc.nextDouble();
				anzahl++;
			}
			sc.close();
		} catch (Exception e) {
			
		}
		return summe/anzahl;
	}
	
	
	public static double liesWerteAusSystemIn1(){
		System.out.println("Geben Sie bitte double-Werte ein: ");
		double result = 0;
		int counter = 0;
		try (Scanner sc = new Scanner(System.in)){
			while (sc.hasNextDouble()) {
				result += sc.nextDouble();
				counter++;
			}
		} catch (Exception e) {
			
		}
		return result/counter;
	}
	
	

	
	public static void main(String[] args) {
		System.out.println(liesWerteAusSystemIn1());
	}
}
