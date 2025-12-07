import java.util.LinkedList;

/**
 * Add Element at Specific Index 👉 Thinking: want to place item in between use
 * add(index, value)
 */

public class LinkedListAddDemo_02 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("a");
		list.add("B");
		list.add("c");
		list.add("d");

		list.add(2, "akash");
		list.remove("akash");

		System.out.println(list);
	}

}
