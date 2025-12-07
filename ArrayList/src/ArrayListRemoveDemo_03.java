
/* Remove Element by Index
👉 Thinking:

Know exact index

Direct remove(index)
 * 
 * */

import java.util.ArrayList;

public class ArrayListRemoveDemo_03 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("a");
		list.add("b");
		list.add("c");

		list.remove(2); // remove 2 nd index means 0 a , 1 b , 2 c removed c
		System.out.println(list);
	}
}
