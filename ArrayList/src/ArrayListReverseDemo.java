// using arraylist because order is maintained and read is fast

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverseDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(23);
		list.add(54);
		list.add(77);
		list.add(12);
		list.add(76);
		list.add(323);

		Collections.sort(list, Collections.reverseOrder());

		System.out.println(list);

	}
}
