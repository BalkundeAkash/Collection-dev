//// Using ArrayList because order is needed and read is faster.

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortAsc {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(151);
		list.add(101);
		list.add(51);
		list.add(11);
		list.add(21);

		Collections.sort(list);

		System.out.println(list);
	}
}
