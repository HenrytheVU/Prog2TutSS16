package ws15.aufgabe4;

import java.util.HashMap;

public class Morse {
	public static String[][] tabelle = { { "A", ".-" }, { "B", "-..." }, { "C", "-.-." }, { "D", "-.." }, { "E", "." }, { "F", "..-." }, { "G", "--." },
			{ "H", "...." }, { "I", ".." }, { "J", ".---" }, { "K", "-.-" }, { "L", ".-.." }, { "M", "--" }, { "N", "-." }, { "O", "---" }, { "P", ".--." },
			{ "Q", "--.-" }, { "R", ".-." }, { "S", "..." }, { "T", "-" }, { "U", "..-" }, { "V", "...-" }, { "W", ".--" }, { "X", "-..-" }, { "Y", "-.--" },
			{ "Z", "--.." } };

	
	
	// a) 6 Punkte
	public static HashMap<String, String> getMorseCodeMap(String[][] table) {
		HashMap<String, String> map = new HashMap<>();

		for (int i = 0; i < table.length; i++) {
			map.put(table[i][0], table[i][1]);
		}

		// for (String[] s : tabelle){
		// map.put(s[0], s[1]);
		// }

		return map;
	}

	// b) 6 Punkte
	public static String zeichenketteToMorse(String s){
		char[] text = s.toUpperCase().toCharArray();
		String result = "";
		HashMap<String,String> map = getMorseCodeMap(tabelle);
		
		for (int i = 0; i < text.length; i++) {
			String code = map.get(Character.toString(text[i]));
			result += code + " ";
		}
		
		return result;
	}

	// c) 4 Punkte
	public static void main(String[] args) {
		// i
		HashMap<String, String> hm = getMorseCodeMap(tabelle);
		
		// ii
		System.out.println(zeichenketteToMorse("Klausurerfolg"));
	}
}
