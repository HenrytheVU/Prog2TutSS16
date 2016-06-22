package ss13.Aufgabe2;

import java.util.Arrays;
import java.util.HashMap;

import ss13.Aufgabe1.Geburtstag;

public class Geburtstagsverwaltung {
	
	private HashMap<String, Geburtstag> map;
	
	
	Geburtstagsverwaltung(){
		map = new HashMap<>();
	}
	
	// b)
	public void addGeburtstag(Geburtstag g){
		
		if (!map.containsKey(g.getName())){
			map.put(g.getName(), g);
		}
	}
	
	// c
	public Geburtstag getGeburtstag(String name){
		
		if (map.containsKey(name)){
			return map.get(name);
		} else {
			return null;
		}
	}
	
	// d
	public String[] alleNamenAmGleichenTag(Geburtstag tag){
		String[] result = new String[map.size()];
		int i = 0;
		
		for (Geburtstag t : map.values()){
			if (t.gleicherTag(tag)){
				result[i] = t.getName();
				i++;
			}
		}
		return result;
	}
	
	// e 
	Geburtstag[] alleGeburtstage(){
		return map.values().toArray(new Geburtstag[0]);
	}
	
	// f
	Geburtstag[] alleGeburtstageNachDatum(){
		Geburtstag[] alleGeburtstageSortiert = map.values().toArray(new Geburtstag[0]);
		Arrays.sort(alleGeburtstageSortiert);
		return alleGeburtstageSortiert;
	}
	
	public static void main(String[] args) {
		Geburtstagsverwaltung gw = new Geburtstagsverwaltung();
		gw.addGeburtstag(new Geburtstag());
		gw.addGeburtstag(new Geburtstag("XYZ", 2,2,1990));
		gw.addGeburtstag(new Geburtstag("A", 2,2,1890));
		gw.addGeburtstag(new Geburtstag("b", 2,2,1980));
		
		
		for (Geburtstag g : gw.alleGeburtstage()){
			System.out.println(g);
		}
		
		for (Geburtstag g : gw.alleGeburtstageNachDatum()){
			System.out.println(g);
		}
		
	}

}




