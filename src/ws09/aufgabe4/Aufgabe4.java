package ws09.aufgabe4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen double-Wert ein oder exit");

		String input;
		BufferedWriter bw = new BufferedWriter(new FileWriter("data/werte.double"));

		while (!"exit".equals(input = sc.nextLine())) {
			bw.write(input +"\n");
		}
		bw.close();
		sc.close();
	}
}
