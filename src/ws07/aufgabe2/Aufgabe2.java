package ws07.aufgabe2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Aufgabe2 {

	static HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

	// Str + Shift + O
	public static void main(String[] args) {
		hm.put('A', 2);
		hm.put('B', 2);
		hm.put('C', 2);
		hm.put('D', 3);
		hm.put('E', 3);
		hm.put('F', 3);
		hm.put('G', 4);
		hm.put('H', 4);
		hm.put('I', 4);
		hm.put('J', 5);
		hm.put('K', 5);
		hm.put('L', 5);
		hm.put('M', 6);
		hm.put('N', 6);
		hm.put('O', 6);
		hm.put('P', 7);
		hm.put('Q', 7);
		hm.put('R', 7);
		hm.put('S', 7);
		hm.put('T', 8);
		hm.put('U', 8);
		hm.put('V', 8);
		hm.put('W', 9);
		hm.put('X', 9);
		hm.put('Y', 9);
		hm.put('Z', 9);

		// Standardweg, um Text-File einzulesen
		BufferedReader br = null;
		// Um Stream (BufferedReader) aufzumachen, muss man 'try & catch'
		// aufmachen
		try {

			String sCurrentLine;

			// BufferedReader aufmachen
			// FileReader liest File als Binär
			// BufferedReader liest Binär und übersetzt in String
			br = new BufferedReader(new FileReader("data/input"));

			// Lese zeilenweise bis nichts mehr vorhanden ist
			while ((sCurrentLine = br.readLine()) != null) {

				// sCurrentLine ist unsere aktuelle Zeile
				char[] charArray = sCurrentLine.toCharArray();

				System.out.println(generateOutput(charArray));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String generateOutput(char[] charArray) {
		String result = "";
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if(isAllowedChar(c)) {
				result += hm.get(c);
			} else {
				// hier try-catch einsetzen, damit das Programm weiterläuft, auch wenn Exception geworfen wird
				// Richtig wäre -> throw new IllegalTelefonNumberException(); .Aber man muss das nicht implementieren.
				// Daher nur -> throw Exception("IllegalTelefonNumberException: " +  c);
				try {
					throw new Exception("IllegalTelefonNumberException: " +  c);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	public static boolean isAllowedChar(char c) {
		if (c < 'A' || c > 'Z') {
			return false;
		}
		return true;
	}

}
