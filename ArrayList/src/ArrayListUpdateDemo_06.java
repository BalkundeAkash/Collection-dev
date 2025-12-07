/*
 
 Update Element using set()
👉 Thinking:

Replace existing value

Must know index
Structure:
list.set(0, "UpdatedValue"); 
 */

import java.util.ArrayList;

public class ArrayListUpdateDemo_06 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("akash");
		list.add("samidha");
		list.add("Umesh");
		list.add("prena");

		list.set(0, "Balkunde"); // replaced akash with the balkunde

		System.out.println(list);
	}

}
