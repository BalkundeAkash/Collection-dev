//using Arraylist  list beacuse order is need and read is faster

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortDesc {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(11);
		list.add(101);
		list.add(51);
		list.add(21);
		list.add(151);
		list.add(201);
		list.add(501);

		Collections.sort(list, Collections.reverseOrder());

		System.out.println(list);
	}
}
