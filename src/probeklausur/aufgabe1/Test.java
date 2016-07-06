package probeklausur.aufgabe1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Bruch> list = new ArrayList<>();
		list.add(new Bruch(1, 4));
		list.add(new Bruch(2, 3));
		list.add(new Bruch(1, 8));
		list.add(new Bruch(4, 17));
		list.add(new Bruch(-4, 5));
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}
