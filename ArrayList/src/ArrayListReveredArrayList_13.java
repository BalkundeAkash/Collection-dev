/* 
 PROGRAM 13 — Reverse ArrayList (Most Asked)
👉 Why used?
For reversing UI lists, logs, history, etc.
👉 Structure:
Collections.reverse(list);
System.out.println(list);
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReveredArrayList_13 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		// For reversing UI lists, logs, history, etc.
		list.add(11);
		list.add(21);
		list.add(51);
		list.add(101);
		list.add(151);
		list.add(201);

		Collections.reverse(list);

		System.out.println(list);

	}
}
