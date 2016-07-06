package probeklausur.aufgabe2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Konfigurationsleser {

	String dateiname;

	public Konfigurationsleser(String dateiname) {
		this.dateiname = dateiname;
	}

	Map dateiLeser() {
		Map<String, String> map = new HashMap<>();

		try (BufferedReader bf = new BufferedReader(new FileReader(dateiname))) {

			String line;
			while ((line = bf.readLine()) != null) {
				if (!line.isEmpty()) {
					String key = line.split("=")[0];
					String value = line.split("=")[1];
					map.put(key, value);

				}
			}

		} catch (Exception e) {

		}

		return map;
	}
}
