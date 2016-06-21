package ws10.aufgabe3;

import java.util.HashMap;

public class Notenverzeichnis {

	String nameStudent_ref;
	HashMap<String, Float> table_ref = new HashMap<>();

	void add(String fach_ref, float note) {
		table_ref.put(fach_ref, note);
	}

	float getNote(String fach_ref) {
		return table_ref.get(fach_ref);
	}

	float getNotendurchschnitt() {
		float summe = 0;
		for (float note : table_ref.values()) {
			summe += note;
		}
		return summe / table_ref.size();
	}
}
