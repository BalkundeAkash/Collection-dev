//using arraylist because order is maintain reading is fast

import java.util.ArrayList;

public class ArrayListToArrayDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("akash");
		list.add("samidha");
		list.add("Shyam");
		list.add("ram");

		// convert arraylist to -> array
		String[] arr = list.toArray(new String[0]);

		// print array elements

		for (String s : arr) {
			System.out.println(s);
		}
	}
}
