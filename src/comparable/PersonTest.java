package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("Henry", 27, 128.9, 121.4);
		Person p2 = new Person("Shuti", 66, 199.9, 13.4);
		Person p3 = new Person("Klaus", 51, 90.9, 66.4);

		ArrayList<Person> list = new ArrayList<>();

		list.add(p1);
		list.add(p2);
		list.add(p3);

		// nur compareTo() innerhalb der Person Klasse benutzen
		Collections.sort(list);

		// nach eigenem Comparator sortieren
		list.sort(new PersonHeightComparator());
		Collections.sort(list, new PersonHeightComparator());

		// nach Name sortieren
		list.sort(new PersonNameComparator());
		Collections.sort(list, new PersonNameComparator());
	}
}
