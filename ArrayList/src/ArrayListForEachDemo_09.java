/*
 Iterate using For-Each Loop
👉 Structure:
for(String s : list) {
    System.out.println(s);
}
 */

import java.util.ArrayList;

public class ArrayListForEachDemo_09 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(11);
		list.add(21);
		list.add(51);
		list.add(101);
		list.add(151);
		list.add(201);

		System.out.println("For each Loop after" + list);
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println("List Containg the 11 " + list);

		System.out.println("--- Removing 11 if present ---");
		list.remove(Integer.valueOf(11));

		System.out.println("Before removing the Value 11");
		System.out.println(list);
		

	}
}
