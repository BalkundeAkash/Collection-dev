/*Create ArrayList & Add Elements

👉 Thinking:
	Which datatype?
	How many elements?
	Order required? Yes.
 * */

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListDemo_01 {

	public static void main(String[] args) {

		// Using ArrayList because order needed & read faster

		ArrayList<String> list = new ArrayList<>();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		System.out.println(list);
	}
}
