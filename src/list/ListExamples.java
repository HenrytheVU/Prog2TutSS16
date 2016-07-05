package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExamples {

	
	public static void main(String[] args) {
		
		
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		List<String> list2 = Arrays.asList("A", "C", "D");
		
		list1.retainAll(list2);
		System.out.println(list1);
	}
}
