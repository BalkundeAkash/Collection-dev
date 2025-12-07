/* 
 Search Element using contains()
👉 Thinking:

returns true/false
common interview question

👉 Structure:
if(list.contains("A")) {
    System.out.println("Found");
}
 */

import java.util.ArrayList;

public class ArrayListSearchDemo_05 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("akash");
		list.add("Samidha");
		list.add("Akash");
		list.add("umesh");

		if (list.contains("akash")) {
			System.out.println("Found" + list);
		}

		System.out.println(list);

	}

}
