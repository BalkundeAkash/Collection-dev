/*
 PROGRAM 12 — Sort ArrayList Descending
👉 Why used?
Reverse ranking, high-to-low sorting.
👉 Structure:
Collections.sort(list, Collections.reverseOrder());
System.out.println(list);
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverseSorting_12 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(33);
		list.add(51);
		list.add(0);
		list.add(101);

		Collections.sort(list, Collections.reverseOrder());

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);
	}
}
