package ws09.aufgabe3;

import java.util.HashMap;

public class Person {

	public String lastname;
	public String firstname;
	public int age;

	public Person(String lastname, String firstname, int age) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.age = age;
	}

	public static HashMap getPersonTable() {
		HashMap map = new HashMap<>();
		return map;
	}

	public static HashMap<String, Person> getPersonTableSP() {
		HashMap<String, Person> map = new HashMap<>();
		
		map.put("Vu", new Person("Vu", "Henry", 17));
		map.put("Hassel", new Person("Hassel", "Stefan", 9));
		map.put("Fiech", new Person("Fiech", "Mike", 99));
		
		return map;
	}

	// Ab hier fängt die Aufgabe an
	public static Person[] search(String[] nachnamen) {
		Person[] result = new Person[nachnamen.length];

		HashMap<String, Person> map = getPersonTableSP();

		for (int i = 0; i < nachnamen.length; i++) {
			result[i] = map.get(nachnamen[i]);
		}
		return result;
	}

	@Override
	public String toString() {
		return "Person [lastname=" + lastname + ", firstname=" + firstname + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		String[] nachnamen = {"Vu", "Hassel", "JOJO"};
		Person[] personen = search(nachnamen);
		for (int i = 0; i < personen.length; i++) {
			System.out.println(personen[i]);
		}
	}

}
