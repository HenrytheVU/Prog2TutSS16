package ss14.Aufgabe1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Finder {

	// a) 5 Punkte
	public BufferedReader GetSystemInAsBufferedReader() {
		return new BufferedReader(new InputStreamReader(System.in));
	}
	
	
	
	

	// b) 15 Punkte
	public void findStringInFiles(String searchString, String[] filenames) {

		for (int i = 0; i < filenames.length; i++) {
			int zeilenNr = 1;

			try {
				BufferedReader br = new BufferedReader(new FileReader(filenames[i]));
				String line = br.readLine();
				
				
				while (line != null) {
					if (line.contains(searchString)) {
						System.out.println("Datei: " + filenames[i] + " Zeile: " + zeilenNr);
					}
					line = br.readLine();
					zeilenNr++;
				}
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
