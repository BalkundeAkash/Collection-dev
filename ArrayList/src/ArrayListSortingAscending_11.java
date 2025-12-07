/*
 PROGRAM 11 — Sort ArrayList Ascending
👉 Why used?
Frequently used in product sorting, ranking, filtering.
👉 Structure:
Collections.sort(list);
System.out.println(list);

 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListSortingAscending_11 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(101);
		list.add(151);
		list.add(11);
		list.add(51);
		list.add(21);

		System.out.println("After the Sorting : " + list);

		// Sort ascending
		Collections.sort(list);

		System.out.println("Sorted ascending" + list);
		
		
		
	}
}
